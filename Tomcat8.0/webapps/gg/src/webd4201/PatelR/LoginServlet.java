package webd4201.PatelR;
/**
A Servlet that provide connection to the jsp file
for a login.
* @author Rahulkumar Patel
* @version 1.0 (2019/2/20)
* @since 1.0
*/
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
import java.util.Vector;


@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
   
    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public void doPost(HttpServletRequest request,
                            HttpServletResponse response) 
					throws ServletException, IOException
    {
	   	    
	   	//CREATE A TEXT FILE 
	   	/*String logFile = "./test_log.log";
	    File f = new File(logFile);
	    PrintStream printStream = new PrintStream(new BufferedOutputStream(new FileOutputStream(f)), true);
	    System.setErr(printStream);
	    System.setOut(printStream);
	    System.out.println("Log started: " + new java.util.Date());
	    */
        try
        { 
            // connect to database
            Connection c = DatabaseConnect.initialize();
            Student.initialize(c);
            HttpSession session = request.getSession(true);
            
            String id =new String();
            String password =new String();		
            try 
            {   // retrieve data from DB
                id = request.getParameter( "login" ); //this is the name of the text input box on the form
                String hashedPassword = User.hash(request.getParameter( "pass" ));
                password = hashedPassword ;
                Student aStudent = Student.authenticate(Long.parseLong(id), password); //attempt to find the Customer, this could cause a NotFoundException
                // if the Customer was found and retrieved from the db
				//put the found Customer onto the session
                session.setAttribute("student", aStudent);
                
				//empty out any errors if there were some
                session.setAttribute("errors", "");
                 
              //   Mark aMark = Mark.result(Long.parseLong(id));
              // Vector<Mark> aMark = StudentDA.result1(Long.parseLong(id));
               // session.setAttribute("mark", aMark);

                // redirect the user to a JSP
                response.sendRedirect("./dashboard.jsp");
            }catch( NotFoundException nfe)
            {
                //new code == way better, if I do say so myself
                //sending errors to the page thru the session
                StringBuffer errorBuffer = new StringBuffer();
                errorBuffer.append("<strong>Your sign in information is not valid.<br/>");
                errorBuffer.append("Please try again.</strong>");
                if(Student.retrieve(Long.valueOf(id)) != null)                		
                  session.setAttribute("id", id);
                else
                {
                  errorBuffer.append("Invalid login id.</strong>");
                  session.setAttribute("id", "");
                }
                session.setAttribute("errors", errorBuffer.toString());
                response.sendRedirect("./login.jsp");
            
            //for the first deliverable you will have to check if there was a problem
            //with just the password, or login id and password
            //this will require a special method e.g. public static boolean isExistingLogin(String arg);
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