<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<table class="easyui-datagrid" id="planList" title="工作计划列表" data-options="singleSelect:false,collapsible:true,
	pagination:true,rownumbers:true,url:'plan/list',method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_plan">
    <thead>
        <tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'planId',align:'center',width:100">工作计划编号</th>
			<th data-options="field:'planType',align:'center',width:100">工作计划类型</th>
			<th data-options="field:'planTheme',align:'center',width:100">工作计划主题</th>
			<th data-options="field:'planDate',width:130,align:'center',formatter:TAOTAO.formatDateTime">上传日期</th>
			<th data-options="field:'employee',width:70,align:'center',formatter:formatEmployee">上传人</th>
			<th data-options="field:'planNote',width:100,align:'center', formatter:formatOrderNote">备注</th>
			<th data-options="field:'planFile',width:180,align:'center', formatter:formatFile">附件</th>
        </tr>
    </thead>
</table> 

<div  id="toolbar_plan" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='order:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="plan_add()">新增</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="plan_edit()">编辑</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="plan_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="plan_reload()">刷新</a>  
	</div>  
	
    <div id="search_order" style="float: right;">
        <input id="search_text_order" class="easyui-searchbox"  
            data-options="searcher:doSearch_order,prompt:'请输入...',menu:'#menu_order'"  
            style="width:250px;vertical-align: middle;">
        </input>
        <div id="menu_order" style="width:120px"> 
			<div data-options="name:'planId'">工作计划编号</div> 
			<div data-options="name:'planType'">工作计划类型</div>
			<div data-options="name:'planTheme'">工作计划主题</div> 
		</div>     
    </div>  
</div>  
<div id="planEditWindow" class="easyui-window" title="编辑工作计划" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'plan/edit'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="planAddWindow" class="easyui-window" title="添加工作计划" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'plan/add'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="planNoteDialog" class="easyui-dialog" title="工作计划备注" data-options="modal:true,closed:true,resizable:true,
		iconCls:'icon-save'" style="width:55%;height:65%;padding:10px">
	<form id="planNoteForm" class="itemForm" method="post">
		<input type="hidden" name="planId"/>
	    <table cellpadding="5" >
	        <tr>
	            <td>备注:</td>
	            <td><textarea style="width:800px;height:450px;visibility:hidden;" name="planNote"></textarea></td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="updatePlanNote()">保存</a>
	</div>
</div>
<script>
function doSearch_order(value,name){ //用户输入用户名,点击搜素,触发此函数  
	if(value == null || value == ''){
		
		$("#planList").datagrid({
	        title:'工作计划列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, method:'get',
			nowrap:true, toolbar:"toolbar_plan", url:'plan/list', method:'get', loadMsg:'数据加载中......',
			fitColumns:true,//允许表格自动缩放,以适应父容器
	        columns : [ [ 
				{field : 'ck', checkbox:true },
				{field : 'planId', width : 100, align:'center', title : '工作计划编号'},
				{field : 'planType', width : 100, align : 'center', title : '工作计划类型'},
				{field : 'planTheme', width : 100, align : 'center', title : '工作计划主题'},
				{field : 'planDate', width : 130, title : '上传日期', align:'center', formatter:TAOTAO.formatDateTime},
				{field : 'employee', width : 70, align : 'center', title : '上传人',formatter:formatEmployee},
				{field : 'planNote', width : 100, title : '工作计划备注', align:'center', formatter:formatOrderNote},
				{field : 'planFile', width : 180, title : '附件', align:'center', formatter:formatFile}
	        ] ],  
	    });
	}else{
		$("#planList").datagrid({  
	        title:'工作计划列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, method:'get',
			nowrap:true, toolbar:"toolbar_plan", url:'plan/search_plan_by_'+name+'?searchValue='+encodeURI(encodeURI(value)),
			loadMsg:'数据加载中......', fitColumns:true,//允许表格自动缩放,以适应父容器
	        columns : [ [ 
	             	{field : 'ck', checkbox:true }, 
	             	{field : 'planId', width : 100, align:'center', title : '工作计划编号'},
					{field : 'planType', width : 100, align : 'center', title : '工作计划类型'},
					{field : 'planTheme', width : 100, align : 'center', title : '工作计划主题'},
					{field : 'planDate', width : 130, title : '上传日期', align:'center', formatter:TAOTAO.formatDateTime},
					{field : 'employee', width : 70, align : 'center', title : '上传人',formatter:formatEmployee},
					{field : 'planNote', width : 100, title : '工作计划备注', align:'center', formatter:formatOrderNote},
					{field : 'planFile', width : 180, title : '附件', align:'center', formatter:formatFile}
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
	
	//格式化工作计划要求
	function formatOrderNote(value, row, index){ 
		if(value !=null && value != ''){
			return "<a href=javascript:openPlanNote("+index+")>"+"工作计划备注"+"</a>";
		}else{
			return "无";
		}
	}

	//根据index拿到该行值
	function onPlanClickRow(index) {
		var rows = $('#planList').datagrid('getRows');
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
    						$("#planList").datagrid("reload");
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
    						$("#planList").datagrid("reload");
    					});
    				}else{
    					$.messager.alert('提示',data.msg);
    				}
    			});
    		}
    	});
	}
	
	//打开工作计划要求富文本编辑器对话框
	function  openPlanNote(index){ 
		var row = onPlanClickRow(index);
		$("#planNoteDialog").dialog({
    		onOpen :function(){
    			$("#planNoteForm [name=planId]").val(row.planId);
    			orderNoteEditor = TAOTAO.createEditor("#planNoteForm [name=planNote]");
    			orderNoteEditor.html(row.planNote);
    		},
		
			onBeforeClose: function (event, ui) {
				// 关闭Dialog前移除编辑器
			   	KindEditor.remove("#planNoteForm [name=planNote]");
			}
    	}).dialog("open");
		
	};
	
	//更新工作计划要求
	function updatePlanNote(){
		$.get("order/edit_judge",'',function(data){
    		if(data.msg != null){
    			$.messager.alert('提示', data.msg);
    		}else{
    			orderNoteEditor.sync();
    			$.post("order/update_note",$("#planNoteForm").serialize(), function(data){
    				if(data.status == 200){
    					$("#planNoteDialog").dialog("close");
    					$("#planList").datagrid("reload");
    					$.messager.alert("操作提示", "更新工作计划备注成功！");
    				}else{
    					$.messager.alert("操作提示", "更新工作计划备注失败！");
    				}
    			});
    		}
    	});
	}
	
    function getOrderSelectionsIds(){
    	var planList = $("#planList");
    	var sels = planList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].planId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    
    function plan_add(){
    	$.get("order/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#planAddWindow").window("open");
       		}
       	});
    }
    
    function plan_edit(){
    	$.get("order/edit_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			var ids = getOrderSelectionsIds();
               	
               	if(ids.length == 0){
               		$.messager.alert('提示','必须选择一个工作计划才能编辑!');
               		return ;
               	}
               	if(ids.indexOf(',') > 0){
               		$.messager.alert('提示','只能选择一个工作计划!');
               		return ;
               	}
               	
               	$("#planEditWindow").window({
               		onLoad :function(){
               			//回显数据
               			var data = $("#planList").datagrid("getSelections")[0];
               			data.planDate = TAOTAO.formatDateTime(data.planDate);
               			$("#planEditForm").form("load", data);
               			orderEditEditor.html(data.planNote);
               			
               		
               			
               			//加载文件上传插件
               			initOrderEditFileUpload();
               			//加载上传过的文件
               			initUploadedFile();
               		}
               	}).window("open");
       		}
       	});
    }
    
    function plan_delete(){
    	$.get("order/delete_judge",'',function(data){
      		if(data.msg != null){
      			$.messager.alert('提示', data.msg);
      		}else{
      			var ids = getOrderSelectionsIds();
              	if(ids.length == 0){
              		$.messager.alert('提示','未选中工作计划!');
              		return ;
              	}
              	$.messager.confirm('确认','确定删除ID为 '+ids+' 的工作计划吗？',function(r){
              	    if (r){
              	    	var params = {"ids":ids};
                      	$.post("plan/delete_batch",params, function(data){
                  			if(data.status == 200){
                  				$.messager.alert('提示','删除工作计划成功!',undefined,function(){
                  					$("#planList").datagrid("reload");
                  				});
                  			}
                  		});
              	    }
              	});
      		}
      	});
    }
    
    function plan_reload(){
    	$("#planList").datagrid("reload");
    }
</script>