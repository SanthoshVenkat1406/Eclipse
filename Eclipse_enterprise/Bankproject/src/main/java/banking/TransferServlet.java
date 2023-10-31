package banking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TransferServlet
 */
@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String destinationAccount = request.getParameter("destinationAccount");
        double transferAmount = Double.parseDouble(request.getParameter("transferAmount"));
 
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("userId");
 
        if (performTransfer(userId, destinationAccount, transferAmount)) {
            response.getWriter().println("Transfer successful.");
        } else {
            response.getWriter().println("Transfer failed. Please check the destination account number and try again.");
        }
    }

	private boolean performTransfer(String userId, String destinationAccount, double transferAmount) {
		// TODO Auto-generated method stub
		return true;
	}
	}

