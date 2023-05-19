<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: lightyellow;">
	<div style="margin-left: 25%; margin-top: 50px;">
		<h1>Struts2 and MySQL database connectivity example</h1>
		 <s:form action="Register.action">
			<s:textfield label="ID" name="id" />
			<s:textfield label="Name" name="name" />
			<s:textfield label="Email" name="email" />
			<s:textfield label="City" name="city" />
			<s:submit value="Register" />
		</s:form>
</div>
</body>
</html>