<%@page import="org.jsp.dao.StuRec_Dao"%>
<%@page import="javax.persistence.Query"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="org.jsp.dto.StudentDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Record</title>
<%@ include file="scritplink.jsp"%>
</head>

<body>
  
	<%@ include file="navbar.jsp"%>
	<div class="details">
		<table class="table">
			<thead class="table-dark">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Contact</th>
					<th>Email</th>
					<th>Details</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<%
				StuRec_Dao stuRec_Dao = new StuRec_Dao();
				EntityManager entityManager= stuRec_Dao.getEntityManager();
				Query query= entityManager.createQuery("from StudentDetails");
				List<StudentDetails> studea = query.getResultList();
				for(StudentDetails studentDetails : studea ) {
				%>


				<tr>
	
					<td><%= studentDetails.getFastName() %></td>
					<td><%= studentDetails.getLastName() %></td>
					<td><%= studentDetails.getContactNuber() %></td>
					<td><%= studentDetails.getEmail() %></td>
					<td><button type="submit" class="btn main-btn" onclick="window.location.href = 'RecordView?student_contactNo2=<%= studentDetails.getContactNuber() %>' ; " >Details</button></td>
					<td><button type="submit" class="btn main-btn" onclick="window.location.href = 'RecDelete?student_contactNo=<%= studentDetails.getContactNuber() %>' ; ">Delete</button></td>	
					
					
				</tr>


				<%
				 }
				%>
			</tbody>
		</table>
	</div>
	

	
	
</body>
</html>