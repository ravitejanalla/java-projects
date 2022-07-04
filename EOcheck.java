package perform;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EOcheck
 */
@WebServlet("/EOcheck")
public class EOcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=null;
		try
		{
			out=response.getWriter();
			int n=Integer.parseInt(request.getParameter("t1"));
			System.out.println("<center>");
			ifs(n%2==0)
				System.out.println(n+"is even number");
			else
				System.out.println(n+"is odd number");
				
		}
		catch(Exception e)
		{
		System.out.println("ERROR:"+e.getMessage());
		
		}
	
	
	
	}
}
