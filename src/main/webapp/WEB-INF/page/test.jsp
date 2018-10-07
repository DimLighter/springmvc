<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<p>Spring MVC based on XML config success!</p>
<form action="${pageContext.request.contextPath}/param/direct" method="post">
    name: <input type="text" name="name">
    age:  <input type="text" name="age">
    <input type="submit" value="提交">
</form>
rp is : ${rp}
user : ${returnUser}

map : ${map}
model : ${model}
modelMap : ${modelMap}
</body>
</html>