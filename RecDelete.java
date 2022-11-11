package org.jsp.dao;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.dto.StudentDetails;

public class RecDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RecDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String contactno = request.getParameter("student_contactNo");
		System.out.println(contactno);
   
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentRecordes");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		StudentDetails studentDetails = entityManager.find(StudentDetails.class, contactno );
		if (studentDetails != null) {
			entityManager.remove(studentDetails);
			entityTransaction.commit();
			request.setAttribute("submit","success"); 
			response.sendRedirect("details.jsp");
		} 
		
		
	}

}
