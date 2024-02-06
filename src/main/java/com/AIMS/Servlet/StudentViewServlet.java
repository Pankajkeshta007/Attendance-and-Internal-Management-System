package com.AIMS.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.AIMS.Dao.DatabaseConnectivity;
import com.AIMS.Dao.StudentData;

/**
 * Servlet implementation class StudentViewServlet
 */
public class StudentViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException 
            {
		  List<StudentData> records=DatabaseConnectivity.display();
			System.out.println("Student data :");
			System.out.println(records);
			request.setAttribute("studentDetails", records);

			  request.getRequestDispatcher("StudentView.jsp").forward(request,response);
            }

}
