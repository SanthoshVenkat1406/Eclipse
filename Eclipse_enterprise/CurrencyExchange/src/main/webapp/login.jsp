<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login </title>
</head>
<body>

<h2>Admin Login Page</h2>
<form action="/login" method="post">
    User Name<br>
    <input type="text" name="user"><br>
    Password<br>
    <input type="password" name="pass"><br>
    <input type="submit" value="Login">
    </form>

</body>
</html>