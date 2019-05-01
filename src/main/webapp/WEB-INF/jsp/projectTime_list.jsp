<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<table class="easyui-datagrid" id="projectTimeList" title="项目时间列表" data-options="singleSelect:false,collapsible:true,
	pagination:true,rownumbers:true,url:'projectTime/list',method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_projectTime">
    <thead>
        <tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'projectMain.mainName',width:30,align:'center'">项目名称</th>
			<th data-options="field:'projectMain.mainStart',width:30,align:'center',formatter:TAOTAO.formatDateTime">项目计划开始时间</th>
			<th data-options="field:'projectMain.mainEnd',width:30,align:'center',formatter:TAOTAO.formatDateTime">项目计划结束时间</th>
			<th data-options="field:'timeStart',width:30,align:'center',formatter:TAOTAO.formatDateTime">项目实际开始时间</th>
			<th data-options="field:'timeEnd',width:30,align:'center',formatter:TAOTAO.formatDateTime">项目实际结束时间</th>
        </tr>
    </thead>
</table> 

<div  id="toolbar_projectTime" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='order:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="projectTime_add()">新增</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="projectTime_edit()">编辑</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="projectTime_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="projectTime_reload()">刷新</a>  
	</div>  
</div>  
<div id="projectTimeEditWindow" class="easyui-window" title="编辑项目时间" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'projectTime/edit'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="projectTimeAddWindow" class="easyui-window" title="添加项目时间" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'projectTime/add'" style="width:65%;height:80%;padding:10px;">
</div>
<script>

	var orderNoteEditor ;
	
	var orderProductEditor;
	
	var orderCustomEditor;
	
	
	


	//根据index拿到该行值
	function onProjectTimeClickRow(index) {
		var rows = $('#projectTimeList').datagrid('getRows');
		return rows[index];
		
	}
	
	
	
	
	
	
	
	
	
    
	
	
	
	
	
	
    function getOrderSelectionsIds(){
    	var projectTimeList = $("#projectTimeList");
    	var sels = projectTimeList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].projectTimeId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    
    function projectTime_add(){
    	$.get("order/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#projectTimeAddWindow").window("open");
       		}
       	});
    }
    
    function projectTime_edit(){
    	$.get("order/edit_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			var ids = getOrderSelectionsIds();
               	
               	if(ids.length == 0){
               		$.messager.alert('提示','必须选择一个项目时间才能编辑!');
               		return ;
               	}
               	if(ids.indexOf(',') > 0){
               		$.messager.alert('提示','只能选择一个项目时间!');
               		return ;
               	}
               	
               	$("#projectTimeEditWindow").window({
               		onLoad :function(){
               			//回显数据
               			var data = $("#projectTimeList").datagrid("getSelections")[0];
               			data.timeStart = TAOTAO.formatDateTime(data.timeStart);
               			data.timeEnd = TAOTAO.formatDateTime(data.timeEnd);
               			$("#projectTimeEditForm").form("load", data);
               			orderEditEditor.html(data.projectTimeText);
               			
               		
               			
               			//加载文件上传插件
               			initOrderEditFileUpload();
               			//加载上传过的文件
               			initUploadedFile();
               		}
               	}).window("open");
       		}
       	});
    }
    
    function projectTime_delete(){
    	$.get("order/delete_judge",'',function(data){
      		if(data.msg != null){
      			$.messager.alert('提示', data.msg);
      		}else{
      			var ids = getOrderSelectionsIds();
              	if(ids.length == 0){
              		$.messager.alert('提示','未选中项目时间!');
              		return ;
              	}
              	$.messager.confirm('确认','确定删除ID为 '+ids+' 的项目时间吗？',function(r){
              	    if (r){
              	    	var params = {"ids":ids};
                      	$.post("projectTime/delete_batch",params, function(data){
                  			if(data.status == 200){
                  				$.messager.alert('提示','删除项目时间成功!',undefined,function(){
                  					$("#projectTimeList").datagrid("reload");
                  				});
                  			}
                  		});
              	    }
              	});
      		}
      	});
    }
    
    function projectTime_reload(){
    	$("#projectTimeList").datagrid("reload");
    }
</script>