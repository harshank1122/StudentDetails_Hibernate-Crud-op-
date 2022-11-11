<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Student Form</title>
    <%@ include file = "scritplink.jsp" %>
</head>

<body>
    <%@ include file = "navbar.jsp" %>
    <input type = "hidden" id = "submit" value = "<%= request.getAttribute("submit")%>">
    <%@ include file = "form.jsp" %>
     <script type="text/javascript">
	   var status = document.getElementById("submit").value;
	   if(status == "success"){
		   swal("congrats" ,"Form Submited" , "success" )
	   }
	   
	   if(status == "failed"){
		   swal("Sorry" ,"Sign Up Email Already Exists" , "error" )
	   }
	   
	  
	   
	</script>
</body>

</html>