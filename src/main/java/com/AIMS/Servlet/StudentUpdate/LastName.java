package com.AIMS.Servlet.StudentUpdate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class FirstName
 */
public class LastName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LastName() {
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
		String rollno=httpSession.getAttribute("studentRollno").toString();
	
		String lname = request.getParameter("name");
		int status = DatabaseConnectivity.updateLastName(lname, rollno);
		if (status > 0) {
			response.sendRedirect("UpdateSuccess.jsp");
		} else {
			response.sendRedirect("UpdateError.jsp");
		}
	}

}
