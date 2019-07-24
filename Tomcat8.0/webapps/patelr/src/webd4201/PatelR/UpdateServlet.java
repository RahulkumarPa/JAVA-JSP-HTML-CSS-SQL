package webd4201.PatelR;
import java.io.*;
import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * UpdateServlet This is a servlet for Update the student,
 * which extends HttpServlet to set the session
 * @author Rahulkumar Patel
 * @version 1.0 (2019/04/15)
 * @since 1.0
 */
@SuppressWarnings("serial")
public class UpdateServlet extends HttpServlet {
	
	/**
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */

	public void doPost(HttpServletRequest request,
            HttpServletResponse response) 
		throws ServletException, IOException
   {

        /**
		* variable anyErrors as a boolean by default true.
	   */
	   boolean anyErrors = true;
	   /**
		* variable errorBuffer as a Stringe.
	   */
	   StringBuffer errorBuffer = new StringBuffer();
	   
	   // connect to database
	   /**
	 	 * object of connection class to connect with the database
	 	 */
	   Connection c = DatabaseConnect.initialize();
	   /**
	    * initialize that initialize the connection
		 * @param c.
		 */
	   //for initialize
	   Student.initialize(c);
	   HttpSession session = request.getSession(true);
   
      
           /**
			 * variable id.
			 */
            String id =new String();
            /**
			 * static variable id.
			 */
            String password =new String();
            /**
			 * string password_conf to get conf passwword from the form
			 */
            
            String firstname =new String();
            /**
			 * string lastname to get last name from the form 
			 */
            String lastname =new String();
            /**
			 * string email to get email from the form 
			 */
            String email  =new String();
            /**
			 * boolean enablele by default true
			 */
            boolean enable= true;
            /**
			 * Character userType null
			 */
            char userType =(Character) null;
            /**
			 * Character s null
			 */
            Character s =null;
            
            GregorianCalendar cal = new GregorianCalendar();
            /**
			 * date  lastAccess
			 */
    		Date lastAccess = cal.getTime();
    		cal.set(2019, Calendar.JANUARY, 18);
    		 /**
			 * date  enrol
			 */
    		Date enrol = cal.getTime();
    		/**
			 * String programCode 
			 */
            String programCode  =new String();
            /**
			 * String programName 
			 */
            String programName = new String();
            /**
			 * String year 
			 */
            String year = new String();
            try
            {  
            
            id = request.getParameter( "user_id" ).trim(); //this is the name of the text input box on the form
			firstname = request.getParameter( "FirstName" ).trim();
			lastname = request.getParameter( "LastName" ).trim();
			email = request.getParameter( "email_address" ).trim();
            enable = true;
            userType = s;
			//userType = request.getParameter( "selelct" ).trim();
			programCode = request.getParameter( "ProgramCode" ).trim();
			programName = request.getParameter( "ProgramName" ).trim();
			year = request.getParameter( "Programyear" ).trim();
			
			if(id.length() == 0)
			{
				anyErrors = true;
				errorBuffer.append("<h3>You must enter a student number.</h3>\n");
            }
            else if(id.length() != 0)
			{
				try
			      {
					long studentNumber = Long.parseLong(id);
					
					session.setAttribute("id", id);
					//HERE YOU WOULD CHECK THAT studentNumber DOES NOT ALREADY EXIST IN THE DB
					if(User.verifyId(studentNumber))
					{
						
						//if(User.retrieve(studentNumber) == null)
						{
							session.setAttribute("id", id);
						}
						
					}
					else
					{
						anyErrors = true;
						errorBuffer.append("<h3>You must enter a student number in a range.</h3>\n");
						session.setAttribute("id", " ");
					}
					}
					catch(NumberFormatException nfe)
					{
						anyErrors = true;errorBuffer.append("<h3>" + id + " is not a valid student number.</h3>\n");
						session.setAttribute("id", " ");
						//session.setAttribute("studentNumber", "");//place empty on session for form
					}		
	        }
			
			
			
			
			if(firstname.length() != 0)
			{
				if(firstname.length()>4)
				{
					session.setAttribute("firstname", firstname);
				}else
				{
				anyErrors = true;
				errorBuffer.append("<h3>You must enter more than 4 character in firstname.</h3>\n");
				session.setAttribute("firstname", " ");
			    }
			}
			else if(firstname.length() == 0)
			{
				anyErrors = true;
				errorBuffer.append("<h3>You must enter firstname .</h3>\n");
				session.setAttribute("firstname", " ");
			}
			
	        
			
			if(lastname.length() != 0)
			{
				if(lastname.length()>4)
				{
					session.setAttribute("lastname", lastname);
				}else
				{
				anyErrors = true;
				errorBuffer.append("<h3>You must enter more than 4 character in lastname.</h3>\n");	
				session.setAttribute("lastname", " ");
			    }
			}
			else if(lastname.length() == 0)
			{
				anyErrors = true;
				errorBuffer.append("<h3>You must enter lastname .</h3>\n");	
				session.setAttribute("lastname", " ");
			}
			
			if(email.length() != 0)
			{
				boolean valid = true;
				if(User.isValidEmailAddress(email)== valid)
             	{
     		     session.setAttribute("email", email);
			  	}
				else
				{
					anyErrors = true;
					errorBuffer.append("<h3>" + email+ " is not a valid email.</h3>\n");
					session.setAttribute("email", " ");
				}
			}
			else if(email.length() == 0)
			{
				anyErrors = true;
				errorBuffer.append("<h3>You must enter email.</h3>\n");
				session.setAttribute("email", " ");	
			}
			

			
			
			if(programCode.length() != 0)
			{
				if(programCode.length()>4 && programCode.length()<=6)
				{
					session.setAttribute("programCode", programCode);
				}
				else
				{
					anyErrors = true;
				    errorBuffer.append("<h3>You must enter a programCode in a range.</h3>\n");
				    session.setAttribute("programCode", " ");
				 }
			}
			else if(programCode.length() == 0)
				{
					anyErrors = true;
					errorBuffer.append("<h3>You must enter programCode.</h3>\n");
					session.setAttribute("programCode", " ");
				}
				
			if(programName.length() != 0)
			{
				if(programName.length()>10 && programName.length()<30)
				{
					session.setAttribute("programName",programName);	
				}
				else
				{
					anyErrors = true;
					errorBuffer.append("<h3>You must enter a ProgramName in a range.</h3>\n");
					session.setAttribute("programName"," ");
				}
			}
			
			else if(programName.length() == 0)
				{
					anyErrors = true;
					errorBuffer.append("<h3>You must enter programName.</h3>\n");	
					session.setAttribute("programName"," ");
				}	
			
				
			if(anyErrors == true){
				
				session.setAttribute("errors",errorBuffer.toString());
				response.sendRedirect("./register.jsp");
				
			}else{
				Student aStudent = new Student(Long.parseLong(id),password,firstname,lastname,email,enrol,lastAccess,enable,userType,programCode,programName, Integer.parseInt(year));

	    	    aStudent.updateTermTest();
	    	    aStudent.displayToConsole();

				session.setAttribute("errors"," ");
				session.setAttribute("id", " ");
				session.setAttribute("firstname", " ");
				session.setAttribute("lastname", " ");
				session.setAttribute("email", " ");
				session.setAttribute("programCode", " ");
				session.setAttribute("programName", " ");
				response.sendRedirect("./dashboard.jsp");
		}
		
			
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
     * @param first as a string
     * @param second as a string
     * @param response as a httpservlet
     * @throws IOException throw the exception with the message.
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