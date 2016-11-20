<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Add successfully.
<s:property value="user.name"/>
<br/>
<br/>
<!-- 对于ValueStack的取值，StackContext中的需要用# -->
username:<s:property value="#session.username"></s:property>
<s:debug></s:debug>
</body>
</html>