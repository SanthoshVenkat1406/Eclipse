package banking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DepositServlet
 */
@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        double depositAmount = Double.parseDouble(request.getParameter("depositAmount"));

		 HttpSession session = request.getSession();
	        String userId = (String) session.getAttribute("userId");
	        PrintWriter out = response.getWriter();
	        out.println("Deposit successful.");

	        if (userId == null) {
	            response.sendRedirect("login.jsp");
	            return;
	        }

	        double depositAmount = Double.parseDouble(request.getParameter("depositAmount"));
	        
	        
	}

}
