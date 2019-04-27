<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<div style="padding:10px 10px 10px 10px"> 
	<form id="noticeAddForm" class="orderForm" method="post">
	    <table cellpadding="5" >
	        <tr>
	            <td>通知文件编号:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="noticeId" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>通知文件类型:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="noticeType" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>通知文件主题:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="noticeTheme" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>上传日期:</td>
	            <td>
					<input class="easyui-datetimebox" name="noticeDate" data-options="required:true,showSeconds:true"
						   value="date.format('yyyy-MM-dd hh:mm:ss')" style="width:150px">
				</td>
	        </tr>
	        <tr>
	            <td>上传人:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="employee" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>附件:</td>
	            <td>
	                 <!-- <iframe src="file_upload.jsp"></iframe>  -->
	                 <div id="orderAddFileUploader">上传文件</div>
	                 <input type="hidden" id="orderAddFile" name="noticeFile"/>
	            </td>
	        </tr>
	        <tr>
	            <td>通知文件备注:</td>
	            <td>
	                <textarea style="width:800px;height:300px;visibility:hidden;" name="noticeNote"></textarea>
	            </td>
	        </tr>
	    </table>
	    <input type="hidden" name="orderParams"/>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitnoticeAddForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearnoticeAddForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	
	var noticeAddEditor ;
	//页面初始化完毕后执行此方法
	$(function(){
		//加载文件上传插件
		initOrderAddFileUpload();
		//创建富文本编辑器
		//noticeAddEditor = TAOTAO.createEditor("#noticeAddForm [name=file]");
		noticeAddEditor = KindEditor.create("#noticeAddForm [name=noticeNote]", TT.kingEditorParams);
	});
	
	//提交表单
	function submitnoticeAddForm(){
		//有效性验证
		if(!$('#noticeAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//同步文本框中的订单要求
		noticeAddEditor.sync();
		
		//ajax的post方式提交表单
		//$("#noticeAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("notice/insert",$("#noticeAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增通知文件成功!');
				clearnoticeAddForm();
				$("#noticeAddWindow").window('close');
				$(".ajax-file-upload-container > .ajax-file-upload-statusbar").remove();
				$("#noticeList").datagrid("reload");
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
	
	function clearnoticeAddForm(){
		$('#noticeAddForm').form('reset');
		noticeAddEditor.html('');
	}
</script>
