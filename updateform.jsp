
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
<%@ include file = "scritplink.jsp" %>
</head>

<body>
   <%@ include file = "navbar.jsp" %>
       
   <div class="form">
        <div class="container">
            <form action="updatedetails" method="post" class="row g-3">
                <div class="col-md-6">
                    <label for="inputname" class="form-label">First Name</label>
                    <input name="fname" value = "<%= session.getAttribute("fname")%>" type="text" class="form-control" id="inputEmail4" required>
                </div>
                <div class="col-md-6">
                    <label for="inputlastname" class="form-label">Last Name</label>
                    <input name="lname" value = "<%= session.getAttribute("lname")%>" type="text" class="form-control" id="inputPassword4" required>
                </div>
                <div class="col-md-6">
                    <label for="inputEmail4" class="form-label">Email</label>
                    <input name="email"  value = "<%= session.getAttribute("email")%>" type="email" class="form-control" id="inputEmail4" required>
                </div>
                <div class="col-md-6">
                    <label for="inputpercentage" class="form-label">Password</label>
                    <input name="pass" value = "<%= session.getAttribute("pass")%>" type="password" class="form-control" id="inputPassword4" required>
                </div>
                <div class="col-md-4">
                    <label for="inputdegre" class="form-label">Degree YOP</label>
                    <select name="degyop"  id="inputState" class="form-select" required>
                        <option selected><%= session.getAttribute("yop")%></option>
                        <option>2022</option>
                        <option>2021</option>
                        <option>2020</option>
                        <option>2019</option>
                    </select>
                </div>
                <div class="col-md-4">
                    <label for="" class="form-label">Stream</label>
                    <select name="stream" id="inputState" class="form-select" required>
                        <option selected><%= session.getAttribute("stream")%></option>
                        <option>Computer engineering </option>
                        <option>Civil engineering </option>
                        <option>Electrical engineering</option>
                        <option>Electronic engineering</option>
                        <option>Mechanical engineering </option>
                        <option>Chemical engineering </option>
                        <option>information technology</option>
                    </select>
                </div>
                <div class="col-md-4">
                    <label for="inputpercentage" class="form-label">Marks-%</label>
                    <input name="degMark" value = "<%= session.getAttribute("dmark")%>" type="text" class="form-control" id="inputPassword4" required>
                </div>
                <div class="col-md-4">
                    <label for="inputdegre" class="form-label">12th/Diploma</label>
                    <select name="twldip" id="inputState" class="form-select" required>
                        <option selected><%= session.getAttribute("twldip")%></option>
                        <option>12th</option>
                        <option>Diploma</option>
                    </select>
                </div>
                <div class="col-md-4">
                    <label for="" class="form-label">YOP</label>
                    <select name="dipyop" id="inputState" class="form-select" required>
                        <option selected><%= session.getAttribute("dipyop")%></option>
                        <option>2021</option>
                        <option>2020</option>
                        <option>2019</option>
                        <option>2018</option>
                    </select>
                </div>
                <div class="col-md-4">
                    <label for="inputpercentage" class="form-label">Marks-%</label>
                    <input value = "<%= session.getAttribute("dipmark")%>" name="dipmark" value = "" type="text" class="form-control" id="inputPassword4" required>
                </div>
                <div class="col-12">
                    <label for="inputAddress" class="form-label">Select Course</label>
                    <select name="course" id="inputState" class="form-select" required>
                        <option selected><%= session.getAttribute("course")%></option>
                        <option>Java Full Stack Development</option>
                        <option>Don Net Full Stack Development</option>
                        <option>MERN Stack Development</option>
                        <option>MEAN Stack Development</option>
                        <option>Testing</option>
                    </select>
                </div>
                <div class="col-6">
                    <label for="inputAddress" class="form-label">Address</label>
                    <input name="add1" value = "<%= session.getAttribute("add1")%>" type="text" class="form-control" id="inputAddress" required>
                </div>
   
               <div class="col-md-6">
                    <label for="inputpercentage" class="form-label">Contact Number</label>
                    <input name="contact" value = "<%= session.getAttribute("contactno")%>" type="text" class="form-control" id="inputPassword4" required>
                </div>
                
                
           <div class="col-12">
                    <label for="inputAddress2" class="form-label">Address 2</label>
                    <input name="add2" value = "<%= session.getAttribute("add1")%>" type="text" class="form-control" id="inputAddress2">
                </div>
                <div class="col-md-6">
                    <label for="inputCity" class="form-label">City</label>
                    <input name="city" value = "<%= session.getAttribute("city")%>" type="text" class="form-control" id="inputCity" required>
                </div>
                <div class="col-md-4">
                    <label for="inputState" class="form-label">State</label>
                    <select name="state" id="inputState" class="form-select" required>
                        <option selected><%= session.getAttribute("state")%></option>
                        <option>Maharashatra</option>
                    </select>
                </div>
                <div class="col-md-2">
                    <label for="inputZip" class="form-label">Zip</label>
                    <input name="zip"  value = "<%= session.getAttribute("zip")%>" type="text" class="form-control" id="inputZip" required>
                </div>
                <div class="col-12 text-center" >
                    <button type="submit" class="btn main-btn">UPDATE</button>
                </div>
            </form>
        </div>
    </div>
                
    
</body>
</html>