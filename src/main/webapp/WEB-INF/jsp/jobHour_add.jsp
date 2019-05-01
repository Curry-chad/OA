<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<div style="padding:10px 10px 10px 10px"> 
	<form id="jobHourAddForm" class="orderForm" method="post">
	    <table cellpadding="5" >
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
	    <input type="hidden" name="orderParams"/>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitjobHourAddForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearjobHourAddForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	
	var jobHourAddEditor ;
	//页面初始化完毕后执行此方法
	$(function(){
		//加载文件上传插件
		initOrderAddFileUpload();
		//创建富文本编辑器
		//jobHourAddEditor = TAOTAO.createEditor("#jobHourAddForm [name=file]");
		jobHourAddEditor = KindEditor.create("#jobHourAddForm [name=jobHourNote]", TT.kingEditorParams);
	});
	
	//提交表单
	function submitjobHourAddForm(){
		//有效性验证
		if(!$('#jobHourAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//同步文本框中的订单要求
		jobHourAddEditor.sync();
		
		//ajax的post方式提交表单
		//$("#jobHourAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("jobHour/insert",$("#jobHourAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增报表成功!');
				clearjobHourAddForm();
				$("#jobHourAddWindow").window('close');
				$(".ajax-file-upload-container > .ajax-file-upload-statusbar").remove();
				$("#jobHourList").datagrid("reload");
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
	
	function clearjobHourAddForm(){
		$('#jobHourAddForm').form('reset');
		jobHourAddEditor.html('');
	}
</script>
