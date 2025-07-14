package cap.com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String n=request.getParameter("username");
		out.print("Welcome "+n);
		
		HttpSession session=request.getSession();
		session.setAttribute("uname",n);
		
		ServletContext ctx=getServletContext();
		int t=(int) ctx.getAttribute("totalusers");
		int c=(int) ctx.getAttribute("currentusers");
		out.print("<br> totatl users="+t);
		out.print("<br> current users="+c);
		
		out.print("<br> <a href='LogOutServlet'>logout</a>");
		out.close();
		
		
	}

}
