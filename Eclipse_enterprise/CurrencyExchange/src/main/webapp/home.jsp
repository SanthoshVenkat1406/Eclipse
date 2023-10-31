<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>

<h1>Currency Conversion</h1>


    <form action="convertCurrency" method="post">

        <label for="amount">Amount:</label>

        <input type="text" id="amount" name="amount" required><br><br>


        <label for="sourceCurrency">From Currency:</label>

        <select id="sourceCurrency" name="sourceCurrency">

            <option value="USD">United States Dollar (USD)</option>

            <option value="EUR">Euro (EUR)</option>

            <!-- Add more currencies as needed -->

        </select><br><br>

 

        <label for="targetCurrency">To Currency:</label>

        <select id="targetCurrency" name="targetCurrency">

            <option value="USD">United States Dollar (USD)</option>

            <option value="EUR">Euro (EUR)</option>

            <!-- Add more currencies as needed -->

        </select><br><br>

        <input type="submit" value="Convert">

    </form>

</body>
</html>