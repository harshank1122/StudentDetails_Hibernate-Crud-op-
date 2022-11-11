package org.jsp.dao;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jsp.dto.StudentDetails;

public class RecordView extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RecordView() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String contactnoView = request.getParameter("student_contactNo2");
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StudentRecordes");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		StudentDetails studentDetails = entityManager.find(StudentDetails.class, contactnoView );
		
		String add1 = studentDetails.getAddress();
		String add2 = studentDetails.getAddress2();
		String city = studentDetails.getCity();
		String contactno = studentDetails.getContactNuber();
		String course = studentDetails.getCourse();
		String yop = studentDetails.getDegreeYOP();
		String dipmark = studentDetails.getDipMarks();
		String dmark = studentDetails.getDMarks();
		String email = studentDetails.getEmail();
		String fname = studentDetails.getFastName();
		String lname = studentDetails.getLastName();
		String pass = studentDetails.getPassword();
		String state = studentDetails.getState();
		String stream = studentDetails.getStream();
		String twldip = studentDetails.getTweelthDiploma();
		String dipyop = studentDetails.getYOP();
		String zip = studentDetails.getZip();

		HttpSession session = request.getSession();
		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);
		session.setAttribute("email", email);
		session.setAttribute("pass", pass);
		session.setAttribute("dipyop", dipyop);
		session.setAttribute("stream", stream);
		session.setAttribute("dmark", dmark);
		session.setAttribute("twldip", twldip);
		session.setAttribute("dipmark", dipmark);
		session.setAttribute("yop", yop);
		session.setAttribute("add1", add1);
		session.setAttribute("add2", add2);
		session.setAttribute("state", state);
		session.setAttribute("course", course);
		session.setAttribute("contactno", contactno);
		session.setAttribute("city", city);
		session.setAttribute("zip", zip);
		
		RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
		 rd.forward(request, response);
	}

}
