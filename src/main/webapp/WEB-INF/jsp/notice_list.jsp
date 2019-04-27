<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<table class="easyui-datagrid" id="noticeList" title="通知文件列表" data-options="singleSelect:false,collapsible:true,
	pagination:true,rownumbers:true,url:'notice/list',method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_notice">
    <thead>
        <tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'noticeId',align:'center',width:100">通知文件编号</th>
			<th data-options="field:'noticeType',align:'center',width:100">通知文件类型</th>
			<th data-options="field:'noticeTheme',align:'center',width:100">通知文件主题</th>
			<th data-options="field:'noticeDate',width:130,align:'center',formatter:TAOTAO.formatDateTime">上传日期</th>
			<th data-options="field:'employee',width:70,align:'center',formatter:formatEmployee">上传人</th>
			<th data-options="field:'noticeNote',width:100,align:'center', formatter:formatOrderNote">备注</th>
			<th data-options="field:'noticeFile',width:180,align:'center', formatter:formatFile">附件</th>
        </tr>
    </thead>
</table> 

<div  id="toolbar_notice" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='order:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="notice_add()">新增</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="notice_edit()">编辑</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="notice_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="notice_reload()">刷新</a>  
	</div>  
	
    <div id="search_order" style="float: right;">
        <input id="search_text_order" class="easyui-searchbox"  
            data-options="searcher:doSearch_order,prompt:'请输入...',menu:'#menu_order'"  
            style="width:250px;vertical-align: middle;">
        </input>
        <div id="menu_order" style="width:120px"> 
			<div data-options="name:'noticeId'">通知文件编号</div> 
			<div data-options="name:'noticeType'">通知文件类型</div>
			<div data-options="name:'noticeTheme'">通知文件主题</div> 
		</div>     
    </div>  
</div>  
<div id="noticeEditWindow" class="easyui-window" title="编辑通知文件" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'notice/edit'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="noticeAddWindow" class="easyui-window" title="添加通知文件" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'notice/add'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="noticeNoteDialog" class="easyui-dialog" title="通知文件备注" data-options="modal:true,closed:true,resizable:true,
		iconCls:'icon-save'" style="width:55%;height:65%;padding:10px">
	<form id="noticeNoteForm" class="itemForm" method="post">
		<input type="hidden" name="noticeId"/>
	    <table cellpadding="5" >
	        <tr>
	            <td>备注:</td>
	            <td><textarea style="width:800px;height:450px;visibility:hidden;" name="noticeNote"></textarea></td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="updateNoticeNote()">保存</a>
	</div>
</div>
<script>
function doSearch_order(value,name){ //用户输入用户名,点击搜素,触发此函数  
	if(value == null || value == ''){
		
		$("#noticeList").datagrid({
	        title:'通知文件列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, method:'get',
			nowrap:true, toolbar:"toolbar_notice", url:'notice/list', method:'get', loadMsg:'数据加载中......',
			fitColumns:true,//允许表格自动缩放,以适应父容器
	        columns : [ [ 
				{field : 'ck', checkbox:true },
				{field : 'noticeId', width : 100, align:'center', title : '通知文件编号'},
				{field : 'noticeType', width : 100, align : 'center', title : '通知文件类型'},
				{field : 'noticeTheme', width : 100, align : 'center', title : '通知文件主题'},
				{field : 'noticeDate', width : 130, title : '上传日期', align:'center', formatter:TAOTAO.formatDateTime},
				{field : 'employee', width : 70, align : 'center', title : '上传人',formatter:formatEmployee},
				{field : 'noticeNote', width : 100, title : '通知文件备注', align:'center', formatter:formatOrderNote},
				{field : 'noticeFile', width : 180, title : '附件', align:'center', formatter:formatFile}
	        ] ],  
	    });
	}else{
		$("#noticeList").datagrid({  
	        title:'通知文件列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, method:'get',
			nowrap:true, toolbar:"toolbar_notice", url:'notice/search_notice_by_'+name+'?searchValue='+encodeURI(encodeURI(value)),
			loadMsg:'数据加载中......', fitColumns:true,//允许表格自动缩放,以适应父容器
	        columns : [ [ 
	             	{field : 'ck', checkbox:true }, 
	             	{field : 'noticeId', width : 100, align:'center', title : '通知文件编号'},
					{field : 'noticeType', width : 100, align : 'center', title : '通知文件类型'},
					{field : 'noticeTheme', width : 100, align : 'center', title : '通知文件主题'},
					{field : 'noticeDate', width : 130, title : '上传日期', align:'center', formatter:TAOTAO.formatDateTime},
					{field : 'employee', width : 70, align : 'center', title : '上传人',formatter:formatEmployee},
					{field : 'noticeNote', width : 100, title : '通知文件备注', align:'center', formatter:formatOrderNote},
					{field : 'noticeFile', width : 180, title : '附件', align:'center', formatter:formatFile}
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
	
	//格式化产品信息
	function  formatProduct(value, row, index){ 
		if(value !=null && value != ''){
			return "<a href=javascript:openOrderProduct("+index+")>"+value.productName+"</a>";
		}else{
			return "无";
		}
	};
	
	//格式化通知文件要求
	function formatOrderNote(value, row, index){ 
		if(value !=null && value != ''){
			return "<a href=javascript:openNoticeNote("+index+")>"+"通知文件备注"+"</a>";
		}else{
			return "无";
		}
	}

	//根据index拿到该行值
	function onNoticeClickRow(index) {
		var rows = $('#noticeList').datagrid('getRows');
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
    						$("#noticeList").datagrid("reload");
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
    						$("#noticeList").datagrid("reload");
    					});
    				}else{
    					$.messager.alert('提示',data.msg);
    				}
    			});
    		}
    	});
	}
	
	//打开通知文件要求富文本编辑器对话框
	function  openNoticeNote(index){ 
		var row = onNoticeClickRow(index);
		$("#noticeNoteDialog").dialog({
    		onOpen :function(){
    			$("#noticeNoteForm [name=noticeId]").val(row.noticeId);
    			orderNoteEditor = TAOTAO.createEditor("#noticeNoteForm [name=noticeNote]");
    			orderNoteEditor.html(row.noticeNote);
    		},
		
			onBeforeClose: function (event, ui) {
				// 关闭Dialog前移除编辑器
			   	KindEditor.remove("#noticeNoteForm [name=noticeNote]");
			}
    	}).dialog("open");
		
	};
	
	//更新通知文件要求
	function updateNoticeNote(){
		$.get("order/edit_judge",'',function(data){
    		if(data.msg != null){
    			$.messager.alert('提示', data.msg);
    		}else{
    			orderNoteEditor.sync();
    			$.post("order/update_note",$("#noticeNoteForm").serialize(), function(data){
    				if(data.status == 200){
    					$("#noticeNoteDialog").dialog("close");
    					$("#noticeList").datagrid("reload");
    					$.messager.alert("操作提示", "更新通知文件备注成功！");
    				}else{
    					$.messager.alert("操作提示", "更新通知文件备注失败！");
    				}
    			});
    		}
    	});
	}
	
    function getOrderSelectionsIds(){
    	var noticeList = $("#noticeList");
    	var sels = noticeList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].noticeId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    
    function notice_add(){
    	$.get("order/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#noticeAddWindow").window("open");
       		}
       	});
    }
    
    function notice_edit(){
    	$.get("order/edit_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			var ids = getOrderSelectionsIds();
               	
               	if(ids.length == 0){
               		$.messager.alert('提示','必须选择一个通知文件才能编辑!');
               		return ;
               	}
               	if(ids.indexOf(',') > 0){
               		$.messager.alert('提示','只能选择一个通知文件!');
               		return ;
               	}
               	
               	$("#noticeEditWindow").window({
               		onLoad :function(){
               			//回显数据
               			var data = $("#noticeList").datagrid("getSelections")[0];
               			data.noticeDate = TAOTAO.formatDateTime(data.noticeDate);
               			$("#noticeEditForm").form("load", data);
               			orderEditEditor.html(data.noticeNote);
               			
               		
               			
               			//加载文件上传插件
               			initOrderEditFileUpload();
               			//加载上传过的文件
               			initUploadedFile();
               		}
               	}).window("open");
       		}
       	});
    }
    
    function notice_delete(){
    	$.get("order/delete_judge",'',function(data){
      		if(data.msg != null){
      			$.messager.alert('提示', data.msg);
      		}else{
      			var ids = getOrderSelectionsIds();
              	if(ids.length == 0){
              		$.messager.alert('提示','未选中通知文件!');
              		return ;
              	}
              	$.messager.confirm('确认','确定删除ID为 '+ids+' 的通知文件吗？',function(r){
              	    if (r){
              	    	var params = {"ids":ids};
                      	$.post("notice/delete_batch",params, function(data){
                  			if(data.status == 200){
                  				$.messager.alert('提示','删除通知文件成功!',undefined,function(){
                  					$("#noticeList").datagrid("reload");
                  				});
                  			}
                  		});
              	    }
              	});
      		}
      	});
    }
    
    function notice_reload(){
    	$("#noticeList").datagrid("reload");
    }
</script>