package com.AIMS.Servlet.SubjectServlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class SubjectUpdateServlet
 */
public class SubjectUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectUpdateServlet() {
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
		String subjectId=request.getParameter("subjectid");
		
		boolean status=DatabaseConnectivity.subjectValidate(subjectId);
		jakarta.servlet.http.HttpSession httpSession=request.getSession();
		httpSession.setAttribute("subjectid", subjectId);
		if(status)
		{
			
			
		    response.sendRedirect("SelectSubjectFieldForUpdate.jsp");
		}
		else
		{
			response.sendRedirect("SubjectUpdateError.jsp");
		}
	}

}
