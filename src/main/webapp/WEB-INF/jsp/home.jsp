<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@page import="org.apache.shiro.session.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/commons/common_js.jsp"%>
<%@ include file="/WEB-INF/jsp/commons/common_css.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OA办公管理系统</title>
<style type="text/css">
.content {
	padding: 10px 10px 10px 10px;
}
.divNorth{
	background:url('image/TitleBackground.jpg') no-repeat center center;
	background-size:100% 100%;
}
</style>
</head>
<body class="easyui-layout">

	<!-- North Title -->
	<div class="divNorth" style="height:100px;" data-options="region:'north'" >
		<table id="_TableHeader" width="100%" border="0" cellpadding="0"
		cellspacing="0" class="bluebg">
		<tbody>
			<tr>
				<td valign="top">
					<div style="position:relative;">
						<div style="text-align:right;font-size:15px;margin:2px 0 0 0;">
							<span style="display:inline-block;font-size:20px;color:#c1dff7;margin:0 0 8px 0;">
								东华理工大学软件学院
							</span><br/>
							
							<span style="color:#c1dff7;">${activeUser.rolename}:</span>
							<span style="color:#c1dff7;">
								${activeUser.username}
							</span>
						    &nbsp;<a href="logout" style="text-decoration:none;color:#A9C3D6;"> 退出</a>&nbsp;  &nbsp; 
						</div>
					</div>
				</td>
			</tr>
		</tbody>
	</table>
	</div>
	
	<!-- <div data-options="region:'west',title:'功能菜单',split:true"
		style="width:213px;"> -->
	<div id="HomeFuncAccordion" class="easyui-accordion" style="width:213px;"
		data-options="region:'west',title:'功能菜单',split:false">
		<div title="功能搜索"
			data-options="iconCls:'icon-search',collapsed:false,collapsible:false"
			style="padding:10px;">
			<input id="HomeFuncSearch" class="easyui-searchbox" 
				data-options={prompt:'请输入想要搜索的功能'}
				searcher="doSearch" 
				style="width:178px;height:25px;">
			<!---------------------------------------------------->
			<!-- http://www.jeasyui.net/demo/408.html#  ExpandTo-->
			<!---------------------------------------------------->
		</div>

		<div title="文档管理" data-options="selected:true" style="padding:10px;">
			<ul id="scheduleMonitor" class="easyui-tree" data-options="animate:true,lines:true">
				<li><span>文档管理</span>
					<ul>
						<li id=11 data-options="attributes:{'url':'processDocument/find'}">过程文档管理</li>
					</ul>
					<ul>
						<li id=12 data-options="attributes:{'url':'report/find'}">报表管理</li>
					</ul>
					<ul>
						<li id=13 data-options="attributes:{'url':'product/find'}">技术资料管理</li>
					</ul>
					<ul>
						<li id=14 data-options="attributes:{'url':'work/find'}">通知文件管理</li>
					</ul>
					<ul>
						<li id=15 data-options="attributes:{'url':'manufacture/find'}">工作计划管理</li>
					</ul>
					<ul>
						<li id=16 data-options="attributes:{'url':'task/find'}">公告栏</li>
					</ul>
				</li>
			</ul>
		</div>

		<div title="项目管理" data-options="selected:true" style="padding:10px">
			<ul id="deviceMonitor" class="easyui-tree" data-options="animate:true,lines:true">
				<li><span>项目管理</span>
					<ul>
						<li id=21 data-options="attributes:{'url':'device/deviceList'}">项目总体概况</li>
						<li id=22 data-options="attributes:{'url':'device/deviceType'}">项目时间管理</li>
						<li id=23 data-options="attributes:{'url':'device/deviceCheck'}">项目质量管理</li>
						<li id=24 data-options="attributes:{'url':'device/deviceFault'}">项目成本管理</li>
						<li id=25 data-options="attributes:{'url':'device/deviceMaintain'}">项目范围管理</li>
					</ul></li>
			</ul>
		</div>

		<div title="论坛管理" data-options="selected:true" style="padding:10px">
			<ul id="technologyMonitor" class="easyui-tree" data-options="animate:true,lines:true">
				<li><span>论坛管理</span>
					<ul>
						<li id=31 data-options="attributes:{'url':'technology/find'}">工作讨论</li>
						<li id=32 data-options="attributes:{'url':'technologyRequirement/find'}">心声社区</li>
						<li id=33 data-options="attributes:{'url':'technologyPlan/find'}">寻物启事</li>
					</ul>
				</li>
			</ul>
		</div>
		
		<div title="邮件管理" data-options="selected:true" style="padding:10px">
		
			<ul id="materialMonitor" class="easyui-tree" data-options="animate:true,lines:true">
				<li><span>邮件管理 </span>
					<ul>
						<li id=41 data-options="attributes:{'url':'material/find'}">发件箱</li>
						<li id=42 data-options="attributes:{'url':'materialReceive/find'}">收件箱</li>
				    	<li id=43 data-options="attributes:{'url':'materialConsume/find'}">查询邮件</li>	 					
					</ul>
				</li>
			</ul>
		</div>
		
		<div title="工作流" data-options="selected:true" style="padding:10px;">
			<ul id="qualifyMonitor" class="easyui-tree"
				data-options="animate:true,lines:true">
				<li><span>工作流</span>
					<ul>
						<li id=51 data-options="attributes:{'url':'unqualify/find'}">入职办理</li>
						<li id=52 data-options="attributes:{'url':'measure/find'}">离职办理</li>
						<li id=53 data-options="attributes:{'url':'f_count_check/find'}">工时管理</li>
						<li id=54 data-options="attributes:{'url':'p_measure_check/find'}">休假流程</li>
					</ul>
				</li>
			</ul>

		</div>
		
		<div title="人事管理" data-options="selected:true" style="padding:10px">
			<ul id="employeeMonitor" class="easyui-tree"
				data-options="animate:true,lines:true">
				<li><span>人事管理</span>
					<ul>
						<li id=61 data-options="attributes:{'url':'department/find'}">部门管理</li>
					</ul>
					<ul>
						<li id=62 data-options="attributes:{'url':'employee/find'}">员工管理</li>
					</ul>
				</li>
			</ul>
		</div>
		
		<c:if test="${activeUser.rolename == '超级管理员' }">
			<div title="系统管理" style="padding:10px;">
	
				<ul id="sysManager" class="easyui-tree"
					data-options="animate:true,lines:true">
					<li><span>系统管理</span>
						<ul>
							<li data-options="attributes:{'url':'user/find'}">用户管理</li>
						</ul>
						<ul>
							<li data-options="attributes:{'url':'role/find'}">角色管理</li>
						</ul>
					</li>
				</ul>
			</div>
		</c:if>
	</div>

	<!-- </div> -->
	<div id="MainPage" data-options="region:'center',title:''">
		<div id="tabs" class="easyui-tabs">
			<div title="首页" style="padding:20px;"></div>
		</div>
	</div>
	
	<script type="text/javascript">

		var allItem = [
						["文档管理","过程文档管理","报表管理","技术资料管理","通知文件管理","工作计划管理","公告栏"], 
						["项目管理","项目总体概况","项目时间管理","项目质量管理","项目成本管理","项目范围管理"],
						["论坛管理","工作交流","心声社区","寻物启事"],
						["邮件管理","收件箱","发件箱","查询邮件"],
						["工作流","入职办理","离职办理","工时管理","休假管理"],
						["人事管理","部门管理","员工管理"]
					  ];
					  
		function isContains(str, substr) {
		    return new RegExp(substr).test(str);
		}
		
		//HomeFuncSearch
		function doSearch(value){
			var subItem;
			var ifElseContain = false;
			for (var i = 0; i < allItem.length; i++) {
				for (var j = 0; j < allItem[i].length; j++) {
					subItem = allItem[i][j];
					if(isContains(subItem,value) && value!=""){
						ifElseContain=true;
						if(j==0){
							switch(i){
								case 0 : 
									$('#HomeFuncAccordion').accordion('select',allItem[0][0]);
									var node = $('#scheduleMonitor').tree('find',11);
									$('#scheduleMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								case 1 :
									$('#HomeFuncAccordion').accordion('select',allItem[1][0]);
									var node = $('#deviceMonitor').tree('find',21);
									$('#deviceMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								case 2 :
									$('#HomeFuncAccordion').accordion('select',allItem[2][0]);
									var node = $('#technologyMonitor').tree('find',31);
									$('#technologyMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								case 3 :
									$('#HomeFuncAccordion').accordion('select',allItem[3][0]);
									var node = $('#materialMonitor').tree('find',41);
									$('#materialMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								case 4 :
									$('#HomeFuncAccordion').accordion('select',allItem[4][0]);
									var node = $('#qualifyMonitor').tree('find',51);
									$('#qualifyMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								case 5 :
									$('#HomeFuncAccordion').accordion('select',allItem[5][0]);
									var node = $('#employeeMonitor').tree('find',61);
									$('#employeeMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								default:
									break; 
							}
						}else if(j>0){
							var k = (i+1)*10+j;
							switch(i){
								case 0 : 
									$('#HomeFuncAccordion').accordion('select',allItem[0][0]);
									var node = $('#scheduleMonitor').tree('find',k);
									$('#scheduleMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								case 1 :
									$('#HomeFuncAccordion').accordion('select',allItem[1][0]);
									var node = $('#deviceMonitor').tree('find',k);
									$('#deviceMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								case 2 :
									$('#HomeFuncAccordion').accordion('select',allItem[2][0]);
									var node = $('#technologyMonitor').tree('find',k);
									$('#technologyMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								case 3 :
									$('#HomeFuncAccordion').accordion('select',allItem[3][0]);
									var node = $('#materialMonitor').tree('find',k);
									$('#materialMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								case 4 :
									$('#HomeFuncAccordion').accordion('select',allItem[4][0]);
									var node = $('#qualifyMonitor').tree('find',k);
									$('#qualifyMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								case 5 :
									$('#HomeFuncAccordion').accordion('select',allItem[5][0]);
									var node = $('#employeeMonitor').tree('find',k);
									$('#employeeMonitor').tree('expandTo', node.target).tree('select', node.target);
									break;
								default:
									break; 
							}
							
						}
						break;
					}
				}
				if(ifElseContain==true){
					break;
				}
			}
		}  
		
		$(function() {
			/* Schedule Manager Tree onClick Event */
			$('#scheduleMonitor').tree({
				onClick : function(node) {
					if ($('#scheduleMonitor').tree("isLeaf", node.target)) {
						var tabs1 = $("#tabs");
						var tab1 = tabs1.tabs("getTab", node.text);
						if (tab1) {
							tabs1.tabs("select", node.text);
						} else {
							tabs1.tabs('add', {
								title : node.text,
								href : node.attributes.url,
								closable : true,
								bodyCls : "content"
							});
						}
					}
				}
			});
	
			/* Device Manager Tree onClick Event */
			$('#deviceMonitor').tree({
				onClick : function(node) {
					/* debugger; */
					if ($('#deviceMonitor').tree("isLeaf", node.target)) {
						var tabs2 = $("#tabs");
						var tab2 = tabs2.tabs("getTab", node.text);
						if (tab2) {
							tabs2.tabs("select", node.text);
						} else {
							tabs2.tabs('add', {
								title : node.text,
								href : node.attributes.url,
								closable : true,
								bodyCls : "content"
							});
						}
					}
				}
			});
			
			/* Material Manager Tree onClick Event */
			$('#materialMonitor').tree({
				onClick : function(node) {
					if ($('#materialMonitor').tree("isLeaf", node.target)) {
					var tabs2 = $("#tabs");
						var tab2 = tabs2.tabs("getTab", node.text);
						if (tab2) {
							tabs2.tabs("select", node.text);
						} else {
							tabs2.tabs('add', {
								title : node.text,
								href : node.attributes.url,
								closable : true,
								bodyCls : "content"
							});
						}
					}
				}
			});
			
			/* qualify Manager Tree onClick Event */
			$('#qualifyMonitor').tree({
				onClick : function(node) {
					if ($('#qualifyMonitor').tree("isLeaf", node.target)) {
						var tabs1 = $("#tabs");
						var tab1 = tabs1.tabs("getTab", node.text);
						if (tab1) {
							tabs1.tabs("select", node.text);
						} else {
							tabs1.tabs('add', {
								title : node.text,
								href : node.attributes.url,
								closable : true,
								bodyCls : "content"
							});
						}
					}
				}
			});
			
			/* Technology Manager Tree onClick Event */
			$('#technologyMonitor').tree({
				onClick : function(node) {
					if ($('#technologyMonitor').tree("isLeaf", node.target)) {
						var tabs3 = $("#tabs");
						var tab3 = tabs3.tabs("getTab", node.text);
						if (tab3) {
							tabs3.tabs("select", node.text);
						} else {
							tabs3.tabs('add', {
								title : node.text,
								href : node.attributes.url,
								closable : true,
								bodyCls : "content"
							});
						}
					}
				}
			});
			
			/* Device Manager Tree onClick Event */
			$('#employeeMonitor').tree({
				onClick : function(node) {
					/* debugger; */
					if ($('#deviceMonitor').tree("isLeaf", node.target)) {
						var tabs2 = $("#tabs");
						var tab2 = tabs2.tabs("getTab", node.text);
						if (tab2) {
							tabs2.tabs("select", node.text);
						} else {
							tabs2.tabs('add', {
								title : node.text,
								href : node.attributes.url,
								closable : true,
								bodyCls : "content"
							});
						}
					}
				}
			});
			
			/* Sys Manager Tree onClick Event */
			$('#sysManager').tree({
				onClick : function(node) {
					if ($('#sysManager').tree("isLeaf", node.target)) {
						var tabs3 = $("#tabs");
						var tab3 = tabs3.tabs("getTab", node.text);
						if (tab3) {
							tabs3.tabs("select", node.text);
						} else {
							tabs3.tabs('add', {
								title : node.text,
								href : node.attributes.url,
								closable : true,
								bodyCls : "content"
							});
						}
					}
				}
			});
						
	});
		
	</script>
</body>
</html>