package banking;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		        String username=request.getParameter("username");
		        String password = request.getParameter("password");
		        Connection con = null;
		        PreparedStatement statement = null;
		        ResultSet resultSet = null;
		 
		        try {

		        Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Sandygavs@2001");
	 
	            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
	            statement = con.prepareStatement(sql);
	            statement.setString(1, username);
	            statement.setString(2, password);
	 
	            resultSet = statement.executeQuery();
	 
	            if (resultSet.next()) {
	                String fetchedUsername = resultSet.getString("username");
	                String fetchedPassword = resultSet.getString("password");
	 
	                request.setAttribute("fetchedUsername", fetchedUsername);
	                request.setAttribute("fetchedPassword", fetchedPassword);
	                PrintWriter out = response.getWriter();
	            	out.println("Login Successful");
	 
	                request.getRequestDispatcher("withdraw.jsp").forward(request, response);
	            } 
	            else {
	            	PrintWriter out = response.getWriter();
	            	out.println("Invalid username or password");
	                response.sendRedirect("login.jsp");
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	            response.sendRedirect("login.jsp");
	        } finally {
	            try {
	                if (resultSet != null) resultSet.close();
	                if (statement != null) statement.close();
	                if (con != null) con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

