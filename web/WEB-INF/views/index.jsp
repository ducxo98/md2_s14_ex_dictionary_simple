<%--
  Created by IntelliJ IDEA.
  User: duc
  Date: 24/05/2019
  Time: 08:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dictionary</title>
</head>
<body>
<form action="dic" method="post">
    <tr>
        <td>Input text:</td>
        <td><input type="text" name="input" value="${input}"></td>
    </tr>
    <br>
    <tr>
        <td><input type="submit" value="Translate"></td>
    </tr>
    <br>
    <tr>
        <td>translate</td>
        <td><input type="text" value="${result}"></td>
    </tr>
</form>

</body>
</html>
