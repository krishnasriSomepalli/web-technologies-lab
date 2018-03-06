// Crashing if user gives a space in the text input...

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class cookies1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String n = request.getParameter("username");
			out.print("<h2>Welcome, "+n+"!</h2>");
			Cookie ck = new Cookie("uname",n);
			response.addCookie(ck); 
			out.print("<form action='http://localhost:8085/2/c2'>");
			out.print("<input type='submit' value='Go'>");
			out.print("</form>");
			out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}