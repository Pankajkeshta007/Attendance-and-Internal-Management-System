package com.AIMS.Servlet.SubjectServlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class SubjectName
 */
public class SubjectName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectName() {
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
		String subId=httpSession.getAttribute("subjectId").toString();
	
		String subName = request.getParameter("subjectname");
		int status = DatabaseConnectivity.updateSubjectName(subName, subId);
		if (status > 0) {
			response.sendRedirect("SubjectUpdateSuccess.jsp");
		} else {
			response.sendRedirect("SubjectUpdateError.jsp");
		}
	}

}