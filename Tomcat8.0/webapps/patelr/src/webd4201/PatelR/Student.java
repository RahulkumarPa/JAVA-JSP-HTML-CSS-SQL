package webd4201.PatelR;


import java.util.Date;
import java.util.Vector; //for a vector
import java.sql.Connection;
import java.sql.SQLException;
/**
A class that provide a Student inherit from the user class.
* @author Rahulkumar Patel
* @version 1.0 (2019/1/20)
* @since 1.0
*/

public class Student extends User
{
	
	/**
	 * DEFAULT_PROGRAM_CODE set final string if user enter wrong detail its 
	 * Automatically set this value
	 */
    public final static String DEFAULT_PROGRAM_CODE = "UNDC"  ;
    /**
	 * DEFAULT_PROGRAM_DESCRIPTION set final string if user enter wrong detail its 
	 * Automatically set this value
	 */
    public final static String DEFAULT_PROGRAM_DESCRIPTION  = "Undeclared"  ;
    /**
	 * DEFAULT_YEAR set final string int,user enter wrong detail its 
	 * Automatically set this value
	 */
    public final static int DEFAULT_YEAR  = 1 ;
    
    
    /**
  	 * programCode set as a string and accesses is private
  	 */
    private String programCode =" ";
    /**
  	 * programCode set as a string and accesses is private
  	 */
    private String programDescription =" ";
    /**
  	 * year set as a string and accesses is private
  	 */
    private int year ;
    
    /**
     * Use vector and name it to mark
     */
    Vector<Mark> marks = new Vector<Mark>();
    
    

    /**
     * @getProgramCode return programCode
     * @return programcCode as a string
     */
    public String getProgramCode() {
        return programCode;
    }
    /**
     * @ programDescription set it
     * @return programDescription as a string
     */
    public String getProgramDescription() {
        return programDescription;
    }
    /**
     *  getYear get the year
     * @return year as integer
     */
    public int getYear() {
        return year;
    }
    /**
     * @ marks from vector
     * @ return marks vector
     */
    
    public Vector<Mark> getMarks() {
		return marks;
	}
    
    /**
     * setProgramCode
     * @param programCode
     * @return programCode set as string
     */
    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }
    /**
     * setProgramDescription
     * @param programDescription
     */

    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }
    /**
     *setYear set the year
     * @param programDescription
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * @param marks vactor
     * @return marks as vector
     */
    public void setMarks(Vector<Mark> marks) {
		this.marks = marks;
	} 
    
    //5-c ended
    //part 2 6-a
    /**
     * @param c connection
     */
    public static void initialize(Connection c)
    {
    	StudentDA.initialize(c);
    }
    
    /**
     * terminate connection.
     */
    public static void terminate()
    {
    	StudentDA.terminate();
    }
    /**
     * @param key long
     * @return object of student
     * @throws NotFoundException
     * @throws InvalidIdException
     * @throws InvalidNameException
     * @throws NotFoundException
     * @throws InvalidUserDataException
     * @throws DuplicateException
     * method to retrieve id and check this method call from the 
     * StudentDA class.  
     */
    public static Student retrieve(long key)throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
	,InvalidUserDataException,DuplicateException 
  {
    	return StudentDA.retrieve(key);
    }
    
    
    public static Student authenticate(long key,String password)throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
	,InvalidUserDataException,DuplicateException, SQLException
    {
      	return StudentDA.authenticate(key,password);
      }
 // DA instance methods, you NEED to be a Customer object to do these *********************************
    /**
     * create() create a student
     * @return retuen the object of a student
     * @throws NotFoundException
     * @throws InvalidIdException
     * @throws InvalidNameException
     * @throws NotFoundException
     * @throws InvalidUserDataException
     * @throws DuplicateException
     * create a method and call database functionality like create ,delete, and update
     * data in database and this methods are called StudentDA class.
     */
    public void create() throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
	,InvalidUserDataException,DuplicateException
    	{
    	StudentDA.create(this);
    	}
    /**
     * delete() create a student
     * @return retuen the object of a student
     * @throws NotFoundException
     * @throws InvalidIdException
     * @throws InvalidNameException
     * @throws NotFoundException
     * @throws InvalidUserDataException
     * @throws DuplicateException
     * create a method and call database functionality like create ,delete, and update
     * data in database and this methods are called StudentDA class.
     */ 
    public void delete() throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
	,InvalidUserDataException,DuplicateException
    	{
    	StudentDA.delete(this);
    	}
    
    /**
     * update() create a student
     * @return retuen the object of a student
     * @throws NotFoundException
     * @throws InvalidIdException
     * @throws InvalidNameException
     * @throws NotFoundException
     * @throws InvalidUserDataException
     * @throws DuplicateException
     * create a method and call database functionality like create ,delete, and update
     * data in database and this methods are called StudentDA class.
     */ 
    public void update() throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
	,InvalidUserDataException,DuplicateException
    	{
    	StudentDA.update(this);
    	}
    

   
  
    /**
     * Parameterized constructor and use super() to assign parent class variables.
     * @param id int
     * @param password string
     * @param firstName string
     * @param lastName string
     * @param emailAddress string
     * @param lastAccess string
     * @param enroleDate date
     * @param enable boolean
     * @param type character
     * @param programCode string
     * @param programDescription string
     * @param year int
     * @param marks vector
     * @throws InvalidUserDataException
     * 
     */
    public Student(long id,String password ,String firstName, String lastName, String emailAddress,Date lastAccess, Date enroleDate,boolean enable,char type,String programCode,String programDescription , int year, Vector<Mark> marks)
    		throws  InvalidUserDataException{    
        super(id,password,firstName,lastName,emailAddress,lastAccess,enroleDate,enable,type);
        setProgramCode(programCode);
        setProgramDescription(programDescription);
        setMarks(marks);
        setYear(year);
     
        
    }
	/**
	 * Parameterized constructor and set all values.
	 * @param id int
     * @param password string
     * @param firstName string
     * @param lastName string
     * @param emailAddress string
     * @param lastAccess string
     * @param enroleDate date
     * @param enable boolean
     * @param type character
     * @param programCode string
     * @param programDescription string
     * @param year int	 * @throws InvalidUserDataException
	 * 
	 */
	public Student(long id, String password, String firstName, String lastName,
			String emailAddress, Date lastAccess, Date enrolDate,
			boolean enabled, char type, String programCode, String programDescription, int year) 
					throws  InvalidUserDataException
	{
		this(id, password, firstName, lastName, emailAddress, lastAccess,
				enrolDate, enabled, type, programCode,programDescription,year, new Vector<Mark>());
	}
	
    /**
     * default constructor and assign or set all constant value.
     * @throws InvalidIdException
     * @throws InvalidNameException
     * @throws InvalidUserDataException
     * @throws NotFoundException
     *  
     */
    public Student() throws  InvalidUserDataException
    {
      this(DEFAULT_ID, DEFAULT_PASSWORD, DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_EMAIL_ADDRESS, new Date(), new Date(),DEFAULT_ENABLE_STATUS, DEFAULT_TYPE,DEFAULT_PROGRAM_CODE,DEFAULT_PROGRAM_DESCRIPTION,DEFAULT_YEAR);
    	//this(DEFAULT_ID,DEFAULT_PASSWORD,DEFAULT_FIRST_NAME,DEFAULT_LAST_NAME,DEFAULT_EMAIL_ADDRESS,new Date(),new Date(),DEFAULT_ENABLE_STATUS,DEFAULT_TYPE,DEFAULT_PROGRAM_CODE,DEFAULT_PROGRAM_DESCRIPTION,DEFAULT_YEAR);
    }
    
    /**
     * @see webd4201.PatelR.User#toString()
     */
    @Override
     public  String toString()
    { 
        String output = " Student Info FOR :";
        output +="\tName:"+getFirstName()+" "+getLastName();
        output +=" ( "+getId()+ ")";
        output +=" "+getProgramDescription();
        output += "\t Enrolled :"+getEnroleDate();
     
        return output;
       
    }

	/**
	 * @see webd4201.PatelR.CollegeInterface#getTypeForDisplay()
	 */
	@Override
	public String getTypeForDisplay() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * passwordAuthenticate to authenticate users password
	 * @param key
	 * @param password
	 * @return
	 * @throws NotFoundException
	 * @throws InvalidIdException
	 * @throws InvalidNameException
	 * @throws NotFoundException
	 * @throws InvalidUserDataException
	 * @throws DuplicateException
	 * @throws SQLException
	 */
	public static Student passwordAuthenticate(long key,String password)throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
	,InvalidUserDataException,DuplicateException, SQLException {
		return StudentDA.passwordAuthenticate(key,password);
	}
	
	/*public static StudentupdatePassword() 
    {
    	StudentDA.updatePassword(this);
    	}*/
	
	/**
	 * lenghtcheck to check the length of password and 
	 * Compare password
	 * @param pass1 string
	 * @param pass2 string
	 * @return ans as a boolean
	 * for password check
	 */
	public static boolean lenghtcheck(String pass1, String pass2)
	{
		boolean ans= true;
		if(pass1.equals(" ") && pass2.equals(" "))
		{
			return ans;
		}
		else
		{
		if(pass1.equals(pass2))
		{
			if(pass1.length()> MINIMUM_PASSWORD_LENGTH && pass1.length() < MAXIMUM_PASSWORD_LENGTH)
			{
				if(pass2.length()> MINIMUM_PASSWORD_LENGTH && pass2.length() < MAXIMUM_PASSWORD_LENGTH)
				{
			      return ans;
			    }
			}
		}
		else
		{
		 return ans = false ;
		}
		}
		return ans;
	}
    /**
     * updateTermTest() create a student
     * @return retuen the object of a student
     * @throws NotFoundException
     * @throws InvalidIdException
     * @throws InvalidNameException
     * @throws NotFoundException
     * @throws InvalidUserDataException
     * @throws DuplicateException
     * create a method and call database functionality like create ,delete, and update
     * data in database and this methods are called StudentDA class.
     */ 
	public void updateTermTest()throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
	,InvalidUserDataException,DuplicateException {
		// TODO Auto-generated method stub
		StudentDA.updateT(this);
	}     
}
