//Loading required libraries
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatabaseAccess
 */
@WebServlet("/DatabaseAccess")
public class DatabaseAccess extends HttpServlet {
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
     static final String DB_URL="jdbc:mysql://localhost:3306/Test";

     //  Database credentials
     static final String USER = "root";
     static final String PASS = "Root@123";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatabaseAccess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		  // JDBC driver name and database URL
	     

	      // Set response content type
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      String title = "Database Result";
	      
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      out.println(docType +
	         "<html>\n" +
	         "<head><title>" + title + "</title></head>\n" +
	         "<body bgcolor = \"#f0f0f0\">\n" +
	         "<h1 align = \"center\">" + title + "</h1>\n");
	   //   out.println("Connecting");
	      try {
	         // Register JDBC driver
	    //	  out.println("Connecting trying");
	         Class.forName("com.mysql.jdbc.Driver");
	    //     out.println("Connecting trying");
	         // Open a connection
	         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	        // out.println("Sucess");
	         // Execute SQL query
	         Statement stmt = conn.createStatement();
	         String sql;
	         sql = "SELECT id, first, last, age FROM Employees";
	         ResultSet rs = stmt.executeQuery(sql);
	         out.println("<table border=1 width=50% height=50% align=center>");  
             out.println("<tr><th>Id</th><th>Age</th><th>First Name</th><th>Last Name</th><tr>");  
	         // Extract data from result set
	         while(rs.next()){
	            //Retrieve by column name
	            int id  = rs.getInt("id");
	            int age = rs.getInt("age");
	            String first = rs.getString("first");
	            String last = rs.getString("last");

	            out.println("<tr><td>" + id + "</td><td>" + age + "</td><td>" + first + "</td> <td>" + last + "</td></tr>");   
	             
	            
	            
	            
	            //Display values
	         //   out.println("ID: " + id + "<br>");
	       //     out.println(", Age: " + age + "<br>");
	      //      out.println(", First: " + first + "<br>");
	      //      out.println(", Last: " + last + "<br>");
	         }
	         out.println("</table>");  
	         out.println("</body></html>");

	         // Clean-up environment
	         rs.close();
	         stmt.close();
	         conn.close();
	      } catch(SQLException se) {
	         //Handle errors for JDBC
	         se.printStackTrace();
	      } catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	      } 
	     /* finally {
	         //finally block used to close resources
	         try {
	            if(stmt!=null)
	               stmt.close();
	         } catch(SQLException se2) {
	         } // nothing we can do
	         try {
	            if(conn!=null)
	            conn.close();
	         } catch(SQLException se) {
	            se.printStackTrace();
	         } //end finally try
	      } //end try
		*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
