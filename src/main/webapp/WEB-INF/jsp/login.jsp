<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/commons/common_js.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="copyright" content="Copyright 2016" />
<meta name="Author" content="东华理工大学软件学院" />
<meta name="keywords" content="OA管理系统--文档管理,项目管理,论坛管理,邮件管理,人事管理,系统管理" />
<meta name="description" content="基于B/S架构的OA/系统登陆页面" />
<title>OA办公管理系统登录页面</title>
<link rel="stylesheet" type="text/css" href="css/login/style.css" />
<script src="js/jquery.min.js"></script>
        <script src="js/jquery.cookie.js"></script>
        <script src="js/jquery.base64.js"></script>
<style type="text/css">
	.download{margin:20px 33px 10px;*margin-bottom:30px;padding:5px;border-radius:3px;-webkit-border-radius:3px;
		-moz-border-radius:3px;background:#e6e6e6;border:1px dashed #df0031;font-size:14px;font-family:Comic Sans MS;
		font-weight:bolder;color:#555}
	.download a{padding-left:5px;font-size:14px;font-weight:normal;color:#555;text-decoration:none;letter-spacing:1px}
	.download a:hover{text-decoration:underline;color:#36F}
	.download span{float:right}
</style>
</head>

<body onload="getCookie();">
	<div class="main">
		<div class="header hide"> OA管理系统  </div>
		<div class="content">
			<div class="title hide">管理系统登录</div>
			<form name="login" action="#" method="post">
				<fieldset>
				
					<!--USERNAME -->
					<div>
						<div class="input">
							<input class="input_all name" name="name" id="username" placeholder="用户名" type="text"
								   onFocus="this.className='input_all name_now';"
								   onBlur="this.className='input_all name'" maxLength="24" />
						</div>
						<div id="username_span"style="display:none;padding-bottom:7px;">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="userspan"></span>
						</div>
							
					</div>
					
					<!-- PASSWORD -->
					<div>
						<div class="input">
							<input class="input_all password" name="password" id="password" type="password"
								   placeholder="密码" onFocus="this.className='input_all password_now';"
								   onBlur="this.className='input_all password'" maxLength="24" />
						</div>
						
						<div id="password_span"style="display:none;margin:0 0 0 0;padding:0 0 0 0;">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="passwordspan"></span>
						</div>
	
						<div style="margin-bottom:12px">
							<div id="randiv" style="display:none;margin-left:98px;">
							
								验证码：<input id="randomcode" name="randomcode" size="8" /> <img
									id="randomcode_img" src="${baseurl}validatecode.jsp" alt=""
									width="56" height="20" align='absMiddle' /> <a
									href=javascript:randomcode_refresh()>刷新</a>
							</div>
							<div style="margin-left:98px;">
								<span id="randomcode_span"></span>
							</div>
						</div>
					</div>
					
					<!-- REMEMBERME -->					
					<div class="checkbox">
						<input type="checkbox" name="remember" id="remember" checked="checked"/>
						<label for="remember">
							<span>记住密码</span>
						</label>
						<span id="errorspan" style="margin-left:88px;"></span>
					</div>

					<!-- LOGIN -->
					<!-- 
						<div class="enter">
							<input class="button hide" name="submit" type="submit" value="登录" />
						</div> 
					-->
					<div>
						<a href="#" id="login" class="button hide">登录</a>
					</div>
					
				</fieldset>
			</form>
		</div>
	</div>
<script type="text/javascript" src="js/login/placeholder.js"></script>
<script type="text/javascript">
		$("#login")
				.click(
						function() {
                           
							var uname = $("#username");
							var pwd = $("#password");
							var display = $("#randiv").css('display');
							var rcode = $("#randomcode");

							if (display == 'none') {
								if ($.trim(uname.val()) == "") {
									$('#username_span').css('display','block');
									$("#passwordspan").html("");
									$("#userspan")
											.html(
													"<font color='red'>用户名不能为空！</font>");
									uname.focus();
								} else if ($.trim(pwd.val()) == "") {
									$('#username_span').css('display','none');
									$('#password_span').css('display','block');
									$("#userspan").html("");
									$("#passwordspan").html(
											"<font color='red'>密码不能为空！</font>");
									pwd.focus();
								} else {
									$('#password_span').css('display','none');
									$("#userspan").html("");
									$("#passwordspan").html("");
									//判断是否选中复选框，如果选中，添加cookie  
					                var jizhupwd=$("input[type='checkbox']").is(':checked');
					                console.log("是否记住密码："+jizhupwd);
					                if(jizhupwd){    
					                    //添加cookie    
					                    setCookie();      
					                }else{    
					                    clearAllCookie();
					                }  
									$
											.ajax({
												url : '${baseurl}ajaxLogin',// 跳转到 action  
												data : {
													username : uname.val(),
													password : pwd.val(),
												},
												type : 'post',
												cache : false,
												dataType : 'json',
												success : function(data) {
													if (data.msg == 'account_error') {
												console.log("account_erroe.");
														$("#errorspan")
																.html(
																		"<font color='red'> 用户不存在！</font>");
														rcode_flag = 1;
														$("#randiv").show();
													} else if (data.msg == 'password_error') {
														$("#errorspan")
																.html(
																		"<font color='red'> 密码错误！</font>");
														rcode_flag = 1;
														$("#randiv").show();
													} else if (data.msg == 'authentication_error') {
														$("#errorspan")
																.html(
																		"<font color='red'> 您没有授权！</font>");
														rcode_flag = 1;
														$("#randiv").show();
													} else {
														location.href = "${baseurl}home";
													}
												},
												error : function() {
													// view("异常！");  
													alert("异常！");
												}
											});
								}
							} else {
								$("#errorspan").html("");
								if ($.trim(uname.val()) == "") {
									$("#passwordspan").html("");
									$("#userspan")
											.html(
													"<font color='red'>用户名不能为空！</font>");
									uname.focus();
								} else if ($.trim(pwd.val()) == "") {
									$("#userspan").html("");
									$("#passwordspan").html(
											"<font color='red'>密码不能为空！</font>");
									pwd.focus();
								} else if ($.trim(rcode.val()) == "") {
									$("#userspan").html("");
									$("#randomcode_span")
											.html(
													"<font color='red'>验证码不能为空！</font>");
									rcode.focus();
								} else {
									
									//判断是否选中复选框，如果选中，添加cookie  
					                var jizhupwd=$("input[type='checkbox']").is(':checked');
					                console.log("是否记住密码："+jizhupwd);
					                if(jizhupwd){    
					                    //添加cookie    
					                    setCookie();      
					                }else{    
					                    clearAllCookie();
					                }  
									$("#userspan").html("");
									$("#passwordspan").html("");
									$("#randomcode_span").html("");
									$
											.ajax({
												url : '${baseurl}ajaxLogin',// 跳转到 action  
												data : {
													username : uname.val(),
													password : pwd.val(),
													randomcode : rcode.val(),
												},
												type : 'post',
												cache : false,
												dataType : 'json',
												success : function(data) {
													if (data.msg == 'account_error') {
														$("#errorspan")
																.html(
																		"<font color='red'> 用户不存在！</font>");
														rcode_flag = true;
														randomcode_refresh();
													} else if (data.msg == 'password_error') {
														$("#errorspan")
																.html(
																		"<font color='red'> 密码错误！</font>");
														rcode_flag = true;
														randomcode_refresh();
													} else if (data.msg == 'randomcode_error') {
														$("#errorspan")
																.html(
																		"<font color='red'> 验证码错误！</font>");
														rcode_flag = true;
														randomcode_refresh();
													} else if (data.msg == 'authentication_error') {
														$("#errorspan")
																.html(
																		"<font color='red'> 您没有授权！</font>");
														rcode_flag = true;
														randomcode_refresh();
													} else {
														location.href = "${baseurl}home";
													}
												},
												error : function() {
													// view("异常！");  
													alert("异常！");
												}
											});
								}
							}
						});

		//刷新验证码
		//实现思路，重新给图片的src赋值，后边加时间，防止缓存
		function randomcode_refresh() {
			$("#randomcode_img").attr('src',
					'${baseurl}validatecode.jsp?time' + new Date().getTime());
		}
		function setCookie(){   
            var loginCode = $("#username").val(); //获取用户名信息    
            var pwd = $("#password").val(); //获取登陆密码信息    
            var checked = $("input[type='checkbox']").is(':checked');//获取“是否记住密码”复选框  
              //console.log("setCookie方法是否记住密码："+checked);
            if(checked){ //判断是否选中了“记住密码”复选框    
                //设置cookie过期时间
                var date = new Date();
               date.setTime(date.getTime()+60*1000);//只能这么写，60表示60秒钟
               //console.log("cookie过期时间："+date);
               $.cookie("login_code",loginCode,{ expires: date, path: '/' });//调用jquery.cookie.js中的方法设置cookie中的用户名    
               $.cookie("pwd",$.base64.encode(pwd),{ expires: date, path: '/' });//调用jquery.cookie.js中的方法设置cookie中的登陆密码，并使用base64（jquery.base64.js）进行加密
            }else{     
                $.cookie("login_code", null);  
               $.cookie("pwd", null);     
            }      
       } 
		 //清除所有cookie函数
        function clearAllCookie() {
            var date=new Date();
            date.setTime(date.getTime()-10000);
            var keys=document.cookie.match(/[^ =;]+(?=\=)/g);
            console.log("需要删除的cookie名字："+keys);
            if (keys) {
                for (var i =  keys.length; i--;)
                  document.cookie=keys[i]+"=0; expire="+date.toGMTString()+"; path=/";
            }
        }
      //获取cookie    
        function getCookie(){ 
    	 
             var loginCode = $.cookie("login_code"); //获取cookie中的用户名    
             var pwd =  $.cookie("pwd"); //获取cookie中的登陆密码  
             console.log("获取cookie:账户："+loginCode);
             console.log("获取cookie:密码："+pwd);
             if (!loginCode||loginCode==0) {
                  console.log("账户："+!loginCode);
                  //alert("请输出内容！");
             }else{
                 $("#username").val(loginCode);   
             }
             if(!pwd||pwd==0){
                 console.log("密码："+!pwd);
             }else{
                 //密码存在的话把密码填充到密码文本框    
                 //console.log("密码解密后："+$.base64.decode(pwd));
                $("#password").val($.base64.decode(pwd));
                //密码存在的话把“记住用户名和密码”复选框勾选住    
                $("[name='remember']").attr("checked","true");
             }
                 
        } 

	</script>
<!--[if IE 6]>
<script type="text/javascript" src="js/login/belatedpng.js" ></script>
<script type="text/javascript">
	DD_belatedPNG.fix("*");
</script>
<![endif]--></body>
</html>