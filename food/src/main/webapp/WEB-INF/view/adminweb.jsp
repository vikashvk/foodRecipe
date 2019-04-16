<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form method="POST" action="upload" modelAttribute="c"> 
Hello Admin! 
<br>
		<br>
Admin:
<f:input type="text" path="adminName" />
		<f:errors path="adminName" />
		<br>
Password:
<f:input type="password" path="password" />
		<f:errors path="adminName" /><br>
		
		<input type="submit" value="LOGIN"  />
	</f:form>
</body>
</html>