<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Railway Dashboard</title>
    <style>
       <style>

        /* Style for the navigation bar */

        .navbar {

            background-color: orange;

            display: flex;

            padding: 10px 0;

        }

        .navbar a {

            color: black;

            text-decoration: none;

            padding: 10px 20px;

            transition: background-color 0.3s;

        }

        .navbar a:hover {

            background-color: #555;

        }

        

        /* Style for the dashboard content */

        body {

            background-image: url('images/railwayprj.jpg'); /* Update with your image URL or local path */

            background-size: cover;

            background-repeat: no-repeat;

            background-attachment: fixed;

            color: Brown;

            padding: 20px;

        }

 

        /* Style for the ticket booking form */

         .ticket-form {

            background-color: rgba(255, 255, 255, 0.7); /* Semi-transparent white background */

            border: 1px solid #ccc;

            border-radius: 5px;

            width: 300px;

            padding: 20px;

            float: right; /* Position to the right */

        }

        .ticket-form label, .ticket-form select, .ticket-form input {

            display: block;

            margin-bottom: 10px;

        }

    </style>

</head>

<body>

    <div class="navbar">

        <a href="/addTrain">Add Train</a>

        <a href="/viewTrains">View Trains</a>

        <a href="/monthlyReport">Monthly Report</a>

        <a href="/schedule">Schedule</a>

    </div>

 

    <div class="dashboard-content">

        <h2>Welcome to the Railway System</h2>

    </div>

 

    <div class="ticket-form">

        <h2>Ticket Booking</h2>

        <form action="/ticketBooking" method="post">

            <label for="fromLocation">From:</label>
        <select id="fromLocation" name="fromLocation" required>
    <c:forEach items="${cities}" var="city">
        <option value="${city.getName()}">${city.getName()}</option>
    </c:forEach>
</select><br>

<label for="toLocation">To:</label>
<select id="toLocation" name="toLocation" required>
    <c:forEach items="${cities}" var="city">
        <option value="${city.getName()}">${city.getName()}</option>
    </c:forEach>
</select><br>

            <label for="travelDate">Date:</label>

            <input type="date" id="date" name="date" min="<%= java.time.LocalDate.now() %>" required>

            <label for="journeyType">Journey Type:</label>
            
          <label>
             <input type="radio" id="singleJourney" name="journeyType" value="single" required>
                       Single Journey
            </label>

         <label>
           <input type="radio" id="returnJourney" name="journeyType" value="return" required>
              Return Journey
        </label><br>

            <label for="travelClass">Class:</label>

            <select id="travelClass" name="travelClass">

                <option value="Economy">Economy</option>

                <option value="Business">Business</option>

            </select><br>

            <input type="submit" value="Book Ticket">

        </form>

    </div>

</body>

</html>