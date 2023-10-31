<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Trains</title>
</head>
<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
            margin: 0;
            padding: 0;
            color: #333;
        }
        h2 {
            color: blue;
            font-size: 28px;
            margin: 20px 0;
        }
        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #007BFF;
            color: #fff;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #ddd;
        }
        input[type="checkbox"] {
            transform: scale(1.5); /* Increase checkbox size */
        }
        input[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>

<body>
    <h2>View Trains</h2>
    <form action="/removeTrains" method="post">
        <table>
            <tr>
                <th> Train Number </th>
                <th> Train Name </th>
                <th> Timings </th>
                <th> Start Point </th>
                <th> End Point </th>
                <th> Select </th>
            </tr>
            <c:forEach var="train" items="${trains}">
                <tr>
                    <td>${train.trainNumber}</td>
                    <td>${train.trainName}</td>
                    <td>${train.timings}</td>
                    <td>${train.startPoint}</td>
                    <td>${train.endPoint}</td>
                    <td><input type="checkbox" name="selectedTrains" value="${train.trainNumber}"></td>
                </tr>
            </c:forEach>
        </table>
        <input type="submit" value="Remove Selected Trains">
    </form>
</body>
</html>
