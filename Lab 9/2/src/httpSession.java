import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class httpSession extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {

		// Get the HttpSession object.
		HttpSession session = request.getSession(true);

		// Get session creation time.
		Date createTime = new Date(session.getCreationTime());

		// Get last access time of this web page.
		Date lastAccessTime = new Date(session.getLastAccessedTime());

		// Set response content type
		response.setContentType("text/html"); 

		PrintWriter out = response.getWriter();
		out.print("<h4>ID: </h4>" + session.getId() + "<br>");
		out.print("<h4>Last access time: </h4>" + lastAccessTime+"<br>");
		out.print("<h4>Creation time: </h4>" + createTime+ "<br>");
	}
}