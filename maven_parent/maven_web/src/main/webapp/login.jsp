<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a style="text-align: right;" href="${pageContext.request.contextPath}/regist.jsp">注册</a>
<h1 style="text-align: center;margin-bottom: 10px">账户登录表单</h1>
<form action="${pageContext.request.contextPath}/user/login"  style="text-align: center">
    账户名称<input type="text" name="username" style="margin-bottom: 10px"><br/>
    账户密码<input type="text" name="password" style="margin-bottom: 10px"><br/>
    <input type="submit" value="登录"><br/>
</form>
<p style="color: red;margin-top: 20px;text-align: center">${info}</p>
</body>
</html>
