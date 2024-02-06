package com.AIMS.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.tomcat.jakartaee.commons.compress.archivers.ArchiveInputStream;

/**
 * Servlet implementation class DisplayAdminImageServlet
 */
public class DisplayAdminImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAdminImageServlet() {
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
		try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");

            String sql = "SELECT image FROM admin_register WHERE username = Rahul Singh"; // Assuming admin ID is 1
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                ResultSet result = statement.executeQuery();
                if (result.next()) {
                    InputStream inputStream = result.getBinaryStream("image");
                    int fileLength = inputStream.available();

                    byte[] imageData = new byte[fileLength];
                    inputStream.read(imageData);

                    // Set content type to image
                    response.setContentType("image/jpg");
                    response.setContentLength(fileLength);
                    response.getOutputStream().write(imageData);
                }
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}
