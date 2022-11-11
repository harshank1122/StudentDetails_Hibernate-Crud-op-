package org.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.dao.StuRec_Dao;
import org.jsp.dto.StudentDetails;

public class con_stu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public con_stu() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String contact = request.getParameter("contact");
			String email = request.getParameter("email");
			String dipmark = request.getParameter("dipmark");
			String pass = request.getParameter("pass");
			String degyop = request.getParameter("degyop");
			String stream = request.getParameter("stream");
			String degMark = request.getParameter("degMark");
			String dipyop = request.getParameter("dipyop");
			String course = request.getParameter("course");
			String add1 = request.getParameter("add1");
			String twldip = request.getParameter("twldip");
			String add2 = request.getParameter("add2");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String zip = request.getParameter("zip");

			StudentDetails studentDetails = new StudentDetails();
			studentDetails.setAddress(add1);
			studentDetails.setAddress2(add2);
			studentDetails.setCity(city);
			studentDetails.setContactNuber(contact);
			studentDetails.setCourse(course);
			studentDetails.setDegreeYOP(degyop);
			studentDetails.setDipMarks(dipmark);
			studentDetails.setDMarks(degMark);
			studentDetails.setEmail(email);
			studentDetails.setFastName(fname);
			studentDetails.setLastName(lname);
			studentDetails.setPassword(pass);
			studentDetails.setState(state);
			studentDetails.setStream(stream);
			studentDetails.setTweelthDiploma(twldip);
			studentDetails.setYOP(dipyop);
			studentDetails.setZip(zip);

			StuRec_Dao dao = new StuRec_Dao();
			dao.save(studentDetails);

			request.setAttribute("submit","success"); 
			RequestDispatcher rd = request.getRequestDispatcher("stuForm.jsp");
			rd.include(request, response);
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
