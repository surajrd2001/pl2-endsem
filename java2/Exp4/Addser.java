import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Addser
 */
@WebServlet("/Addser")
public class Addser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//PrintWriter out = response.getWriter();
		int a = Integer.parseInt(request.getParameter("txtnum1"));
		int b = Integer.parseInt(request.getParameter("txtnum2"));
		int c=0;
		if(request.getParameter("btnsubmit").equals("+"))
		{
		c= a+b;
		}
		else if(request.getParameter("btnsubmit").equals("-"))
		{
		c=a-b;	
		}
		else if(request.getParameter("btnsubmit").equals("*"))
		{
		  c=a*b;	
		}
		else if(request.getParameter("btnsubmit").equals("/"))
		{
			c=a/b;
		}
		
		response.sendRedirect("addition.jsp?q="+c);
		//out.print(c);
	}
	

}
