<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="jobExitEditForm" class="orderForm" method="post">
		<input type="hidden" name="exitId"/>
	    <table cellpadding="5">
	         <tr>
	            <td>离职流水号:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="exitId" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>离职人:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="employee" data-options="required:true"></input>
	            </td>
	        </tr>
	         <tr>
	            <td>离职岗位:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="exitPost" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>离职薪水:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="exitSalary" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>离职日期:</td>
	            <td>
					<input class="easyui-datetimebox" name="exitDate" data-options="required:true,showSeconds:true"
						   value="date.format('yyyy-MM-dd hh:mm:ss')" style="width:150px">
				</td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitJobExitEditForm()">提交</a>
	</div>
</div>
<script type="text/javascript">
	
	var orderEditEditor ;
	$(function(){
		//实例化富文本编辑器
		orderEditEditor = TAOTAO.createEditor("#EditForm [name=Note]");
	});
	//同步kindeditor中的内容
	orderEditEditor.sync();
	
	function submitJobExitEditForm(){
		if(!$('#jobExitEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		orderEditEditor.sync();
		
		$.post("jobExit/update_all",$("#jobExitEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改报表成功!','info',function(){
					$("#jobExitEditWindow").window('close');
					$("#jobExitList").datagrid("reload");
				});
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
</script>
