<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>

<body>
<h1 style="text-align: center;margin-bottom: 10px">账户注册</h1>
<form action="${pageContext.request.contextPath}/user/regist" style="text-align: center;border: 2px" method="post">
    账户 <input type="text" name="username" style="margin-bottom: 10px"><br>
    密码 <input type="password" name="password" style="margin-bottom: 10px"><br>
    <input type="submit" value="注册" style="margin-bottom: 10px">
</form>
<p style="text-align: center;color: darkgreen">${info}</p>
</body>
</html>
