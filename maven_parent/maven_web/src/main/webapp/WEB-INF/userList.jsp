<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查看所有用户信息</title>
</head>
<body>
<table border="1" align="center">
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>用户密码</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr style="text-align: center">
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td style="text-align: center;color: gray"><a href="${pageContext.request.contextPath}/user/delete?id=${user.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
