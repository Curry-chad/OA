<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="jobHourEditForm" class="orderForm" method="post">
		<input type="hidden" name="hourId"/>
	    <table cellpadding="5">
	         <tr>
	            <td>工时流水号:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="hourId" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>员工姓名:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="employee" data-options="required:true"></input>
	            </td>
	        </tr>
	         <tr>
	            <td>当月工时:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="hourTime" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>休假工时:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="hourRest" data-options="required:true"></input>
	            </td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitJobHourEditForm()">提交</a>
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
	
	function submitJobHourEditForm(){
		if(!$('#jobHourEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		orderEditEditor.sync();
		
		$.post("jobHour/update_all",$("#jobHourEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改报表成功!','info',function(){
					$("#jobHourEditWindow").window('close');
					$("#jobHourList").datagrid("reload");
				});
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
</script>
