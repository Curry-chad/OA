<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<table class="easyui-datagrid" id="workList" title="讨论列表" data-options="singleSelect:false,collapsible:true,
	pagination:true,rownumbers:true,url:'forumWork/list',method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_work">
    <thead>
        <tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<!-- <th data-options="field:'workId',align:'center',width:100">讨论编号</th> -->
			<th data-options="field:'employee',align:'center',width:10,formatter:formatEmployee">讨论人</th>
			<th data-options="field:'workText',align:'center',width:100">讨论内容</th>
			<th data-options="field:'workDate',width:20,align:'center',formatter:TAOTAO.formatDateTime">讨论日期</th>
        </tr>
    </thead>
</table> 

<div  id="toolbar_work" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='order:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="work_add()">新增</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="work_edit()">编辑</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="work_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="work_reload()">刷新</a>  
	</div>  
	
    <div id="search_order" style="float: right;">
        <input id="search_text_order" class="easyui-searchbox"  
            data-options="searcher:doSearch_order,prompt:'请输入...',menu:'#menu_order'"  
            style="width:250px;vertical-align: middle;">
        </input>
        <div id="menu_order" style="width:120px"> 
			<div data-options="name:'workId'">讨论编号</div> 
			<div data-options="name:'workText'">讨论内容</div>
		</div>     
    </div>  
</div>  
<div id="workEditWindow" class="easyui-window" title="编辑讨论" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'forumWork/edit'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="workAddWindow" class="easyui-window" title="添加讨论" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'forumWork/add'" style="width:65%;height:80%;padding:10px;">
</div>
<script>
function doSearch_order(value,name){ //用户输入用户名,点击搜素,触发此函数  
	if(value == null || value == ''){
		
		$("#workList").datagrid({
	        title:'讨论列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, method:'get',
			nowrap:true, toolbar:"toolbar_work", url:'forumWork/list', method:'get', loadMsg:'数据加载中......',
			fitColumns:true,//允许表格自动缩放,以适应父容器
	        columns : [ [ 
				{field : 'ck', checkbox:true },
				//{field : 'workId', width : 100, align:'center', title : '讨论编号'},
				{field : 'employee', width : 10, align : 'center', title : '讨论人',formatter:formatEmployee},
				{field : 'workText', width : 100, align : 'center', title : '讨论内容'},
				{field : 'workDate', width : 20, title : '讨论日期', align:'center', formatter:TAOTAO.formatDateTime}
	        ] ],  
	    });
	}else{
		$("#workList").datagrid({  
	        title:'讨论列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, method:'get',
			nowrap:true, toolbar:"toolbar_work", url:'forumWork/search_work_by_'+name+'?searchValue='+encodeURI(encodeURI(value)),
			loadMsg:'数据加载中......', fitColumns:true,//允许表格自动缩放,以适应父容器
	        columns : [ [ 
	        	{field : 'ck', checkbox:true },
				//{field : 'workId', width : 100, align:'center', title : '讨论编号'},
				{field : 'employee', width : 10, align : 'center', title : '讨论人',formatter:formatEmployee},
				{field : 'workText', width : 100, align : 'center', title : '讨论内容'},
				{field : 'workDate', width : 20, title : '讨论日期', align:'center', formatter:TAOTAO.formatDateTime}
	        ] ],  
	    });
	}
}
	var orderNoteEditor ;
	
	var orderProductEditor;
	
	var orderCustomEditor;
	
	
	//格式化上传人信息
	function formatEmployee(value, row, index){ 
		if(value !=null && value != ''){
			
			return value.empName;
		}else{
			return "无";
		}
	};  
	
	
	//格式化讨论要求
	function formatOrderNote(value, row, index){ 
		if(value !=null && value != ''){
			return "<a href=javascript:openWorkNote("+index+")>"+"讨论备注"+"</a>";
		}else{
			return "无";
		}
	}

	//根据index拿到该行值
	function onWorkClickRow(index) {
		var rows = $('#workList').datagrid('getRows');
		return rows[index];
		
	}
	
	
	
	function submitOrderCustomEditForm(){
		$.get("custom/edit_judge",'',function(data){
    		if(data.msg != null){
    			$.messager.alert('提示', data.msg);
    		}else{
    			if(!$('#orderCustomEditForm').form('validate')){
    				$.messager.alert('提示','表单还未填写完成!');
    				return ;
    			}
    			//同步文本框中的备注
    			orderCustomEditor.sync();
    			$.post("custom/update_all",$("#orderCustomEditForm").serialize(), function(data){
    				if(data.status == 200){
    					$.messager.alert('提示','修改客户成功!','info',function(){
    						$("#orderCustomInfo").dialog("close");
    						$("#workList").datagrid("reload");
    					});
    				}else{
    					$.messager.alert('提示',data.msg);
    				}
    			});
    		}
    	});
	}
	
	
	
	
	
    function clearManuSpan(){
		$("#orderProductPic").html('');
	}
    
	function submitOrderProductEditForm(){
		$.get("product/edit_judge",'',function(data){
    		if(data.msg != null){
    			$.messager.alert('提示', data.msg);
    		}else{
    			if(!$('#orderProductEditForm').form('validate')){
    				$.messager.alert('提示','表单还未填写完成!');
    				return ;
    			}
    			orderProductEditor.sync();
    			
    			$.post("product/update_all",$("#orderProductEditForm").serialize(), function(data){
    				if(data.status == 200){
    					$.messager.alert('提示','修改产品成功!','info',function(){
    						$("#orderProductInfo").dialog("close");
    						$("#workList").datagrid("reload");
    					});
    				}else{
    					$.messager.alert('提示',data.msg);
    				}
    			});
    		}
    	});
	}
	
	//打开讨论要求富文本编辑器对话框
	function  openWorkNote(index){ 
		var row = onWorkClickRow(index);
		$("#workNoteDialog").dialog({
    		onOpen :function(){
    			$("#workNoteForm [name=workId]").val(row.workId);
    			orderNoteEditor = TAOTAO.createEditor("#workNoteForm [name=workText]");
    			orderNoteEditor.html(row.workNote);
    		},
		
			onBeforeClose: function (event, ui) {
				// 关闭Dialog前移除编辑器
			   	KindEditor.remove("#workNoteForm [name=workText]");
			}
    	}).dialog("open");
		
	};
	
	//更新讨论要求
	function updateWorkNote(){
		$.get("order/edit_judge",'',function(data){
    		if(data.msg != null){
    			$.messager.alert('提示', data.msg);
    		}else{
    			orderNoteEditor.sync();
    			$.post("order/update_note",$("#workNoteForm").serialize(), function(data){
    				if(data.status == 200){
    					$("#workNoteDialog").dialog("close");
    					$("#workList").datagrid("reload");
    					$.messager.alert("操作提示", "更新讨论备注成功！");
    				}else{
    					$.messager.alert("操作提示", "更新讨论备注失败！");
    				}
    			});
    		}
    	});
	}
	
    function getOrderSelectionsIds(){
    	var workList = $("#workList");
    	var sels = workList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].workId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    
    function work_add(){
    	$.get("order/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#workAddWindow").window("open");
       		}
       	});
    }
    
    function work_edit(){
    	$.get("order/edit_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			var ids = getOrderSelectionsIds();
               	
               	if(ids.length == 0){
               		$.messager.alert('提示','必须选择一个讨论才能编辑!');
               		return ;
               	}
               	if(ids.indexOf(',') > 0){
               		$.messager.alert('提示','只能选择一个讨论!');
               		return ;
               	}
               	
               	$("#workEditWindow").window({
               		onLoad :function(){
               			//回显数据
               			var data = $("#workList").datagrid("getSelections")[0];
               			data.workDate = TAOTAO.formatDateTime(data.workDate);
               			$("#workEditForm").form("load", data);
               			orderEditEditor.html(data.workText);
               			
               		
               			
               			//加载文件上传插件
               			initOrderEditFileUpload();
               			//加载上传过的文件
               			initUploadedFile();
               		}
               	}).window("open");
       		}
       	});
    }
    
    function work_delete(){
    	$.get("order/delete_judge",'',function(data){
      		if(data.msg != null){
      			$.messager.alert('提示', data.msg);
      		}else{
      			var ids = getOrderSelectionsIds();
              	if(ids.length == 0){
              		$.messager.alert('提示','未选中讨论!');
              		return ;
              	}
              	$.messager.confirm('确认','确定删除ID为 '+ids+' 的讨论吗？',function(r){
              	    if (r){
              	    	var params = {"ids":ids};
                      	$.post("forumWork/delete_batch",params, function(data){
                  			if(data.status == 200){
                  				$.messager.alert('提示','删除讨论成功!',undefined,function(){
                  					$("#workList").datagrid("reload");
                  				});
                  			}
                  		});
              	    }
              	});
      		}
      	});
    }
    
    function work_reload(){
    	$("#workList").datagrid("reload");
    }
</script>