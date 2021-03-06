<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<div style="padding:10px 10px 10px 10px"> 
	<form id="technologyAddForm" class="orderForm" method="post">
	    <table cellpadding="5" >
	        <tr>
	            <td>技术资料编号:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="technologyId" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>技术资料类型:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="technologyType" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>技术资料主题:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="technologyTheme" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>上传日期:</td>
	            <td>
					<input class="easyui-datetimebox" name="technologyDate" data-options="required:true,showSeconds:true"
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
	                 <input type="hidden" id="orderAddFile" name="technologyFile"/>
	            </td>
	        </tr>
	        <tr>
	            <td>技术资料备注:</td>
	            <td>
	                <textarea style="width:800px;height:300px;visibility:hidden;" name="technologyNote"></textarea>
	            </td>
	        </tr>
	    </table>
	    <input type="hidden" name="orderParams"/>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submittechnologyAddForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="cleartechnologyAddForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	
	var technologyAddEditor ;
	//页面初始化完毕后执行此方法
	$(function(){
		//加载文件上传插件
		initOrderAddFileUpload();
		//创建富文本编辑器
		//technologyAddEditor = TAOTAO.createEditor("#technologyAddForm [name=file]");
		technologyAddEditor = KindEditor.create("#technologyAddForm [name=technologyNote]", TT.kingEditorParams);
	});
	
	//提交表单
	function submittechnologyAddForm(){
		//有效性验证
		if(!$('#technologyAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//同步文本框中的订单要求
		technologyAddEditor.sync();
		
		//ajax的post方式提交表单
		//$("#technologyAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("technology/insert",$("#technologyAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增技术资料成功!');
				cleartechnologyAddForm();
				$("#technologyAddWindow").window('close');
				$(".ajax-file-upload-container > .ajax-file-upload-statusbar").remove();
				$("#technologyList").datagrid("reload");
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
	
	function cleartechnologyAddForm(){
		$('#technologyAddForm').form('reset');
		technologyAddEditor.html('');
	}
</script>
