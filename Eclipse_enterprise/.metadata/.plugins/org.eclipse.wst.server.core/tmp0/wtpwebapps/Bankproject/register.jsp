<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank account registration </title>
</head>

<body>
<h1> Registration page </h1>
<form action ="RegisterServlet" method="post">
User ID <input type = "text" name="userID"><br><br>
User Name <input type="text" name ="username"><br><br>
Password <input type="password" name = "password"><br><br>
Account Balance <input type="text" name = "accbalance"><br><br>
<input type="submit" value="Register">

</form>


</body>
</html>