<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin add currency page </title>
</head>
<body>
</head>
<body>
    <h1>Add Currency</h1>
    <form action="/addCurrency" method="post">
        Currency Code: <input type="text" name="code" required /><br>
        Exchange Rate: <input type="number" name="exchangeRate" step="0.01" required /><br>
        <input type="submit" value="Add Currency" />
    </form>

</body>
</html>