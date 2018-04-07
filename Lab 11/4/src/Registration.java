import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**Servlet implementation class UserDataServlet*/
public class Registration extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//          
//	public Registration() {
//	   super();
//	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		String qual = request.getParameter("qual");
		String percent = request.getParameter("percent");
		String year = request.getParameter("year");
		if(name.isEmpty() || address.isEmpty() || age.isEmpty() || qual.isEmpty() || percent.isEmpty() || year.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			out.println("<p style='color:red;'>Please fill all the fields</p>");
			rd.include(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
	}

}