<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<table class="easyui-datagrid" id="projectMainList" title="项目总体概况列表" data-options="singleSelect:false,collapsible:true,
	pagination:true,rownumbers:true,url:'projectMain/list',method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_projectMain">
    <thead>
        <tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'mainName',align:'center',width:100">项目名称</th>
			<th data-options="field:'employee.empName',align:'center',width:100">项目负责人</th>
			<th data-options="field:'mainAmount',align:'center',width:50">项目金额</th>
			<th data-options="field:'mainStart',width:50,align:'center',formatter:TAOTAO.formatDateTime">开始日期</th>
			<th data-options="field:'mainEnd',width:30,align:'center',formatter:TAOTAO.formatDateTime">结束日期</th>
        </tr>
    </thead>
</table> 

<div  id="toolbar_projectMain" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='order:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="projectMain_add()">新增</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="projectMain_edit()">编辑</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="projectMain_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="projectMain_reload()">刷新</a>  
	</div>  
</div>  
<div id="projectMainEditWindow" class="easyui-window" title="编辑项目总体概况" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'projectMain/edit'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="projectMainAddWindow" class="easyui-window" title="添加项目总体概况" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'projectMain/add'" style="width:65%;height:80%;padding:10px;">
</div>
<script>

	var orderNoteEditor ;
	
	var orderProductEditor;
	
	var orderCustomEditor;
	
	
	


	//根据index拿到该行值
	function onProjectMainClickRow(index) {
		var rows = $('#projectMainList').datagrid('getRows');
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
    						$("#projectMainList").datagrid("reload");
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
    						$("#projectMainList").datagrid("reload");
    					});
    				}else{
    					$.messager.alert('提示',data.msg);
    				}
    			});
    		}
    	});
	}
	
	//打开项目总体概况要求富文本编辑器对话框
	function  openProjectMainNote(index){ 
		var row = onProjectMainClickRow(index);
		$("#projectMainNoteDialog").dialog({
    		onOpen :function(){
    			$("#projectMainNoteForm [name=mainId]").val(row.mainId);
    			orderNoteEditor = TAOTAO.createEditor("#projectMainNoteForm [name=mainName]");
    			orderNoteEditor.html(row.mainName);
    		},
		
			onBeforeClose: function (event, ui) {
				// 关闭Dialog前移除编辑器
			   	KindEditor.remove("#projectMainNoteForm [name=mainName]");
			}
    	}).dialog("open");
		
	};
	
	//更新项目总体概况要求
	function updateProjectMainNote(){
		$.get("order/edit_judge",'',function(data){
    		if(data.msg != null){
    			$.messager.alert('提示', data.msg);
    		}else{
    			orderNoteEditor.sync();
    			$.post("order/update_note",$("#projectMainNoteForm").serialize(), function(data){
    				if(data.status == 200){
    					$("#projectMainNoteDialog").dialog("close");
    					$("#projectMainList").datagrid("reload");
    					$.messager.alert("操作提示", "更新项目总体概况备注成功！");
    				}else{
    					$.messager.alert("操作提示", "更新项目总体概况备注失败！");
    				}
    			});
    		}
    	});
	}
	
    function getOrderSelectionsIds(){
    	var projectMainList = $("#projectMainList");
    	var sels = projectMainList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].mainId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    
    function projectMain_add(){
    	$.get("order/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#projectMainAddWindow").window("open");
       		}
       	});
    }
    
    function projectMain_edit(){
    	$.get("order/edit_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			var ids = getOrderSelectionsIds();
               	
               	if(ids.length == 0){
               		$.messager.alert('提示','必须选择一个项目总体概况才能编辑!');
               		return ;
               	}
               	if(ids.indexOf(',') > 0){
               		$.messager.alert('提示','只能选择一个项目总体概况!');
               		return ;
               	}
               	
               	$("#projectMainEditWindow").window({
               		onLoad :function(){
               			//回显数据
               			var data = $("#projectMainList").datagrid("getSelections")[0];
               			data.mainStart = TAOTAO.formatDateTime(data.mainStart);
               			data.mainEnd = TAOTAO.formatDateTime(data.mainEnd);
               			$("#projectMainEditForm").form("load", data);
               			orderEditEditor.html(data.mainName);
               			
               		
               			
               			//加载文件上传插件
               			initOrderEditFileUpload();
               			//加载上传过的文件
               			initUploadedFile();
               		}
               	}).window("open");
       		}
       	});
    }
    
    function projectMain_delete(){
    	$.get("order/delete_judge",'',function(data){
      		if(data.msg != null){
      			$.messager.alert('提示', data.msg);
      		}else{
      			var ids = getOrderSelectionsIds();
              	if(ids.length == 0){
              		$.messager.alert('提示','未选中项目总体概况!');
              		return ;
              	}
              	$.messager.confirm('确认','确定删除ID为 '+ids+' 的项目总体概况吗？',function(r){
              	    if (r){
              	    	var params = {"ids":ids};
                      	$.post("projectMain/delete_batch",params, function(data){
                  			if(data.status == 200){
                  				$.messager.alert('提示','删除项目总体概况成功!',undefined,function(){
                  					$("#projectMainList").datagrid("reload");
                  				});
                  			}
                  		});
              	    }
              	});
      		}
      	});
    }
    
    function projectMain_reload(){
    	$("#projectMainList").datagrid("reload");
    }
</script>