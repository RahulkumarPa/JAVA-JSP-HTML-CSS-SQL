package webd4201.PatelR;

import java.io.*;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * This is a servlet for registration
 * @author Rahulkumar Patel
 * @version 1.0 (2019/03/25)
 * @since 1.0
 */
@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet 
{
	/* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
	 /* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doPost(HttpServletRequest request,
             HttpServletResponse response) 
		throws ServletException, IOException
    {
	boolean anyErrors = true;
    StringBuffer errorBuffer = new StringBuffer();
    HttpSession session = request.getSession(true);
    
   
        try
        { 
            // connect to database
            Connection c = DatabaseConnect.initialize();
            //for initialize
            Student.initialize(c);
            User.initialize(c);
            //HttpSession session = request.getSession(true);
            
           // User aUser ;
            
            /**
			 * variable id.
			 */
            String id =new String();
            /**
			 * static variable id.
			 */
            String password =new String();
            
            String password_conf =new String();
            String hashedPassword = new String();
            String hashedPasswordconf = new String();
            String firstname =new String();
            String lastname =new String();
            String email  =new String();
            boolean enable= true;
            Character userType =null;
            Character s =null;
            
            GregorianCalendar cal = new GregorianCalendar();
    		Date lastAccess = cal.getTime();
    		cal.set(2019, Calendar.JANUARY, 18);
    		Date enrol = cal.getTime();
            
            String programCode  =new String();
            String programName = new String();
            String year = new String();
            /**
    		 * static variable lastAccess as a date
    		 */
    		
    		
    		/**
    		 * static variable enrolDate as a date
    		 */
    		 
            
            id = request.getParameter( "user_id" ).trim(); //this is the name of the text input box on the form
           // long newid = Long.parseLong(id);
			hashedPassword = request.getParameter( "passwd" ).trim();
			password = User.hash(hashedPassword) ;
		    hashedPasswordconf =request.getParameter("conf_passwd").trim();
			password_conf = User.hash(hashedPasswordconf) ;
			firstname = request.getParameter( "FirstName" ).trim();
			lastname = request.getParameter( "LastName" ).trim();
			email = request.getParameter( "email_address" ).trim();
            enable = true;
			userType = 's';
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
						//else
						//{
						//	anyErrors = true;
						//	errorBuffer.append("<h3>Id allready existe.</h3>\n");
						//	session.setAttribute("id", " ");
						//	
						//}
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
			
			
			if(hashedPassword.length() != 0)
			 {
				if(User.verifyPassword(hashedPassword))
				{
					if(!hashedPassword.equals(hashedPasswordconf))
					{
						anyErrors = true;
						errorBuffer.append("<h3>Your password not match .</h3>\n");	
					}
				}
				else
				{
					anyErrors = true;
					errorBuffer.append("<h3>You must enter a password in a range.</h3>\n");
				}		
			 }
			else if(hashedPassword.length() == 0)
			{
				anyErrors = true;
				errorBuffer.append("<h3>You must enter password .</h3>\n");	
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
	    	    System.out.println("Before stdent dump");
	    	    
				aStudent.create();
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
		 
//			}
        	
//			
//			session.setAttribute("student", aStudent);
//			
//			//empty out any errors if there were some
//            session.setAttribute("errors", "");
            // redirect the user to a JSP
           ;
//			if(User.retrieve(Long.parseLong(id)) == null)
//			{
//				errorBuffer.append("<h3>id all ready existe.</h3>\n");	
//				session.setAttribute("errors",errorBuffer.toString());
//			}else
//			{
//				        //	aUser.create();
//			}	
			
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