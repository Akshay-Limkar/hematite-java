<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="e" class="com.app.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="e" />
Records: 
<hr>
Name - <jsp:getProperty property="name" name="e" />
<br>
Password - <jsp:getProperty property="password" name="e" />
<br>
Email ID - <jsp:getProperty property="email" name="e" />
</body>
</html>