<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<div style="padding:10px 10px 10px 10px"> 
	<form id="projectCostAddForm" class="orderForm" method="post">
	    <table cellpadding="5" >
	        <tr>
	            <td>流水号:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="costId" data-options="required:true"></input>
	            </td>
	        </tr>
	         <tr>
	            <td>项目名称:</td>
	            <td>
					<input class="easyui-textbox" type="text" name="projectMain.mainName" data-options="required:true"></input>
				</td>
	        </tr>
	        <tr>
	            <td>预计成本:</td>
	            <td>
					<input class="easyui-textbox" type="text" name="costExpect" data-options="required:true"></input>
				</td>
	        </tr>
	        <tr>
	            <td>实际成本:</td>
	            <td>
					<input class="easyui-textbox" type="text" name="costFact" data-options="required:true"></input>
				</td>
	        </tr>
	    </table>
	    <input type="hidden" name="orderParams"/>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitprojectCostAddForm()">发布</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearprojectCostAddForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	
	var projectCostAddEditor ;
	//页面初始化完毕后执行此方法
	$(function(){
		//加载文件上传插件
		initOrderAddFileUpload();
		//创建富文本编辑器
		//projectCostAddEditor = TAOTAO.createEditor("#projectCostAddForm [name=file]");
		projectCostAddEditor = KindEditor.create("#projectCostAddForm [name=projectCostText]", TT.kingEditorParams);
	});
	
	//提交表单
	function submitprojectCostAddForm(){
		//有效性验证
		if(!$('#projectCostAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//同步文本框中的订单要求
		projectCostAddEditor.sync();
		
		//ajax的post方式提交表单
		//$("#projectCostAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("projectCost/insert",$("#projectCostAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增项目时间成功!');
				clearprojectCostAddForm();
				$("#projectCostAddWindow").window('close');
				$(".ajax-file-upload-container > .ajax-file-upload-statusbar").remove();
				$("#projectCostList").datagrid("reload");
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
	}
	
	function clearprojectCostAddForm(){
		$('#projectCostAddForm').form('reset');
		projectCostAddEditor.html('');
	}
</script>
