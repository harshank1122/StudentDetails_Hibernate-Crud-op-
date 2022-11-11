<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
<%@ include file = "scritplink.jsp" %>
</head>
<body>
      <input type = "hidden" id = "submit" value = "<%= request.getAttribute("submit")%>">
      <input type = "hidden" id = "submit1" value = "<%= request.getAttribute("submit1")%>">
     <%@ include file = "navbar.jsp" %>
     
     <div class="updatetag">
        <h1>Enter Your Email And Password To Update Details</h1>
    </div>
    
    <div class="login" id="update">
        <div class="container">
          <form action="UpdateValidation" method="post" class="row">
            <div class="mb-3">
              <label for="exampleInputEmail1" class="form-label">ContactNum</label>
              <input name = "ContactNum" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
            </div>
            <div class="mb-1">
              <label for="exampleInputPassword1" class="form-label">Password</label>
              <input name = "pass" type="password" class="form-control" id="exampleInputPassword1">
            </div>
            <button type="submit" class="btn main-btn">Submit</button>
          </form>
        </div>
      </div>
      

     <script type="text/javascript">
	   var status = document.getElementById("submit").value;
	   
	   if(status == "failed"){
		   swal("Sorry" ,"Incorrect User and Pass" , "error" )
	   }
	   
	</script>
	
	<script type="text/javascript">
	   var status1 = document.getElementById("submit1").value;
	   
	   if(status1 == "success"){
		   swal("congrats" ,"Recordes Update Sussecfully" , "success" )
	   }
	   
	</script>
	
	
</body>
</html>