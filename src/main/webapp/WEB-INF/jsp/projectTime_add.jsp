<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<div style="padding:10px 10px 10px 10px"> 
	<form id="projectTimeAddForm" class="orderForm" method="post">
	    <table cellpadding="5" >
	        <tr>
	            <td>项目时间编号:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="timeId" data-options="required:true"></input>
	            </td>
	        </tr>
	         <tr>
	            <td>项目实际开始日期:</td>
	            <td>
					<input class="easyui-datetimebox" name="timeStart" data-options="required:true,showSeconds:true"
						   value="date.format('yyyy-MM-dd hh:mm:ss')" style="width:150px">
				</td>
	        </tr>
	        <tr>
	            <td>项目实际结束日期:</td>
	            <td>
					<input class="easyui-datetimebox" name="timeEnd" data-options="required:true,showSeconds:true"
						   value="date.format('yyyy-MM-dd hh:mm:ss')" style="width:150px">
				</td>
	        </tr>
	    </table>
	    <input type="hidden" name="orderParams"/>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitprojectTimeAddForm()">发布</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearprojectTimeAddForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	
	var projectTimeAddEditor ;
	//页面初始化完毕后执行此方法
	$(function(){
		//加载文件上传插件
		initOrderAddFileUpload();
		//创建富文本编辑器
		//projectTimeAddEditor = TAOTAO.createEditor("#projectTimeAddForm [name=file]");
		projectTimeAddEditor = KindEditor.create("#projectTimeAddForm [name=projectTimeText]", TT.kingEditorParams);
	});
	
	//提交表单
	function submitprojectTimeAddForm(){
		//有效性验证
		if(!$('#projectTimeAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//同步文本框中的订单要求
		projectTimeAddEditor.sync();
		
		//ajax的post方式提交表单
		//$("#projectTimeAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("projectTime/insert",$("#projectTimeAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增项目时间成功!');
				clearprojectTimeAddForm();
				$("#projectTimeAddWindow").window('close');
				$(".ajax-file-upload-container > .ajax-file-upload-statusbar").remove();
				$("#projectTimeList").datagrid("reload");
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
	
	function clearprojectTimeAddForm(){
		$('#projectTimeAddForm').form('reset');
		projectTimeAddEditor.html('');
	}
</script>
