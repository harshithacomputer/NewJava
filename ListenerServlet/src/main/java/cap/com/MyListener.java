package cap.com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;


@WebListener
public class MyListener implements HttpSessionListener {
	ServletContext ctx=null;
	static int total=0,current=0;

    
    public MyListener() {
        
    }

	
    public void sessionCreated(HttpSessionEvent se)  { 
    	total++;
    	current++;
    	ctx=se.getSession().getServletContext();
    	ctx.setAttribute("totalusers", total);
    	ctx.setAttribute("currentusers", current);
        
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	current--;
    	ctx.setAttribute("currentusers", current);
        
    }
	
}
