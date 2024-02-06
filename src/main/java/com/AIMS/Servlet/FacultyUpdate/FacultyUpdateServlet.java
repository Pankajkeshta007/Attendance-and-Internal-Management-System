package com.AIMS.Servlet.FacultyUpdate;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class FacultyUpdateServlet
 */
public class FacultyUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyUpdateServlet() {
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
		String aicte=request.getParameter("aicteid");
		long aicteId=Long.parseLong(aicte);
		boolean status=DatabaseConnectivity.facultyValidate(aicteId);
		jakarta.servlet.http.HttpSession httpSession=request.getSession();
		httpSession.setAttribute("aicteid", aicteId);
		if(status)
		{
			
			
		    response.sendRedirect("SelectFacultyFieldForUpdate.jsp");
		}
		else
		{
			response.sendRedirect("FacultyUpdateError.jsp");
		}
	}

}
