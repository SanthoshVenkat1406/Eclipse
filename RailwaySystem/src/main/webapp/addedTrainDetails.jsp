<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Train Details</title>
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
        .train {
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            width: 300px;
            padding: 20px;
            margin: 20px auto;
        }
        .train p {
            margin: 10px 0;
        }
        a {
            text-decoration: none;
            color: #007BFF;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
<body>

<h2> Newly Added Train Details </h2>
    <div class="train">
        <p class="Train Number"> Train number : ${addTrain.trainNumber}</p>
        <p class="Train Name"> Train Name : ${addTrain.trainName}</p>
        <p class="Timings"> Timings : ${addTrain.timings}</p> 
        <p class="Start Point"> Start point: ${addTrain.startPoint}</p>
         <p class="End Point"> End Point : ${addTrain.endPoint}</p>
         <a href = "/dashboard"> Return to dashboard </a>
    </div>

</body>
</html>