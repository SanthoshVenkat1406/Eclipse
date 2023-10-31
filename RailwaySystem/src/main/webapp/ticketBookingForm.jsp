<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ticket Booking</title>
</head>
<body>
    <h2>Ticket Booking</h2>
    <form action="/ticketBooking" method="post">
        <label for="fromLocation">From:</label>
        <select id="fromLocation" name="fromLocation" required>
    <c:forEach var="city" items="${cities}">
        <option value="${city.id}">${city.name}</option>
    </c:forEach>
</select><br>

        <label for="toLocation">To:</label>
        <select id="toLocation" name="toLocation" required>
    <c:forEach var="city" items="${cities}">
        <option value="${city.id}">${city.name}</option>
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
</body>
</html>
