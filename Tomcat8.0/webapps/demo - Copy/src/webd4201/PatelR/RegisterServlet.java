package webd4201.PatelR;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request,
            HttpServletResponse response) 
	throws ServletException, IOException
		{
		  try
		  {
		  // connect to database
           Connection c = DatabaseConnect.initialize();
           Student.initialize(c);
           HttpSession session = request.getSession(true);
         
           String id =new String();
           String password =new String();
           String conf = new String();
           String firstname = new String();
           String Lastname = new String();
           String email = new String();
           String type = new String();
		 
			try
			{ 
	
			//          session.invalidate();
			session.removeAttribute("aUser");//remove the object stored at login
			session.removeAttribute("student");
			session.setAttribute("message","Please entered data");//give an informational message
			
			id = request.getParameter( "user_id" ); //this is the name of the text input box on the form
            String hashedPassword = User.hash(request.getParameter( "passwd" ));
            password = hashedPassword ;
            String hashedPasswordconf = User.hash(request.getParameter( "conf_passwd" ));
            conf = hashedPasswordconf ;
            firstname = request.getParameter("FirstName").trim();
            Lastname = request.getParameter("LastName").trim();
            email = request.getParameter("email_address");
			}    
			catch (Exception e) //not connected
			{
			System.out.println(e);
			String line1="<h2>A network error has occurred!</h2>";
			String line2="<p>Please notify your system " +
                    "administrator and check log. "+e.toString()+"</p>";
			formatErrorPage(line1,line2,response);
			}
		 }
		 catch(Exception e) //not connected
	        {
	            System.out.println(e);
	            String line1="<h2>A network error has occurred!</h2>";
	            String line2="<p>Please notify your system " +
	                                                    "administrator and check log. "+e.toString()+"</p>";
	            formatErrorPage(line1, line2,response);
	        }
        }
	   public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	           {
				doPost(request, response);
				}
				
				/**
				* @param first
				* @param second
				* @param response
				* @throws IOException
				*/
	   public void formatErrorPage( String first, String second,HttpServletResponse response) throws IOException
				{
				PrintWriter output = response.getWriter();
				response.setContentType( "text/html" );
				output.println(first);
				output.println(second);
				output.close();
				}
}
