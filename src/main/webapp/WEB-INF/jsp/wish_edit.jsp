<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="wishEditForm" class="orderForm" method="post">
		<input type="hidden" name="wishId"/>
	    <table cellpadding="5">
	        <tr>
	            <td>心声内容:</td>
	            <td>
	                <textarea style="width:800px;height:300px;visibility:hidden;" name="wishText"></textarea>
	            </td>
	        </tr>
	        <tr>
	            <td>发布日期:</td>
	            <td>
					<input class="easyui-datetimebox" name="wishDate" data-options="required:true,showSeconds:true"
						   value="date.format('yyyy-MM-dd hh:mm:ss')" style="width:150px">
				</td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitWishEditForm()">更新</a>
	</div>
</div>
<script type="text/javascript">
	
	var orderEditEditor ;
	$(function(){
		//实例化富文本编辑器
		orderEditEditor = TAOTAO.createEditor("#wishEditForm [name=wishText]");
	});
	//同步kindeditor中的内容
	orderEditEditor.sync();
	
	function submitWishEditForm(){
		if(!$('#wishEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		orderEditEditor.sync();
		
		$.post("wish/update_all",$("#wishEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改心声成功!','info',function(){
					$("#wishEditWindow").window('close');
					$("#wishList").datagrid("reload");
				});
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
</script>
