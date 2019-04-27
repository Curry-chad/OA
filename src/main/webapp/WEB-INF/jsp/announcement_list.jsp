<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<table class="easyui-datagrid" id="announcementList" title="公告栏列表" data-options="singleSelect:false,collapsible:true,
	pagination:true,rownumbers:true,url:'announcement/list',method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_announcement">
    <thead>
        <tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'announcementText',align:'center',width:100">公告栏</th>
			<th data-options="field:'announcementDate',width:30,align:'center',formatter:TAOTAO.formatDateTime">发布日期</th>
        </tr>
    </thead>
</table> 

<div  id="toolbar_announcement" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='order:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="announcement_add()">新增</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="announcement_edit()">编辑</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="announcement_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="announcement_reload()">刷新</a>  
	</div>  
</div>  
<div id="announcementEditWindow" class="easyui-window" title="编辑公告栏" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'announcement/edit'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="announcementAddWindow" class="easyui-window" title="添加公告栏" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'announcement/add'" style="width:65%;height:80%;padding:10px;">
</div>
<script>

	var orderNoteEditor ;
	
	var orderProductEditor;
	
	var orderCustomEditor;
	
	
	


	//根据index拿到该行值
	function onAnnouncementClickRow(index) {
		var rows = $('#announcementList').datagrid('getRows');
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
    						$("#announcementList").datagrid("reload");
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
    						$("#announcementList").datagrid("reload");
    					});
    				}else{
    					$.messager.alert('提示',data.msg);
    				}
    			});
    		}
    	});
	}
	
	//打开公告栏要求富文本编辑器对话框
	function  openAnnouncementNote(index){ 
		var row = onAnnouncementClickRow(index);
		$("#announcementNoteDialog").dialog({
    		onOpen :function(){
    			$("#announcementNoteForm [name=announcementId]").val(row.announcementId);
    			orderNoteEditor = TAOTAO.createEditor("#announcementNoteForm [name=announcementNote]");
    			orderNoteEditor.html(row.announcementNote);
    		},
		
			onBeforeClose: function (event, ui) {
				// 关闭Dialog前移除编辑器
			   	KindEditor.remove("#announcementNoteForm [name=announcementNote]");
			}
    	}).dialog("open");
		
	};
	
	//更新公告栏要求
	function updateAnnouncementNote(){
		$.get("order/edit_judge",'',function(data){
    		if(data.msg != null){
    			$.messager.alert('提示', data.msg);
    		}else{
    			orderNoteEditor.sync();
    			$.post("order/update_note",$("#announcementNoteForm").serialize(), function(data){
    				if(data.status == 200){
    					$("#announcementNoteDialog").dialog("close");
    					$("#announcementList").datagrid("reload");
    					$.messager.alert("操作提示", "更新公告栏备注成功！");
    				}else{
    					$.messager.alert("操作提示", "更新公告栏备注失败！");
    				}
    			});
    		}
    	});
	}
	
    function getOrderSelectionsIds(){
    	var announcementList = $("#announcementList");
    	var sels = announcementList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].announcementId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    
    function announcement_add(){
    	$.get("order/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#announcementAddWindow").window("open");
       		}
       	});
    }
    
    function announcement_edit(){
    	$.get("order/edit_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			var ids = getOrderSelectionsIds();
               	
               	if(ids.length == 0){
               		$.messager.alert('提示','必须选择一个公告栏才能编辑!');
               		return ;
               	}
               	if(ids.indexOf(',') > 0){
               		$.messager.alert('提示','只能选择一个公告栏!');
               		return ;
               	}
               	
               	$("#announcementEditWindow").window({
               		onLoad :function(){
               			//回显数据
               			var data = $("#announcementList").datagrid("getSelections")[0];
               			data.announcementDate = TAOTAO.formatDateTime(data.announcementDate);
               			$("#announcementEditForm").form("load", data);
               			orderEditEditor.html(data.announcementText);
               			
               		
               			
               			//加载文件上传插件
               			initOrderEditFileUpload();
               			//加载上传过的文件
               			initUploadedFile();
               		}
               	}).window("open");
       		}
       	});
    }
    
    function announcement_delete(){
    	$.get("order/delete_judge",'',function(data){
      		if(data.msg != null){
      			$.messager.alert('提示', data.msg);
      		}else{
      			var ids = getOrderSelectionsIds();
              	if(ids.length == 0){
              		$.messager.alert('提示','未选中公告栏!');
              		return ;
              	}
              	$.messager.confirm('确认','确定删除ID为 '+ids+' 的公告栏吗？',function(r){
              	    if (r){
              	    	var params = {"ids":ids};
                      	$.post("announcement/delete_batch",params, function(data){
                  			if(data.status == 200){
                  				$.messager.alert('提示','删除公告栏成功!',undefined,function(){
                  					$("#announcementList").datagrid("reload");
                  				});
                  			}
                  		});
              	    }
              	});
      		}
      	});
    }
    
    function announcement_reload(){
    	$("#announcementList").datagrid("reload");
    }
</script>