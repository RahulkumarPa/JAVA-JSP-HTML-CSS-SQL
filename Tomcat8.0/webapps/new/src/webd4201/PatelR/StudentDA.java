package webd4201.PatelR;



import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;




/***
 * 
 * @author gopal
 *
 */

public class StudentDA {
	 
	    /**
	     * userInsert take as a string and set as a private and write query to insert data in users table.
	     */
	    private static final String  userInsert = "INSERT INTO users (id, password,firstname,lastname, emailaddress,enable,enroldate,lastaccess,type) values(?,?,?,?,?,?,?,?,?)"; 
	    
	    /**
	     *studenInsert take as a string and set as a private and write query to insert data in students table. 
	     */
	    private static final String  studenInsert = "INSERT INTO students (id,programCode,programDescription,year) values(?,?,?,?)";        
	    
	    /**
	     * userUpdate take as a string and set as a private and write query to update data in update table. 
	     */
	    private static final String  userUpdate = "UPDATE users SET password=?,firstname=?,lastname=?,emailaddress=?,enable=? ,enroldate=?,lastaccess=?,type=? WHERE id= ? ";        
	    
	    /**
	     * studentUpdate take as a string and set as a private and write query to update data in students table. 
	     */
	    private static final String  studentUpdate = "UPDATE students SET programCode=?,programDescription=?,year=? WHERE id= ? ";        
	    
	    /**
	     * userDelete take as a string and set as a private and write query to delete data in users table. 
	     */
	    private static final String  userDelete = "DELETE FROM users WHERE id= ? ";  
	    
	    /**
	     * studentDelete take as a string and set as a private and write query to delete data in students table. 
	     */
	    private static final String  studentDelete = "DELETE FROM students WHERE id= ? "; 
	    
	    /**
	     * select take as a string and set as a private and write query to select data from the users table.
	     */
	    private static final String select = "SELECT users.Id, Password, FirstName, LastName, EmailAddress, LastAccess,"
                   +" EnrolDate, enable, Type, ProgramCode, ProgramDescription, Year"
                   +" FROM users, students WHERE users.id = students.id AND users.Id = ?";
	    
	    private static final String select_ID_PASSWORD= "SELECT users.Id, Password, FirstName, LastName, EmailAddress, LastAccess,"
                   +" EnrolDate, enable, Type, ProgramCode, ProgramDescription, Year"
                +" FROM users, students WHERE users.id = students.id AND users.id = ? And users.password = ?";
	    
	    private static final String passwordupdate =  "UPDATE users SET password=?  WHERE id= ? "; 
	    
	    private static final String select_PASSWORD= "SELECT users.Id, Password"
             +" FROM users WHERE users.id = ? And users.password = ?";

	
	
	// declare variables for the database connection,statement and student object
		
	    /**
		 * object of Connection class
		 */
		static Connection aConnection;  
		
		/**
		 * object of Statement class
		 */
		static Statement aStatement;
		
		/**
		 * object of Student class.
		 */
		static Student aStudent;
		
	// declare static variables for all Students instance attribute values
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
		
		/**
		 * static variable enable as a string
		 */
		static boolean enable;
		
		/**
		 * static variable type as a character
		 */
		static char type;
		
		/**
		 * static variable lastAccess as a date
		 */
		static Date lastAccess;
		
		/**
		 * static variable enrolDate as a date
		 */
		static Date enrolDate;
		
		/**
		 *  static variable programCode as a String
		 */
		static String programCode;
	   
		/**
	     * static variable programDescription as a String
	     */
	    static String programDescription;
	   
	    /**
	     * static variable year as a integer
	     */
	    static int year ;
	    
	 //constant date formate   
	    @SuppressWarnings("unused")
		private static final SimpleDateFormat SQL_DF = new SimpleDateFormat("yyyy-MM-dd");   
	  
	  //  private static final String CREATE_STMT = " INSERT INTO students (id, programCode, programDescription, year)" + " values (?, ?, ?, ?)";
	 
	   
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
		/**
		 * @param aStudent
		 * @return
		 * @throws SQLException
		 * call all the attributes of the Student class.and insert data in user and student table.
		 */
		public static boolean create(Student aStudent) throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
		,InvalidUserDataException,DuplicateException
		{
			boolean result = false; 
			id = aStudent.getId();
			// create the  queryinsert statement using attribute values
			/*String queryInsert = "INSERT INTO users " +
	                                    "(id,password,first_name,last_name,email_address,last_access,enrol_date,enable,type,programCode,programDescription,year) " +
	                                    "VALUES ('" + id + "', '" + password + "','" + firstname + "','" + lastname + "','" + emailAddress + "','" + lastAccess + "','" + enrolDate + "','" + enable+ "','" + type+ "',"
	                                    		+ "'" +programCode + "', '" +
	                                    programDescription + "'"
	                                    		+ ", '" +
	                                    		year + "')";*/

			// see if this student already exists in the database
			try
			{
				retrieve(id);
				throw (new DuplicateException("Problem with creating Student record, student id " + id +" already exists in the system."));
			}
			// if NotFoundException, add customer to database
			catch(NotFoundException e)
			{
				try
	 			{  // execute the SQL update statement
					   //insertion success flag
					// Retrieve the Student attribute values
					id = aStudent.getId();
					firstname = aStudent.getFirstName();
					lastname = aStudent.getLastName();
					emailAddress = aStudent.getEmailAddress();
					lastAccess = aStudent.getLastAccess();
					enrolDate = aStudent.getEnroleDate();
					enable = aStudent.isEnable();
					type = aStudent.getType();
					programCode = aStudent.getProgramCode();
					programDescription= aStudent.getProgramDescription();
					year = aStudent.getYear();	
					password = aStudent.getPassword(); 
				    String hash = User.hash(password);				
					PreparedStatement ps = aConnection.prepareStatement(userInsert);
					PreparedStatement qs = aConnection.prepareStatement(studenInsert);
					java.sql.Date sqlLastAccess = new java.sql.Date(lastAccess.getTime());
					java.sql.Date sqlEnrolDate = new java.sql.Date(enrolDate.getTime());
					ps.setLong(1,id);
					ps.setString(2,hash);
					ps.setString(3, firstname);
					ps.setString(4, lastname);
					ps.setString(5, emailAddress);
					ps.setBoolean(6, enable);
					ps.setDate(7,sqlEnrolDate);
					ps.setDate(8, sqlLastAccess);
					ps.setString(9, String.valueOf(type));
					
					qs.setLong(1, id);
					qs.setString(2, programCode);
					qs.setString(3, programDescription);
					qs.setInt(4, year);

					result = ps.execute();
					result = qs.execute();
					
				}
				catch (SQLException ee)
					{ System.out.println(ee);	}
				catch (NoSuchAlgorithmException nsae)
				{ System.out.println(nsae);	}
			}
			return result;
			
		}
		
		/**
		 * @param key
		 * @return
		 * @throws NotFoundException
		 * @throws InvalidPasswordException 
		 * @throws InvalidNameException 
		 * check id is stored in a tables or not.
		 */
		public static Student retrieve(long key)throws NotFoundException,InvalidIdException, InvalidNameException, InvalidUserDataException
		{
			//retrieve Student sand Boat data
			aStudent = null;
			// define the SQL query statement using the id as a key
			//String query = "SELECT id, password, first_name,last_name, email_address,enrol_date,last_access, enable,type, programCode,programDescription, year "
				//	 +"FROM users,students" +" WHERE id = '" + key +"'" ;
			//execute the SQL query
			try
			{
				//
                // next method sets cursor & returns true if there is data
				PreparedStatement select_user = aConnection.prepareStatement(select);
				select_user.setLong(1,key);
				
				ResultSet rs = select_user.executeQuery();
				
                boolean gotIt = rs.next();
                if (gotIt)
                {	// extract the data
                	id = rs.getLong("id");
        			password = rs.getString("password");
        			firstname = rs.getString("firstname");
        			lastname = rs.getString("lastname");
        			emailAddress = rs.getString("emailAddress");
        			lastAccess = rs.getDate("lastAccess");
        			enrolDate = rs.getDate("enrolDate");
        			enable = rs.getBoolean("enable");
        			type = rs.getString("type").charAt(0);
        			programCode = rs.getString("programCode");
        			programDescription = rs.getString("programDescription");
        			year = rs.getInt("year");
		
        			aStudent = new Student(id,password,firstname,lastname,emailAddress,lastAccess,enrolDate,enable,type,programCode,programDescription,year);
                }else //nothing
                  	// nothing was retrieved
                {throw (new NotFoundException("Problem retrieving Student record, with student id " + key +" does not exist in the system."));}
                rs.close();

			}
			catch (SQLException e)
			{ System.out.println(e);}
	                
			return aStudent;
		}
		
		//update method
		/**
		 * @param aStudent
		 * @return
		 * @throws NotFoundException
		 * @throws InvalidPasswordException 
		 * @throws InvalidNameException 
		 * call all the attributes of the Student class.and update data in user and student table.
		 */
		public static boolean update(Student aStudent) throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
		,InvalidUserDataException,DuplicateException
		{	
			boolean records = false;  //records updated in method
			
			// Retrieve the Student attribute values
			id = aStudent.getId();
			password= aStudent.getPassword();
			firstname = aStudent.getFirstName();
			lastname = aStudent.getLastName();
			emailAddress = aStudent.getEmailAddress();
    		lastAccess = aStudent.getLastAccess();
			enrolDate = aStudent.getEnroleDate();
			enable = aStudent.isEnable();
	     	type = aStudent.getType();
		    programCode = aStudent.getProgramCode();
			programDescription= aStudent.getProgramDescription();
			year = aStudent.getYear();	

			
//			// define the SQL query statement using the phone number key
//			String sqlUpdate = "Update users,students " +
//					" SET password = '" + password +"', " +
//					" first_name   = '" + firstname +"' " +
//                    " last_name   = '" + lastname +"' " +
//                    " email_address   = '" + emailAddress +"' " +
//                    " last_access   = '" + lastAccess +"' " +
//                    " enrol_date   = '" + enrolDate +"' " +
//                    " type   = '" + type +"' " +
//                    " enable   = '" + enable +"' " +
//                    " programCode   = '" + programCode +"' " +
//                    " programDescription   = '" + programDescription +"' " +
//                    " year   = '" + year +"' " +
//                    " WHERE id = '" + id + "'";
			// see if this customer exists in the database
			// NotFoundException is thrown by find method
			try
			{
				retrieve(id);  //determine if there is a Customer recrod to be updated
                // if found, execute the SQL update statement
				PreparedStatement update_user = aConnection.prepareStatement(userUpdate);
				PreparedStatement update_student = aConnection.prepareStatement(studentUpdate);
				java.sql.Date sqllastAccess = new java.sql.Date(lastAccess.getTime());
				java.sql.Date sqlenrolDate = new java.sql.Date(enrolDate.getTime());
				update_user.setString(1,password);
				update_user.setString(2, firstname);
				update_user.setString(3, lastname);
				update_user.setString(4, emailAddress);
				update_user.setDate(6, sqlenrolDate);
				update_user.setDate(7,sqllastAccess);
				update_user.setBoolean(5, enable);
				update_user.setString(8, String.valueOf(type));
				update_user.setFloat(9, id);
				
				update_student.setString(1, programCode);
				update_student.setString(2, programDescription);
				update_student.setInt(3, year);
				update_student.setLong(4, id);
				
				records = update_user.execute();
				records = update_student.execute();
	               
	                   // records = aStatement.executeUpdate(sqlUpdate);
			}catch(NotFoundException e)
			{
				throw new NotFoundException("Student with id " + id 
						+ " cannot be updated, does not exist in the system.");
			}catch (SQLException e)
			{ System.out.println(e);}
			return records;
		}
		
		/**
		 * @param aStudent
		 * @return
		 * @throws NotFoundException
		 * @throws InvalidIdException
		 * @throws InvalidNameException
		 * @throws NotFoundException
		 * @throws InvalidUserDataException
		 * @throws DuplicateException
		 * call all the attributes of the Student class.and Delete data in user and student table.
		 */
		public static boolean delete(Student aStudent) throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
		,InvalidUserDataException,DuplicateException
		{	
			boolean records = false;
			// retrieve the phone no (key)
			id = aStudent.getId();
			// create the SQL delete statement
			/*String sqlDelete = "DELETE FROM users,students " +
	                                    "WHERE id = '" + id +"'";*/

			// see if this customer already exists in the database
			try
			{
				retrieve(id);  //used to determine if record exists for the passed Customer
	    		// if found, execute the SQL update statement
	    		//records = aStatement.executeUpdate(sqlDelete);
				PreparedStatement delete_user = aConnection.prepareStatement(userDelete);
				PreparedStatement delete_student = aConnection.prepareStatement(studentDelete);
				
				delete_user.setLong(1,id);
				
				
				delete_student.setLong(1,id);
				
				
				records = delete_user.execute();
				records = delete_student.execute();
				
			}catch(NotFoundException e)
			{
				throw new NotFoundException("Student with id " + id 
						+ " cannot be deleted, does not exist.");
			}catch (SQLException e)
				{ System.out.println(e);	}
			return records;
		}
		
		/**
		 * @param key
		 * @param pasword
		 * @return
		 * @throws NotFoundException
		 * @throws InvalidIdException
		 * @throws InvalidNameException
		 * @throws NotFoundException
		 * @throws InvalidUserDataException
		 * @throws DuplicateException
		 * @throws SQLException
		 * for update password
		 */
		public static Student authenticate(long key,String pasword)throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
		,InvalidUserDataException,DuplicateException, SQLException
		{ 
			aStudent =  null;
			PreparedStatement select_id_password = aConnection.prepareStatement(select_ID_PASSWORD);
			select_id_password.setLong(1, key);
			select_id_password.setString(2, pasword);;
			
			ResultSet rs = select_id_password.executeQuery();
			
			boolean gotIt = rs.next();
			if (gotIt)
			{
            	id = rs.getLong("id");
            	password = rs.getString("password");
    			firstname = rs.getString("firstname");
    			lastname = rs.getString("lastname");
    			emailAddress = rs.getString("emailAddress");
    			lastAccess = rs.getDate("lastAccess");
    			enrolDate = rs.getDate("enrolDate");
    			enable = rs.getBoolean("enable");
    			type = rs.getString("type").charAt(0);
    			programCode = rs.getString("programCode");
    			programDescription = rs.getString("programDescription");
    			year = rs.getInt("year");
	
    			aStudent = new Student(id,password,firstname,lastname,emailAddress,lastAccess,enrolDate,enable,type,programCode,programDescription,year);
			}else//nothing
			{throw (new NotFoundException("Problem authenticating Student record, with student id " + key +" does not exist in the system with your password"));}
            rs.close();
         
		return aStudent;
			
		}
		
		/**
		 * @param aStudent
		 * @return
		 * @throws NotFoundException
		 * @throws InvalidIdException
		 * @throws InvalidNameException
		 * @throws NotFoundException
		 * @throws InvalidUserDataException
		 * @throws DuplicateException
		 */
		public static boolean updatePassword(String pasword) throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
		,InvalidUserDataException,DuplicateException
		{	
			boolean records = false;  //records updated in method
			
			// Retrieve the Student attribute values
			id = aStudent.getId();
			password= aStudent.getPassword();
			

			
//			
			try
			{
				retrieve(id);  //determine if there is a Customer recrod to be updated
                // if found, execute the SQL update statement
				PreparedStatement update_password = aConnection.prepareStatement(passwordupdate);
				//PreparedStatement update_student = aConnection.prepareStatement(studentUpdate);
				//java.sql.Date sqllastAccess = new java.sql.Date(lastAccess.getTime());
				//java.sql.Date sqlenrolDate = new java.sql.Date(enrolDate.getTime());
				update_password.setLong(1,id);
				update_password.setString(2,password);
				
				
				
				
				records = update_password.execute();
				
	               
	                   // records = aStatement.executeUpdate(sqlUpdate);
			}catch(NotFoundException e)
			{
				throw new NotFoundException("Student with id " + id 
						+ " cannot be updated, does not exist in the system.");
			}catch (SQLException e)
			{ System.out.println(e);}
			return records;
		}
		
		public static Student passwordAuthenticate(long key,String pasword)throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
		,InvalidUserDataException,DuplicateException, SQLException
		{ 
			aStudent =  null;
			PreparedStatement select_password = aConnection.prepareStatement(select_PASSWORD);
			select_password.setLong(1, key);
			select_password.setString(2, pasword);;
			
			ResultSet rs = select_password.executeQuery();
			
			boolean gotIt = rs.next();
			if (gotIt)
			{
            	id = rs.getLong("id");
            	password = rs.getString("password");
    			
	
    			aStudent = new Student(id,password,firstname,lastname,emailAddress,lastAccess,enrolDate,enable,type,programCode,programDescription,year);
			}else//nothing
			{throw (new NotFoundException("Problem authenticating Student record, with student id " + key +" does not exist in the system with your password"));}
            rs.close();
         
		return aStudent;
			
		}
}
