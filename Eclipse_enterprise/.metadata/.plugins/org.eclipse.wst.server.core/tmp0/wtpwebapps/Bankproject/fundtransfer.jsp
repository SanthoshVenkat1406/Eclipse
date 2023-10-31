<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fund Transfer Page</title>
</head>
<body>
<h1>Fund Transfer</h1>
    <form action="TransferServlet" method="post">
        Destination Account Number : <input type="text" name="destinationAccount" required><br>
        Amount to be deposited : <input type="text" name="amount" required><br>
        <input type="submit" value="Transfer">
    </form>
</body>
</html>