<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<div style="padding:10px 10px 10px 10px"> 
	<form id="projectMainAddForm" class="orderForm" method="post">
	    <table cellpadding="5" >
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
	    <input type="hidden" name="orderParams"/>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitprojectMainAddForm()">发布</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearprojectMainAddForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	
	var projectMainAddEditor ;
	//页面初始化完毕后执行此方法
	$(function(){
		//加载文件上传插件
		initOrderAddFileUpload();
		//创建富文本编辑器
		//projectMainAddEditor = TAOTAO.createEditor("#projectMainAddForm [name=file]");
		projectMainAddEditor = KindEditor.create("#projectMainAddForm [name=mainName]", TT.kingEditorParams);
	});
	
	//提交表单
	function submitprojectMainAddForm(){
		//有效性验证
		if(!$('#projectMainAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//同步文本框中的订单要求
		projectMainAddEditor.sync();
		
		//ajax的post方式提交表单
		//$("#projectMainAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("projectMain/insert",$("#projectMainAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增项目总体概况成功!');
				clearprojectMainAddForm();
				$("#projectMainAddWindow").window('close');
				$(".ajax-file-upload-container > .ajax-file-upload-statusbar").remove();
				$("#projectMainList").datagrid("reload");
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
	
	function clearprojectMainAddForm(){
		$('#projectMainAddForm').form('reset');
		projectMainAddEditor.html('');
	}
</script>
