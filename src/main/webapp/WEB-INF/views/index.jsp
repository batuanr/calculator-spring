<%--
  Created by IntelliJ IDEA.
  User: kasawoa
  Date: 2021/11/23
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form method="post">
    <input type="number" name="num1" >
    <input type="number" name="num2" >
    <input type="submit" name="calculator" id="1" value="+">
    <input type="submit" name="calculator" id="2" value="-">
    <input type="submit" name="calculator" id="3" value="*">
    <input type="submit" name="calculator" id="4" value="/">
</form>
<h2>Result: ${result}</h2>
</body>
</html>
