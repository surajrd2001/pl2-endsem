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
<s:form action="verify">
<h1 align="center">Login Example</h1>
<table align="center" border="0">
<tr> <s:textfield name="uname" label="Enter Username" /><br> </tr>
<tr> <s:password name="password" label="Enter Password" /><br> </tr>
<tr> <s:submit value="Click" align="center" /> </tr>
 


</table>
</s:form>
</body>
</html>