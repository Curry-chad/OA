<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<table class="easyui-datagrid" id="jobExitList" title="报表列表" data-options="singleSelect:false,collapsible:true,
	pagination:true,rownumbers:true,url:'jobExit/list',method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_jobExit">
    <thead>
        <tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'exitId',align:'center',width:100">离职流水号</th>
			<th data-options="field:'employee',width:70,align:'center',formatter:formatEmployee">离职人</th>
			<th data-options="field:'exitPost',align:'center',width:100">离职岗位</th>
			<th data-options="field:'exitSalary',align:'center',width:100">离职薪水</th>
			<th data-options="field:'exitDate',width:130,align:'center',formatter:TAOTAO.formatDateTime">离职日期</th>
        </tr>
    </thead>
</table> 

<div  id="toolbar_jobExit" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='order:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="jobExit_add()">新增</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="jobExit_edit()">编辑</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="jobExit_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="jobExit_reload()">刷新</a>  
	</div>  
	
    <div id="search_order" style="float: right;">
        <input id="search_text_order" class="easyui-searchbox"  
            data-options="searcher:doSearch_order,prompt:'请输离...',menu:'#menu_order'"  
            style="width:250px;vertical-align: middle;">
        </input>
        <div id="menu_order" style="width:120px"> 
			<div data-options="name:'exitId'">离职流水号</div> 
			<div data-options="name:'exitSalary'">离职薪水</div>
		</div>     
    </div>  
</div>  
<div id="jobExitEditWindow" class="easyui-window" title="编辑报表" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'jobExit/edit'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="jobExitAddWindow" class="easyui-window" title="添加报表" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'jobExit/add'" style="width:65%;height:80%;padding:10px;">
</div>
<script>
function doSearch_order(value,name){ //用户输离用户名,点击搜素,触发此函数  
	if(value == null || value == ''){
		
		$("#jobExitList").datagrid({
	        title:'报表列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, method:'get',
			nowrap:true, toolbar:"toolbar_jobExit", url:'jobExit/list', method:'get', loadMsg:'数据加载中......',
			fitColumns:true,//允许表格自动缩放,以适应父容器
	        columns : [ [ 
				{field : 'ck', checkbox:true },
				{field : 'exitId', width : 100, align:'center', title : '离职流水号'},
				{field : 'employee', width : 70, align : 'center', title : '离职人',formatter:formatEmployee},
				{field : 'exitPost', width : 100, align : 'center', title : '离职岗位'},
				{field : 'exitSalary', width : 100, title : '离职薪水', align:'center'},
				{field : 'exitDate', width : 130, title : '离职日期', align:'center', formatter:TAOTAO.formatDateTime}
	        ] ],  
	    });
	}else{
		$("#jobExitList").datagrid({  
	        title:'报表列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, method:'get',
			nowrap:true, toolbar:"toolbar_jobExit", url:'jobExit/search_jobExit_by_'+name+'?searchValue='+encodeURI(encodeURI(value)),
			loadMsg:'数据加载中......', fitColumns:true,//允许表格自动缩放,以适应父容器
	        columns : [ [ 
	        	{field : 'ck', checkbox:true },
				{field : 'exitId', width : 100, align:'center', title : '离职流水号'},
				{field : 'employee', width : 70, align : 'center', title : '离职人',formatter:formatEmployee},
				{field : 'exitPost', width : 100, align : 'center', title : '离职岗位'},
				{field : 'exitSalary', width : 100, title : '离职薪水', align:'center'},
				{field : 'exitDate', width : 130, title : '离职日期', align:'center', formatter:TAOTAO.formatDateTime}
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
	

	//根据index拿到该行值
	function onJobExitClickRow(index) {
		var rows = $('#jobExitList').datagrid('getRows');
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
    						$("#jobExitList").datagrid("reload");
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
    						$("#jobExitList").datagrid("reload");
    					});
    				}else{
    					$.messager.alert('提示',data.msg);
    				}
    			});
    		}
    	});
	}
	
	
	
	
	
    function getOrderSelectionsIds(){
    	var jobExitList = $("#jobExitList");
    	var sels = jobExitList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].exitId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    
    function jobExit_add(){
    	$.get("order/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#jobExitAddWindow").window("open");
       		}
       	});
    }
    
    function jobExit_edit(){
    	$.get("order/edit_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			var ids = getOrderSelectionsIds();
               	
               	if(ids.length == 0){
               		$.messager.alert('提示','必须选择一个报表才能编辑!');
               		return ;
               	}
               	if(ids.indexOf(',') > 0){
               		$.messager.alert('提示','只能选择一个报表!');
               		return ;
               	}
               	
               	$("#jobExitEditWindow").window({
               		onLoad :function(){
               			//回显数据
               			var data = $("#jobExitList").datagrid("getSelections")[0];
               			data.exitDate = TAOTAO.formatDateTime(data.exitDate);
               			$("#jobExitEditForm").form("load", data);
               			
               			
               		
               			
               			//加载文件上传插件
               			initOrderEditFileUpload();
               			//加载上传过的文件
               			initUploadedFile();
               		}
               	}).window("open");
       		}
       	});
    }
    
    function jobExit_delete(){
    	$.get("order/delete_judge",'',function(data){
      		if(data.msg != null){
      			$.messager.alert('提示', data.msg);
      		}else{
      			var ids = getOrderSelectionsIds();
              	if(ids.length == 0){
              		$.messager.alert('提示','未选中报表!');
              		return ;
              	}
              	$.messager.confirm('确认','确定删除ID为 '+ids+' 的报表吗？',function(r){
              	    if (r){
              	    	var params = {"ids":ids};
                      	$.post("jobExit/delete_batch",params, function(data){
                  			if(data.status == 200){
                  				$.messager.alert('提示','删除报表成功!',undefined,function(){
                  					$("#jobExitList").datagrid("reload");
                  				});
                  			}
                  		});
              	    }
              	});
      		}
      	});
    }
    
    function jobExit_reload(){
    	$("#jobExitList").datagrid("reload");
    }
</script>