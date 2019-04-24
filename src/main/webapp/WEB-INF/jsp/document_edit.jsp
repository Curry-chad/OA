<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="documentEditForm" class="orderForm" method="post">
		<input type="hidden" name="documentId"/>
	    <table cellpadding="5">
	        <tr>
	            <td>文档类型:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="documentType" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>文档主题:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="documentTheme" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>上传日期:</td>
	            <td>
					<input class="easyui-datetimebox" name="documentDate" data-options="required:true,showSeconds:true"
						   value="date.format('yyyy-MM-dd hh:mm:ss')" style="width:150px">
				</td>
	        </tr>
	        <tr>
	            <td>附件:</td>
	            <td>
	                 <!-- <iframe src="file_upload.jsp"></iframe>  -->
	                 <div id="documentEditFileUploader">上传文件</div>
	                 <input type="hidden" id="documentEditFile" name="documentFile"/>
	            </td>
	        </tr>
	        <tr>
	            <td>文档备注:</td>
	            <td>
	                <textarea style="width:800px;height:300px;visibility:hidden;" name="documentNote"></textarea>
	            </td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitDocumentEditForm()">提交</a>
	</div>
</div>
<script type="text/javascript">
	
	var orderEditEditor ;
	$(function(){
		//实例化富文本编辑器
		orderEditEditor = TAOTAO.createEditor("#documentEditForm [name=documentNote]");
	});
	//同步kindeditor中的内容
	orderEditEditor.sync();
	
	function submitDocumentEditForm(){
		if(!$('#documentEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		orderEditEditor.sync();
		
		$.post("processDocument/update_all",$("#documentEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改过程文档成功!','info',function(){
					$("#documentEditWindow").window('close');
					$("#documentList").datagrid("reload");
				});
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
</script>
