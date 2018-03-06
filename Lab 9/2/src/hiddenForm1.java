// Crashing if user gives a space in the text input...

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class hiddenForm1 extends HttpServlet {  
        public void doGet(HttpServletRequest request, HttpServletResponse response) {  
                try{  
                        response.setContentType("text/html");  
                        PrintWriter out = response.getWriter();  
                        String n=request.getParameter("uname");  
                        out.print("<h3>Welcome, "+n+"!</h3>");  
                        out.print("<form action='http://localhost:8085/2/f2'>");  
                        out.print("<input type='hidden' name='uname' value='"+n+"'>");  
                        out.print("<input type='submit' value='Go'>");  
                        out.print("</form>");  
                        out.close();  
                }
                catch(Exception e) {
                        System.out.println(e);
                }  
        }  

}  
