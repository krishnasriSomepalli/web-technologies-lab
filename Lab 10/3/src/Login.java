import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;      
public class Login extends HttpServlet 
{    
   public void doPost(HttpServletRequest request, 
     HttpServletResponse response) 
       throws ServletException, IOException 
   {        
       response.setContentType("text/html");      
       PrintWriter pwriter = response.getWriter();                
       String name = request.getParameter("username");      
       String pass = request.getParameter("password");                
       if(name.equals("Jane") && 
          pass.equals("Doe"))
       {          
          RequestDispatcher dis = request.getRequestDispatcher("authenticated");          
          dis.forward(request, response);      
       }     
       else
       {      
          pwriter.print("Username or password is incorrect!\n<br/><br/>");          
          RequestDispatcher dis = request.getRequestDispatcher("index.html");          
          dis.include(request, response);                                
       }      
   }    
}  