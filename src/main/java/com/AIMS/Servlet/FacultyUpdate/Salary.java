package com.AIMS.Servlet.FacultyUpdate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class Salary
 */
public class Salary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Salary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		jakarta.servlet.http.HttpSession httpSession = request.getSession();
		String aicteid=httpSession.getAttribute("facultyAicteid").toString();
	
		String sal = request.getParameter("salary");
		float salary=Float.parseFloat(sal);
		int status = DatabaseConnectivity.facultySalary(salary, aicteid);
		if (status > 0) {
			response.sendRedirect("FacultyUpdateSuccess.jsp");
		} else {
			response.sendRedirect("UpdateError.jsp");
		}
	}
}
