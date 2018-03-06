import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class servletContext extends HttpServlet  
{
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException,IOException
    {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
 
        // SevletContext object can be obtained in 2 ways
        ServletContext context = getServletContext();  
 
        String s1 = context.getInitParameter("a");
        String s2 = context.getInitParameter("b");
 
        pw.println("a: " +s1+ "<br/>b: " +s2);
        int x=Integer.parseInt(s1);
        int y=Integer.parseInt(s2);
        pw.println("<br/>a+b: "+(x+y));
        pw.close();    
    }
}
