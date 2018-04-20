import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
 
public class Authenticated extends HttpServlet { 
 
 public void doPost(HttpServletRequest request, 
 HttpServletResponse response) 
 throws ServletException, IOException 
 { 
    response.setContentType("text/html"); 
    PrintWriter pwriter = response.getWriter(); 
 
    String name=request.getParameter("username"); 
    pwriter.print("Hello "+name+"!");
 } 
} 