<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Page</title>

</head>
<body>
	<form action="/bbs/user_add" method="post">
		Username:<input type="text" name="user.name"/>
		Age:<input type="text" name="user.age"/>
		<input type="submit" value="提交"/>
	
	</form>
</body>
</html>