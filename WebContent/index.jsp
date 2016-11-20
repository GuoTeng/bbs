<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Page</title>

</head>
<body>
	<!-- 对于/bbs/user_add来说，从/bbs后才是struts里面配置的东西 -->
	<form action="/bbs/user_add" method="post">
		<s:property value="getText('login.username')"/>:<input type="text" name="user.name"/>
		<s:property value="getText('login.age')"/>:<input type="text" name="user.age"/>
		<input type="submit" value="提交"/>
	
	</form>
	<br/>
	<a href="/bbs/login?request_locale=zh_CN">China</a>
	<a href="/bbs/login?request_locale=en_US">US</a>
</body>
</html>