<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo page</title>
</head>


<body>


<form action="first" method="get">
<input type="text" value="1" name="num1">
<input type="text" value="1" name="num2">
<input type="submit" name="submit">
</form>





<input type="submit" action="/generic" method="get" value="click me"></input>


<form action="configs" method="post">
<input type="submit"  value="click me for config context"></input>
</form>




</body>
</html>