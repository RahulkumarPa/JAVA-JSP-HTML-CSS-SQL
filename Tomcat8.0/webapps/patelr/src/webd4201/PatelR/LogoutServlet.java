package webd4201.PatelR;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

/**
* LogoutServlet A Servlet that provide connection to the jsp file
* for a logout.
* @author Rahulkumar Patel
* @version 1.0 (2019/2/20)
* @since 1.0
*/

@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,
                            HttpServletResponse response) 
					throws ServletException, IOException
    {
	   	  
        try
        { 
         
            HttpSession session = request.getSession(true);
  //          session.invalidate();
            session.removeAttribute("aUser");//remove the object stored at login
            session.removeAttribute("student");
            session.setAttribute("message","Youhave successfully logged out");//give an informational message
            response.sendRedirect("./login.jsp");  //redirect to login.jsp
            		
            
        }    
   	 catch (Exception e) //not connected
        {
            System.out.println(e);
            String line1="<h2>A network error has occurred!</h2>";
            String line2="<p>Please notify your system " +
                                                    "administrator and check log. "+e.toString()+"</p>";
            formatErrorPage(line1, line2,response);
        }
    }
    public void doGet(HttpServletRequest request,
                            HttpServletResponse response)
                                    throws ServletException, IOException {
        doPost(request, response);
    }
    
    /**
     * formatErrorPage use to display the formate error.
     * @param first
     * @param second
     * @param response
     * @throws IOException
     */
    public void formatErrorPage( String first, String second,
            HttpServletResponse response) throws IOException
    {
        PrintWriter output = response.getWriter();
        response.setContentType( "text/html" );
        output.println(first);
        output.println(second);
        output.close();
    }
}