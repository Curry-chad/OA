<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<div style="padding:10px 10px 10px 10px"> 
	<form id="workAddForm" class="orderForm" method="post">
	    <table cellpadding="5" >
	        <tr>
	            <td>讨论编号:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="workId" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>讨论内容:</td>
	            <td>
	                <textarea style="width:800px;height:300px;visibility:hidden;" name="workText"></textarea>
	            </td>
	        </tr>
	        <tr>
	            <td>讨论日期:</td>
	            <td>
					<input class="easyui-datetimebox" name="workDate" data-options="required:true,showSeconds:true"
						   value="date.format('yyyy-MM-dd hh:mm:ss')" style="width:150px">
				</td>
	        </tr>
	        <tr>
	            <td>讨论人:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="employee" data-options="required:true"></input>
	            </td>
	        </tr>
	    </table>
	    <input type="hidden" name="orderParams"/>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitworkAddForm()">发布</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearworkAddForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	
	var workAddEditor ;
	//页面初始化完毕后执行此方法
	$(function(){
		//加载文件上传插件
		initOrderAddFileUpload();
		//创建富文本编辑器
		//workAddEditor = TAOTAO.createEditor("#workAddForm [name=file]");
		workAddEditor = KindEditor.create("#workAddForm [name=workText]", TT.kingEditorParams);
	});
	
	//提交表单
	function submitworkAddForm(){
		//有效性验证
		if(!$('#workAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//同步文本框中的订单要求
		workAddEditor.sync();
		
		//ajax的post方式提交表单
		//$("#workAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("forumWork/insert",$("#workAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增工作讨论成功!');
				clearworkAddForm();
				$("#workAddWindow").window('close');
				$(".ajax-file-upload-container > .ajax-file-upload-statusbar").remove();
				$("#workList").datagrid("reload");
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
	
	function clearworkAddForm(){
		$('#workAddForm').form('reset');
		workAddEditor.html('');
	}
</script>
