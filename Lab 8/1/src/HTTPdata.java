import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HTTPdata extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html><head>");
		//out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
		out.println("<title>Hello, World</title></head>");
		out.println("<body>");
		out.println("<h1>HTTP Data</h1>");
		out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
		out.println("<p>Protocol: " + request.getProtocol() + "</p>");
		out.println("<p>Path Info: " + request.getPathInfo() + " (getPathInfo() gives the extra path information after the URI, used to access your Servlet, where as getRequestURI() gives the complete URI.)</p>");
		out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");
		out.println("<p> Servlet Path: "+request.getServletPath() + "</p>");
		out.println("<p> Query Sting: "+request.getQueryString() + "</p>");
		out.println("<p> Get Path Translated: "+request.getPathTranslated() +
		" (Returns any extra path information after the servlet name but before the query string, and translates it to a real path.)</p>");
		out.println("<p> Remote User: "+request.getRemoteUser() + " (Returns the login of the user making this request, if the user has been authenticated, or null if the user has not been authenticated.)</p>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
