<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<table class="easyui-datagrid" id="jobHourList" title="报表列表" data-options="singleSelect:false,collapsible:true,
	pagination:true,rownumbers:true,url:'jobHour/list',method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_jobHour">
    <thead>
        <tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'hourId',align:'center',width:100">工时流水号</th>
			<th data-options="field:'employee',width:70,align:'center',formatter:formatEmployee">员工名</th>
			<th data-options="field:'hourTime',align:'center',width:100">当月工时</th>
			<th data-options="field:'hourRest',align:'center',width:100">休假工时</th>
        </tr>
    </thead>
</table> 

<div  id="toolbar_jobHour" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='order:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="jobHour_add()">新增</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="jobHour_edit()">编辑</a>  
		    </div>  
		</c:if>
		<c:if test="${per=='order:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="jobHour_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="jobHour_reload()">刷新</a>  
	</div>  
	
    <div id="search_order" style="float: right;">
        <input id="search_text_order" class="easyui-searchbox"  
            data-options="searcher:doSearch_order,prompt:'请输入...',menu:'#menu_order'"  
            style="width:250px;vertical-align: middle;">
        </input>
        <div id="menu_order" style="width:120px"> 
			<div data-options="name:'hourId'">工时流水号</div> 
			<div data-options="name:'hourTime'">当月工时</div>
		</div>     
    </div>  
</div>  
<div id="jobHourEditWindow" class="easyui-window" title="编辑报表" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'jobHour/edit'" style="width:65%;height:80%;padding:10px;">
</div>
<div id="jobHourAddWindow" class="easyui-window" title="添加报表" data-options="modal:true,closed:true,resizable:true,
	iconCls:'icon-save',href:'jobHour/add'" style="width:65%;height:80%;padding:10px;">
</div>
<script>
function doSearch_order(value,name){ //用户输入用户名,点击搜素,触发此函数  
	if(value == null || value == ''){
		
		$("#jobHourList").datagrid({
	        title:'报表列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, method:'get',
			nowrap:true, toolbar:"toolbar_jobHour", url:'jobHour/list', method:'get', loadMsg:'数据加载中......',
			fitColumns:true,//允许表格自动缩放,以适应父容器
	        columns : [ [ 
				{field : 'ck', checkbox:true },
				{field : 'hourId', width : 100, align:'center', title : '工时流水号'},
				{field : 'employee', width : 70, align : 'center', title : '员工姓名',formatter:formatEmployee},
				{field : 'hourTime', width : 100, align : 'center', title : '当月工时'},
				{field : 'hourRest', width : 100, title : '休假工时', align:'center'}
	        ] ],  
	    });
	}else{
		$("#jobHourList").datagrid({  
	        title:'报表列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, method:'get',
			nowrap:true, toolbar:"toolbar_jobHour", url:'jobHour/search_jobHour_by_'+name+'?searchValue='+encodeURI(encodeURI(value)),
			loadMsg:'数据加载中......', fitColumns:true,//允许表格自动缩放,以适应父容器
	        columns : [ [ 
	        	{field : 'ck', checkbox:true },
				{field : 'hourId', width : 100, align:'center', title : '工时流水号'},
				{field : 'employee', width : 70, align : 'center', title : '员工姓名',formatter:formatEmployee},
				{field : 'hourTime', width : 100, align : 'center', title : '当月工时'},
				{field : 'hourRest', width : 100, title : '休假工时', align:'center'}
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
	function onJobHourClickRow(index) {
		var rows = $('#jobHourList').datagrid('getRows');
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
    						$("#jobHourList").datagrid("reload");
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
    						$("#jobHourList").datagrid("reload");
    					});
    				}else{
    					$.messager.alert('提示',data.msg);
    				}
    			});
    		}
    	});
	}
	
	
	
	
	
    function getOrderSelectionsIds(){
    	var jobHourList = $("#jobHourList");
    	var sels = jobHourList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].hourId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    
    function jobHour_add(){
    	$.get("order/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#jobHourAddWindow").window("open");
       		}
       	});
    }
    
    function jobHour_edit(){
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
               	
               	$("#jobHourEditWindow").window({
               		onLoad :function(){
               			//回显数据
               			var data = $("#jobHourList").datagrid("getSelections")[0];
               			$("#jobHourEditForm").form("load", data);
               			
               			
               		
               			
               			//加载文件上传插件
               			initOrderEditFileUpload();
               			//加载上传过的文件
               			initUploadedFile();
               		}
               	}).window("open");
       		}
       	});
    }
    
    function jobHour_delete(){
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
                      	$.post("jobHour/delete_batch",params, function(data){
                  			if(data.status == 200){
                  				$.messager.alert('提示','删除报表成功!',undefined,function(){
                  					$("#jobHourList").datagrid("reload");
                  				});
                  			}
                  		});
              	    }
              	});
      		}
      	});
    }
    
    function jobHour_reload(){
    	$("#jobHourList").datagrid("reload");
    }
</script>