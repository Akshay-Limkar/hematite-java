<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP</title>
</head>
<body>
<h3>Hello World of JAVA!!!</h3>
The time on the server is <%= new java.util.Date() %>
<%=new String("hello world").toUpperCase() %>
<br>
25 Multiplied by 4 is equals?<%= 25*4 %>
<br>
Is 75 less than 69?<%= 75<69 %>
<br><br>
<h3>Script tag</h3>
<hr>
<%
	for(int i=1; i<5; i++)
	{
		out.println("<br>Java: "+i);
	}
%>
<br><br>
<h3>Declaration</h3>
<hr>
<%!
	public int no=100;
	String makeItLower(String data)
	{
		return data.toLowerCase();
	}
%>
Lower case "Hello World: " <%= makeItLower("HELLO WORLD") %>
</body>
</html>