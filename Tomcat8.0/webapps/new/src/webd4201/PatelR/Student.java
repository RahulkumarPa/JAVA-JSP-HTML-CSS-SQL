package webd4201.PatelR;

/**
A class that provide a Student inherit from the user class.
* @author Rahulkumar Patel
* @version 1.0 (2019/1/20)
* @since 1.0
*/
import java.util.Date;
import java.util.Vector; //for a vector
import java.sql.Connection;
import java.sql.SQLException;

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
     * @ return programCode
     */
    public String getProgramCode() {
        return programCode;
    }
    /**
     * @ programDescription
     */
    public String getProgramDescription() {
        return programDescription;
    }
    /**
     * @ year
     */
    public int getYear() {
        return year;
    }
    /**
     * @ marks from vector
     */
    
    public Vector<Mark> getMarks() {
		return marks;
	}
    
    /**
     * setProgramCode
     * @param programCode
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
     * year
     * @param programDescription
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * @param marks
     */
    public void setMarks(Vector<Mark> marks) {
		this.marks = marks;
	} 
    
    //5-c ended
    //part 2 6-a
    /**
     * @param c
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
     * @param key
     * @return
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
    public void delete() throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
	,InvalidUserDataException,DuplicateException
    	{
    	StudentDA.delete(this);
    	}
    public void update() throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
	,InvalidUserDataException,DuplicateException
    	{
    	StudentDA.update(this);
    	}
  
    /**
     * @param id
     * @param password
     * @param firstName
     * @param lastName
     * @param emailAddress
     * @param lastAccess
     * @param enroleDate
     * @param enable
     * @param type
     * @param programCode
     * @param programDescription
     * @param year
     * @param marks
     * @throws InvalidUserDataException
     * Parameterized constructor and use super() to assign parent class variables.
     */
    public Student(long id,String password ,String firstName, String lastName, String emailAddress,Date lastAccess, Date enroleDate,boolean enable,char type,String programCode,String programDescription , int year, Vector<Mark> marks)
    		throws  InvalidUserDataException{    
        super(id,password,firstName,lastName,emailAddress,lastAccess,enroleDate,enable,type);
        setProgramCode(programCode);
        setProgramDescription(programDescription);
        setMarks(marks);
        
    }
	/**
	 * @param id
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param emailAddress
	 * @param lastAccess
	 * @param enrolDate
	 * @param enabled
	 * @param type
	 * @param programCode
	 * @param programDescription
	 * @param year
	 * @throws InvalidUserDataException
	 * Parameterized constructor and set all values.
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
     * @throws InvalidIdException
     * @throws InvalidNameException
     * @throws InvalidUserDataException
     * @throws NotFoundException
     *  default constructor and assign or set all constant value.
     */
    public Student() throws  InvalidUserDataException
    {
      this(DEFAULT_ID, DEFAULT_PASSWORD, DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_EMAIL_ADDRESS, new Date(), new Date(),DEFAULT_ENABLE_STATUS, DEFAULT_TYPE,DEFAULT_PROGRAM_CODE,DEFAULT_PROGRAM_DESCRIPTION,DEFAULT_YEAR);
    	//this(DEFAULT_ID,DEFAULT_PASSWORD,DEFAULT_FIRST_NAME,DEFAULT_LAST_NAME,DEFAULT_EMAIL_ADDRESS,new Date(),new Date(),DEFAULT_ENABLE_STATUS,DEFAULT_TYPE,DEFAULT_PROGRAM_CODE,DEFAULT_PROGRAM_DESCRIPTION,DEFAULT_YEAR);
    }
    
    /* (non-Javadoc)
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

	/* (non-Javadoc)
	 * @see webd4201.PatelR.CollegeInterface#getTypeForDisplay()
	 */
	@Override
	public String getTypeForDisplay() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
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
	
	public static StudentupdatePassword() 
    	{
    	StudentDA.updatePassword(this);
    	}
	
	/**
	 * @param pass1
	 * @param pass2
	 * @return
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
}
