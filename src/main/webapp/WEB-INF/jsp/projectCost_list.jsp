<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<table class="easyui-datagrid" id="projectCostList" title="项目成本列表" data-options="singleSelect:false,collapsible:true,
	pagination:true,rownumbers:true,url:'projectCost/list',method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_projectCost">
    <thead>
        <tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'projectMain.mainName',width:30,align:'center'">项目名称</th>
			<th data-options="field:'costId',width:30,align:'center'">流水号</th>
			<th data-options="field:'costExpect',width:30,align:'center'">预计成本</th>
			<th data-options="field:'costFact',width:30,align:'center'">实际成本</th>
        </tr>
    </thead>
</table> 

<div  id="toolbar_projectCost" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='order:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="projectCost_add()">新增</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="projectCost_edit()">编辑</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="projectCost_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="projectCost_reload()">刷新</a>  
	</div>  
</div>  
<div id="projectCostEditWindow" class="easyui-window" title="编辑项目成本" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'projectCost/edit'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="projectCostAddWindow" class="easyui-window" title="添加项目成本" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'projectCost/add'" style="width:65%;height:80%;padding:10px;">
</div>
<script>

	var orderNoteEditor ;
	
	var orderProductEditor;
	
	var orderCustomEditor;
	
	
	


	//根据index拿到该行值
	function onProjectCostClickRow(index) {
		var rows = $('#projectCostList').datagrid('getRows');
		return rows[index];
		
	}
	
	
	
	
	
	
	
	
	
    
	
	
	
	
	
	
    function getOrderSelectionsIds(){
    	var projectCostList = $("#projectCostList");
    	var sels = projectCostList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].projectCostId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    
    function projectCost_add(){
    	$.get("order/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#projectCostAddWindow").window("open");
       		}
       	});
    }
    
    function projectCost_edit(){
    	$.get("order/edit_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			var ids = getOrderSelectionsIds();
               	
               	if(ids.length == 0){
               		$.messager.alert('提示','必须选择一个项目成本才能编辑!');
               		return ;
               	}
               	if(ids.indexOf(',') > 0){
               		$.messager.alert('提示','只能选择一个项目成本!');
               		return ;
               	}
               	
               	$("#projectCostEditWindow").window({
               		onLoad :function(){
               			//回显数据
               			var data = $("#projectCostList").datagrid("getSelections")[0];
               			orderEditEditor.html(data.projectCostText);
               			
               		
               			
               			//加载文件上传插件
               			initOrderEditFileUpload();
               			//加载上传过的文件
               			initUploadedFile();
               		}
               	}).window("open");
       		}
       	});
    }
    
    function projectCost_delete(){
    	$.get("order/delete_judge",'',function(data){
      		if(data.msg != null){
      			$.messager.alert('提示', data.msg);
      		}else{
      			var ids = getOrderSelectionsIds();
              	if(ids.length == 0){
              		$.messager.alert('提示','未选中项目成本!');
              		return ;
              	}
              	$.messager.confirm('确认','确定删除ID为 '+ids+' 的项目成本吗？',function(r){
              	    if (r){
              	    	var params = {"ids":ids};
                      	$.post("projectCost/delete_batch",params, function(data){
                  			if(data.status == 200){
                  				$.messager.alert('提示','删除项目成本成功!',undefined,function(){
                  					$("#projectCostList").datagrid("reload");
                  				});
                  			}
                  		});
              	    }
              	});
      		}
      	});
    }
    
    function projectCost_reload(){
    	$("#projectCostList").datagrid("reload");
    }
</script>