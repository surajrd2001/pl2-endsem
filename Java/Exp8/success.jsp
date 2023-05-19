<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="index.jsp" method="post" > 
<h1 align="center">Hello <s:property value="uname" />, you have been successfully logged in
<br> </h1>

<input type="submit" value="Logout" >

</form>
</body>
</html>