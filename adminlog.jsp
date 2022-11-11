<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!doctype html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Admin</title>
<%@ include file="scritplink.jsp"%>
</head>

<body>
	<input type = "hidden" id = "submit" value = "<%= request.getAttribute("submit")%>">
	<%@ include file="navbar.jsp"%>
	<%@ include file="login.jsp"%>
     <script type="text/javascript">
	   var status = document.getElementById("submit").value;
	   
	   if(status == "failed"){
		   swal("Sorry" ,"Incorrect User and Pass" , "error" )
	   }
	   
	</script>
</body>

</html>