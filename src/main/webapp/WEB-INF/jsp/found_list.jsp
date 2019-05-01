<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<table class="easyui-datagrid" id="foundList" title="寻物列表" data-options="singleSelect:false,collapsible:true,
	pagination:true,rownumbers:true,url:'found/list',method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_found">
    <thead>
        <tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'foundText',align:'center',width:100">寻物</th>
			<th data-options="field:'foundDate',width:30,align:'center',formatter:TAOTAO.formatDateTime">发布日期</th>
        </tr>
    </thead>
</table> 

<div  id="toolbar_found" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='order:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="found_add()">新增</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="found_edit()">编辑</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="found_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="found_reload()">刷新</a>  
	</div>  
</div>  
<div id="foundEditWindow" class="easyui-window" title="编辑寻物" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'found/edit'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="foundAddWindow" class="easyui-window" title="添加寻物" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'found/add'" style="width:65%;height:80%;padding:10px;">
</div>
<script>

	var orderNoteEditor ;
	
	var orderProductEditor;
	
	var orderCustomEditor;
	
	
	


	//根据index拿到该行值
	function onFoundClickRow(index) {
		var rows = $('#foundList').datagrid('getRows');
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
    						$("#foundList").datagrid("reload");
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
    						$("#foundList").datagrid("reload");
    					});
    				}else{
    					$.messager.alert('提示',data.msg);
    				}
    			});
    		}
    	});
	}
	
	//打开寻物要求富文本编辑器对话框
	function  openFoundNote(index){ 
		var row = onFoundClickRow(index);
		$("#foundNoteDialog").dialog({
    		onOpen :function(){
    			$("#foundNoteForm [name=foundId]").val(row.foundId);
    			orderNoteEditor = TAOTAO.createEditor("#foundNoteForm [name=foundNote]");
    			orderNoteEditor.html(row.foundNote);
    		},
		
			onBeforeClose: function (event, ui) {
				// 关闭Dialog前移除编辑器
			   	KindEditor.remove("#foundNoteForm [name=foundNote]");
			}
    	}).dialog("open");
		
	};
	
	//更新寻物要求
	function updateFoundNote(){
		$.get("order/edit_judge",'',function(data){
    		if(data.msg != null){
    			$.messager.alert('提示', data.msg);
    		}else{
    			orderNoteEditor.sync();
    			$.post("order/update_note",$("#foundNoteForm").serialize(), function(data){
    				if(data.status == 200){
    					$("#foundNoteDialog").dialog("close");
    					$("#foundList").datagrid("reload");
    					$.messager.alert("操作提示", "更新寻物备注成功！");
    				}else{
    					$.messager.alert("操作提示", "更新寻物备注失败！");
    				}
    			});
    		}
    	});
	}
	
    function getOrderSelectionsIds(){
    	var foundList = $("#foundList");
    	var sels = foundList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].foundId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    
    function found_add(){
    	$.get("order/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#foundAddWindow").window("open");
       		}
       	});
    }
    
    function found_edit(){
    	$.get("order/edit_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			var ids = getOrderSelectionsIds();
               	
               	if(ids.length == 0){
               		$.messager.alert('提示','必须选择一个寻物才能编辑!');
               		return ;
               	}
               	if(ids.indexOf(',') > 0){
               		$.messager.alert('提示','只能选择一个寻物!');
               		return ;
               	}
               	
               	$("#foundEditWindow").window({
               		onLoad :function(){
               			//回显数据
               			var data = $("#foundList").datagrid("getSelections")[0];
               			data.foundDate = TAOTAO.formatDateTime(data.foundDate);
               			$("#foundEditForm").form("load", data);
               			orderEditEditor.html(data.foundText);
               			
               		
               			
               			//加载文件上传插件
               			initOrderEditFileUpload();
               			//加载上传过的文件
               			initUploadedFile();
               		}
               	}).window("open");
       		}
       	});
    }
    
    function found_delete(){
    	$.get("order/delete_judge",'',function(data){
      		if(data.msg != null){
      			$.messager.alert('提示', data.msg);
      		}else{
      			var ids = getOrderSelectionsIds();
              	if(ids.length == 0){
              		$.messager.alert('提示','未选中寻物!');
              		return ;
              	}
              	$.messager.confirm('确认','确定删除ID为 '+ids+' 的寻物吗？',function(r){
              	    if (r){
              	    	var params = {"ids":ids};
                      	$.post("found/delete_batch",params, function(data){
                  			if(data.status == 200){
                  				$.messager.alert('提示','删除寻物成功!',undefined,function(){
                  					$("#foundList").datagrid("reload");
                  				});
                  			}
                  		});
              	    }
              	});
      		}
      	});
    }
    
    function found_reload(){
    	$("#foundList").datagrid("reload");
    }
</script>