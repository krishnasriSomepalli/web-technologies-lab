import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.*;  
  
public class FilterDemo implements Filter{  
  
	public void init(FilterConfig arg0) throws ServletException {}  
	      
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) 
        throws IOException, ServletException {  
		  
	    PrintWriter out=resp.getWriter();  
	    out.print("Filter is invoked before Servlet1");  
	    chain.doFilter(req, resp); //sends request to next resource  
	    out.print("Filter is invoked after Servlet1");  
	}  
    
	public void destroy() {}  
}