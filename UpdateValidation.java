package validation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jsp.dao.StuRec_Dao;
import org.jsp.dto.StudentDetails;

public class UpdateValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateValidation() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String u = request.getParameter("ContactNum");
		String p = request.getParameter("pass");

		StuRec_Dao dao = new StuRec_Dao();
		StudentDetails studentDetails2 = dao.findById(u);
		if (studentDetails2 != null) {

			if (p.equals(studentDetails2.getPassword()) && u.equals(studentDetails2.getContactNuber())) {
				request.setAttribute("submit","success"); 
				RequestDispatcher rd = request.getRequestDispatcher("updateform.jsp");
				rd.forward(request, response);
				StuRec_Dao dao1 = new StuRec_Dao();
				StudentDetails studentDetails = dao1.findById(u);
				if (studentDetails != null) {

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

				}

			} else {
				request.setAttribute("submit","failed"); 
				RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
				rd.forward(request, response);
			}

		} else {
			System.out.println("data not exits");
		}

	}

}
