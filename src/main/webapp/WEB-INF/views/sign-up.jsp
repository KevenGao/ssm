<%--
  Created by IntelliJ IDEA.
  User: itlaobing
  Date: 2018/7/20
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册</title>

</head>
<body>

<h2>注册</h2>

<div>

    <form action="${ pageContext.request.contextPath }/user/sign-up" method="post">
        <input type="text" name="username" >
        <input type="text" name="password" >
        <input type="submit" value="注册">
    </form>

</div>

</body>
</html>