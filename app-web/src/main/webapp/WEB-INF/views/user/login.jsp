<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>用户登录</title>
</head>
<body>
	<form:form commandName="user" id="loginForm" action="login" method="post">
            用户名：<form:input id="username" path="username" />&nbsp;&nbsp;<form:errors
			path="username" cssStyle="color:red" />
		<br />
		<br />
            密码：<form:input path="password" id="password" name="password"
			type="password" />&nbsp;&nbsp;<form:errors path="password"
			cssStyle="color:red" />
		<br />
		<br />
            年龄：<form:input path="age" id="country"
			name="age" type="text" />&nbsp;&nbsp;<form:errors
			path="age" cssStyle="color:red" />
		<br />
		<br />
            金额：<form:input path="salary" id="salary" name="salary"
			type="text" />&nbsp;&nbsp;
			<form:errors path="salary"
			cssStyle="color:red" />
		<br />
		<br />
	邮箱：<form:input path="email" id="email" name="email" type="text"/>&nbsp;&nbsp;
		<form:errors path="email" cssStyle="color:red" />
		<br />
		<br />
		<input type="submit" value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="reset" value="重置" />
	</form:form>
</body>
</html>