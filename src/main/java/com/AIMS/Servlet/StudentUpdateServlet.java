package com.AIMS.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class StudentUpdateServlet
 */
public class StudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentUpdateServlet() {
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
		String roll=request.getParameter("rollno");
		long rollNo=Long.parseLong(roll);
		boolean status=DatabaseConnectivity.validate(rollNo);
		jakarta.servlet.http.HttpSession httpSession=request.getSession();
		httpSession.setAttribute("rollno", rollNo);
		if(status)
		{
			
			
		    response.sendRedirect("SelectStudentFieldForUpdate.jsp");
		}
		else
		{
			response.sendRedirect("UpdateError.jsp");
		}
	}

}
