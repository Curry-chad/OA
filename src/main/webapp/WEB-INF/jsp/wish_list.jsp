<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<table class="easyui-datagrid" id="wishList" title="心声列表" data-options="singleSelect:false,collapsible:true,
	pagination:true,rownumbers:true,url:'wish/list',method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_wish">
    <thead>
        <tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'wishText',align:'center',width:100">心声</th>
			<th data-options="field:'wishDate',width:30,align:'center',formatter:TAOTAO.formatDateTime">发布日期</th>
        </tr>
    </thead>
</table> 

<div  id="toolbar_wish" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='order:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="wish_add()">新增</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="wish_edit()">编辑</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="wish_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="wish_reload()">刷新</a>  
	</div>  
</div>  
<div id="wishEditWindow" class="easyui-window" title="编辑心声" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'wish/edit'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="wishAddWindow" class="easyui-window" title="添加心声" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'wish/add'" style="width:65%;height:80%;padding:10px;">
</div>
<script>

	var orderNoteEditor ;
	
	var orderProductEditor;
	
	var orderCustomEditor;
	
	
	


	//根据index拿到该行值
	function onWishClickRow(index) {
		var rows = $('#wishList').datagrid('getRows');
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
    						$("#wishList").datagrid("reload");
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
    						$("#wishList").datagrid("reload");
    					});
    				}else{
    					$.messager.alert('提示',data.msg);
    				}
    			});
    		}
    	});
	}
	
	//打开心声要求富文本编辑器对话框
	function  openWishNote(index){ 
		var row = onWishClickRow(index);
		$("#wishNoteDialog").dialog({
    		onOpen :function(){
    			$("#wishNoteForm [name=wishId]").val(row.wishId);
    			orderNoteEditor = TAOTAO.createEditor("#wishNoteForm [name=wishNote]");
    			orderNoteEditor.html(row.wishNote);
    		},
		
			onBeforeClose: function (event, ui) {
				// 关闭Dialog前移除编辑器
			   	KindEditor.remove("#wishNoteForm [name=wishNote]");
			}
    	}).dialog("open");
		
	};
	
	//更新心声要求
	function updateWishNote(){
		$.get("order/edit_judge",'',function(data){
    		if(data.msg != null){
    			$.messager.alert('提示', data.msg);
    		}else{
    			orderNoteEditor.sync();
    			$.post("order/update_note",$("#wishNoteForm").serialize(), function(data){
    				if(data.status == 200){
    					$("#wishNoteDialog").dialog("close");
    					$("#wishList").datagrid("reload");
    					$.messager.alert("操作提示", "更新心声备注成功！");
    				}else{
    					$.messager.alert("操作提示", "更新心声备注失败！");
    				}
    			});
    		}
    	});
	}
	
    function getOrderSelectionsIds(){
    	var wishList = $("#wishList");
    	var sels = wishList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].wishId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    
    function wish_add(){
    	$.get("order/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#wishAddWindow").window("open");
       		}
       	});
    }
    
    function wish_edit(){
    	$.get("order/edit_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			var ids = getOrderSelectionsIds();
               	
               	if(ids.length == 0){
               		$.messager.alert('提示','必须选择一个心声才能编辑!');
               		return ;
               	}
               	if(ids.indexOf(',') > 0){
               		$.messager.alert('提示','只能选择一个心声!');
               		return ;
               	}
               	
               	$("#wishEditWindow").window({
               		onLoad :function(){
               			//回显数据
               			var data = $("#wishList").datagrid("getSelections")[0];
               			data.wishDate = TAOTAO.formatDateTime(data.wishDate);
               			$("#wishEditForm").form("load", data);
               			orderEditEditor.html(data.wishText);
               			
               		
               			
               			//加载文件上传插件
               			initOrderEditFileUpload();
               			//加载上传过的文件
               			initUploadedFile();
               		}
               	}).window("open");
       		}
       	});
    }
    
    function wish_delete(){
    	$.get("order/delete_judge",'',function(data){
      		if(data.msg != null){
      			$.messager.alert('提示', data.msg);
      		}else{
      			var ids = getOrderSelectionsIds();
              	if(ids.length == 0){
              		$.messager.alert('提示','未选中心声!');
              		return ;
              	}
              	$.messager.confirm('确认','确定删除ID为 '+ids+' 的心声吗？',function(r){
              	    if (r){
              	    	var params = {"ids":ids};
                      	$.post("wish/delete_batch",params, function(data){
                  			if(data.status == 200){
                  				$.messager.alert('提示','删除心声成功!',undefined,function(){
                  					$("#wishList").datagrid("reload");
                  				});
                  			}
                  		});
              	    }
              	});
      		}
      	});
    }
    
    function wish_reload(){
    	$("#wishList").datagrid("reload");
    }
</script>