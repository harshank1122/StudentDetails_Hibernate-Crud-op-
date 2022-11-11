<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Details</title>
<%@ include file = "scritplink.jsp" %>
</head>

<body>
    <%@ include file = "navbar.jsp" %>
    
    <div class="list">
        <h2>Personal Details</h2>

        <ul>
            <li>NMAE : <span><%= session.getAttribute("fname")%> <%= session.getAttribute("lname")%></span></li>
            <li>Email : <span><%= session.getAttribute("email")%></span></li>
            <li>Contact Number : <span><%= session.getAttribute("contactno")%></span></li>
            <li>Address : <span><%= session.getAttribute("add1")%> , <%= session.getAttribute("add2")%> , <%= session.getAttribute("city")%> , <%= session.getAttribute("state")%> , <%= session.getAttribute("zip")%></span></li>
        </ul>

        <h2>Educational Details</h2>

        <h5>Degree</h5>
        <ul>
            <li>Fild : <span><%= session.getAttribute("stream")%></span></li>
            <li>YOP : <span><%= session.getAttribute("yop")%></span></li>
            <li>Marks : <span><%= session.getAttribute("dmark")%></span></li>
        </ul>
        <h5>Diploma/12th</h5>
        <ul>
            <li><span><%= session.getAttribute("twldip")%></span></li>
            <li>YOP : <span><%= session.getAttribute("dipyop")%></span></li>
            <li>MARKS : <span><%= session.getAttribute("dipmark")%></span></li>
        </ul>

        
        <h2>selected Course</h2>
        <ul>
            <li>Course : <span><%= session.getAttribute("course")%></span></li>
        </ul>

    </div>
</body>
</html>