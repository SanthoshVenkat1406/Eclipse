<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate login </title>
</head>
<body>
<%

String user=request.getParameter("username");
String password=request.getParameter("password");

if(user.equals("admin") && password.equals("admin"))
{	
	session.setAttribute("user", user);
	%>
	<h2>Welcome to <%=user%></h2><br/>
	
   <a href='addProducts.html'>link to add products </a><br>
   <a href='Adminview.html'> link to view products</a>
   
	<% 
}
else if (user.equals("user") && password.equals("user"))
{
	session.setAttribute("user", user);
	%>
	<a href='user.html'>Welcome user you can view products here</a>
	
	<% 
	}
	else
	{
	%>
	<h3 style="color:red">Invalid credentials </h3>
	<a href="login.html">Click re-login</a>

	<%

	}%>
	

</body>

</html>