<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit page</title>
</head>
<body>

<h1>Deposit Money</h1>
    <form action="DepositServlet" method="post">
        Amount to Deposit: <input type="text" name="depositAmount"><br>
        <input type="submit" value="Deposit">
    </form>
</body>
</html>