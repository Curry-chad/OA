<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="projectMainEditForm" class="orderForm" method="post">
		<input type="hidden" name="projectMainId"/>
	    <table cellpadding="5">
	        <tr>
	            <td>项目编号:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="mainId" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>项目名称:</td>
	            <td>
	                <textarea style="width:800px;height:300px;visibility:hidden;" name="mainName"></textarea>
	            </td>
	        </tr>
	        <tr>
	            <td>项目金额:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="mainAmount" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>开始日期:</td>
	            <td>
					<input class="easyui-datetimebox" name="mainStart" data-options="required:true,showSeconds:true"
						   value="date.format('yyyy-MM-dd hh:mm:ss')" style="width:150px">
				</td>
	        </tr>
	        <tr>
	            <td>结束日期:</td>
	            <td>
					<input class="easyui-datetimebox" name="mainEnd" data-options="required:true,showSeconds:true"
						   value="date.format('yyyy-MM-dd hh:mm:ss')" style="width:150px">
				</td>
	        </tr>
	        <tr>
	            <td>项目负责人:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="employee" data-options="required:true"></input>
	            </td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitProjectMainEditForm()">更新</a>
	</div>
</div>
<script type="text/javascript">
	
	var orderEditEditor ;
	$(function(){
		//实例化富文本编辑器
		orderEditEditor = TAOTAO.createEditor("#projectMainEditForm [name=mainName]");
	});
	//同步kindeditor中的内容
	orderEditEditor.sync();
	
	function submitProjectMainEditForm(){
		if(!$('#projectMainEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		orderEditEditor.sync();
		
		$.post("projectMain/update_all",$("#projectMainEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改项目成功!','info',function(){
					$("#projectMainEditWindow").window('close');
					$("#projectMainList").datagrid("reload");
				});
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
</script>
