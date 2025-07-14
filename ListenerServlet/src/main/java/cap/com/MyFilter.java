package cap.com;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

@WebFilter("/MyFilter")
public class MyFilter extends HttpFilter implements Filter {
       
   
    public MyFilter() {
        super();
       
    }

	
	public void destroy() {
		
	}

		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Before Servlet");
		chain.doFilter(request, response);
		System.out.println("after Servlet");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
