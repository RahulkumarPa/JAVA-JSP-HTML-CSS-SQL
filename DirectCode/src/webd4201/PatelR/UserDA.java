package webd4201.PatelR;

import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 
 * @author Rahulkumar Patel
 *
 */
public class UserDA 
{
	
    
    /**
     * selectID to select the id from the table users and students
     */
    private static final String selectID = "SELECT id FROM users WHERE Id = ?";
    
    /**
     * userInsert take as a string and set as a private and write query to insert data in users table.
     */
    private static final String  userInsert = "INSERT INTO users (id, password,firstname,lastname, emailaddress,enable,enroldate,lastaccess,type) values(?,?,?,?,?,?,?,?,?)"; 
    
    /**
     *studenInsert take as a string and set as a private and write query to insert data in students table. 
     */
    private static final String  studenInsert = "INSERT INTO students (id,programCode,programDescription,year) values(?,?,?,?)";
    
     // declare variables for the database connection,statement and user object
    /**
	 * object of Connection class
	 */
	static Connection aConnection;  
	
	/**
	 * object of Statement class
	 */
	static Statement aStatement;
	
	/**
	 * object of User class.
	 */
	static User aUser = null;
	
	/**
	 * object of StudentDA class.
	 */
	static StudentDA aStudentDA;
	
	
	
	 //constant date formate   
    @SuppressWarnings("unused")
	private static final SimpleDateFormat SQL_DF = new SimpleDateFormat("yyyy-MM-dd");   
  
    
	// declare static variables for all Users instance attribute values
			/**
			 * static variable id.
			 */
			static long id;
			
			/**
			 * static variable password
			 */
			static String password;
			
			/**
			 * static variable firstname as a string
			 */
			static String firstname;
			
			/**
			 * static variable lastname as a string
			 */
			static String lastname;
			
			/**
			 * static variable emailAddress as a string
			 */
			static String emailAddress;
			
			static String programCode;
			static String programDescription;
			static int year;
			
			/**
			 * static variable enable as a string
			 */
			static boolean enable;
			
			/**
			 * static variable type as a character
			 */
			static char type;
			
			static Date enroleDate;
			
			static Date lastAccess;
			
			
			
			// establish the database connection
			/**
			 * @param c
			 * call createStatement() from the connection.
			 */
			public static void initialize(Connection c)
			{
		            try {
		                aConnection=c;
		                aStatement=aConnection.createStatement();
		            }
		            catch (SQLException e)
		            { System.out.println(e);	}
			}
			// close the database connection
			/**
			 * @throws SQLException
			 * call close() from the Statement.
			 */
			public static void terminate()
			{
		            try
		            { 	// close the statement
		                aStatement.close();
		            }
		            catch (SQLException e)
		            { System.out.println(e);	}
			}
	
			
			//check id is exist or not for the user
			public static  User retrieve(long key)throws NotFoundException,InvalidIdException, InvalidNameException, InvalidUserDataException

			{
				try
				{
					aUser = null;
					PreparedStatement select_id = aConnection.prepareStatement(selectID);
					select_id.setLong(1, key);
					
					ResultSet rs = select_id.executeQuery();
					
					boolean gotIt = rs.next();
					if (gotIt)
					{
						id = rs.getLong("id");
	        			password = rs.getString("password");
	        			firstname = rs.getString("firstname");
	        			lastname = rs.getString("lastname");
	        			emailAddress = rs.getString("emailAddress");
	        			lastAccess = rs.getDate("lastAccess");
	        			enroleDate = rs.getDate("enrolDate");
	        			enable = rs.getBoolean("enable");
	        			type = rs.getString("type").charAt(0);
	        			programCode = rs.getString("programCode");
	        			programDescription = rs.getString("programDescription");
	        			year = rs.getInt("year");
						aUser = new User(id,password,firstname,lastname,emailAddress,lastAccess,enroleDate,enable,type);
						 //return result;
						 //aUser.displayToConsole();
						System.out.println(id);
				     }
					else
					{
					}
				}catch (SQLException e)
				{ System.out.println(e);}
				
				return aUser;
			}
			
			
			// first create a user 
			public static boolean create(Student aStudent) throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
			,InvalidUserDataException,DuplicateException
			{
				
				boolean result = false; 
				id = aStudent.getId();
				
				// see if this student already exists in the database
//				try
//				{
//					retrieve(id);
//					throw (new DuplicateException("Problem with creating Student record, student id " + id +" already exists in the system."));
//				}
//				// if NotFoundException, add customer to database
//				catch(NotFoundException e)
//				{
					
					try
		 			{  // execute the SQL update statement
						   //insertion success flag
						// Retrieve the Student attribute values
						id = aStudent.getId();
						firstname = aStudent.getFirstName();
						lastname = aStudent.getLastName();
						emailAddress = aStudent.getEmailAddress();
						lastAccess = aStudent.getLastAccess();
						enroleDate = aStudent.getEnroleDate();
						enable = aStudent.isEnable();
						type = aStudent.getType();
//						programCode = aUser.getProgramCode();
//						programDescription= aUser.getProgramDescription();
//						year = aStudent.getYear();	
//						password = aStudent.getPassword(); 
					    String hash = User.hash(password);	
					    
						PreparedStatement ps = aConnection.prepareStatement(userInsert);
//						PreparedStatement qs = aConnection.prepareStatement(studenInsert);
						
						java.sql.Date sqlLastAccess = new java.sql.Date(lastAccess.getTime());
						java.sql.Date sqlEnrolDate = new java.sql.Date(enroleDate.getTime());
						
						ps.setLong(1,id);
						ps.setString(2,hash);
						ps.setString(3, firstname);
						ps.setString(4, lastname);
						ps.setString(5, emailAddress);
						ps.setBoolean(6, enable);
						ps.setDate(7,sqlEnrolDate);
						ps.setDate(8, sqlLastAccess);
						ps.setString(9, String.valueOf(type));
						
//						qs.setLong(1, id);
//						qs.setString(2, programCode);
//						qs.setString(3, programDescription);
//						qs.setInt(4, year);
         
					    if(ps.executeUpdate()>0)
					    {
					    	result= true;
					    }
						
//						result = qs.execute();
						
					}
					catch (SQLException ee)
						{ System.out.println(ee);	}
					catch (NoSuchAlgorithmException nsae)
					{ System.out.println(nsae);	}
//				}
				return result;
				
			}

			
}
