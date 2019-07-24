package webd4201.PatelR;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Date;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;


/**
* Parent class of student and student class
* @author Rahulkumar Patel
* @version 1.0 (2019/1/20)
* @since 1.0
*/
/**
 * @author gopal
 *
 */
/**
 * @author gopal
 *
 */
public class  User implements  CollegeInterface
{
	 public static final long DEFAULT_ID = 100123456L;
	    
	    /**
	     *DEFAULT_PASSWORD set final string if user enter wrong detail its 
	     * Automatically set this value
	     */
	  
	    public static final String DEFAULT_PASSWORD = "password";

	    /**
	     *DEFAULT_FIRST_NAME set final string if user enter wrong detail its 
	     * Automatically set this value
	     */
	    public static final String DEFAULT_FIRST_NAME = "John";

	    /**
	     *DEFAULT_LAST_NAME set final string if user enter wrong detail its 
	     * Automatically set this value
	     */
	    public static final String DEFAULT_LAST_NAME = "Doe";

	    /**
	     *DEFAULT_EMAIL_ADDRESS set final string if user enter wrong detail its 
	     * Automatically set this value
	     */
	    public static final String DEFAULT_EMAIL_ADDRESS = "John.Doe@dcmail.ca";

	    /**
	     *DEFAULT_ENABLE_STATUS set final boolean if user enter wrong detail its 
	     * Automatically set this value
	     */
	    public static final  boolean DEFAULT_ENABLE_STATUS = true;

	    /**
	     *DEFAULT_TYPE set final character if user enter wrong detail its 
	     * Automatically set this value
	     */
	    public static final char DEFAULT_TYPE = 's';

	    /**
	     *ID_NUMBER_LENGTH set final byte if user enter wrong detail its 
	     * Automatically set this value
	     */
	    public static final byte ID_NUMBER_LENGTH = 9;
	    
	    public static final byte MINIMUM_PASSWORD_LENGTH = 8;
	    public static final byte MAXIMUM_PASSWORD_LENGTH = 20;
	    

	    /**
	     *set date format
	     */
	    public static final DateFormat DF = DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.CANADA);
	    
	    /**
	     *id as a long
	     */
	        private long id;
	        
	        /**
		     *password as a string
		     */
	        private String password;
	        
	        /**
		     *firstName as a string
		     */
	        private String firstName;
	        
	        /**
		     *lastName as a string
		     */
	        private String lastName;
	        
	        /**
		     *emailAddress as a string
		     */
	        private String emailAddress;
	        
	        /**
		     *lastAccess as a date
		     */
	        private Date lastAccess;
	        
	        /**
		     *enroleDate as a date
		     */
	        private Date enroleDate; 
	        
	        /**
		     *enable as a boolean
		     */
	        private boolean enable;
	        
	        /**
		     *type as a character
		     */
	        private char type;
	
	        
	    /**
	     *
	     * @param id
	     * @param firstName
	     * @param lastName
	     * @param emailAddress
	     * @param lastAccess
	     * @param enroleDate
	     * @param enable
	     * @param type
	     * Parameterized constructor and set id and password
	     */
	    public User(long id,String password ,String firstName, String lastName, String emailAddress, Date lastAccess, Date enroleDate,boolean enable, char type)
	    	throws InvalidUserDataException
	    {
	    	try{
	    		setId(id);
		    	setPassword(password);
		    	setFirstName(firstName);
		    	setLastName(lastName);
		    	setEmailAddress(emailAddress);
		        setLastAccess(lastAccess);
		        setEnroleDate(enroleDate);
		        setEnable(enable);
		        setType(type);
	     	
	    	}catch(Exception e)
	    	{
	    		throw new InvalidUserDataException(e.getMessage());
	    	}
	    	
	    }
	    /**
	     * default constructor and set all default value of user class.
	     */
	  public User()throws InvalidUserDataException
	    {
	        this(DEFAULT_ID,DEFAULT_PASSWORD,DEFAULT_FIRST_NAME,DEFAULT_LAST_NAME,DEFAULT_EMAIL_ADDRESS,new Date(),new Date(),DEFAULT_ENABLE_STATUS,DEFAULT_TYPE);
	    }
	    /**
	     * setId and take as a long
	     * @param id
	     */
	    public void setId(long id)throws InvalidIdException 
	    {
	    	if(verifyId(id))
	    		this.id = id;
	    	else
	    		throw new InvalidIdException(id + " is not a valid id, must be between " + MINIMUM_ID_NUMBER + " and " + MAXIMUM_ID_NUMBER);
	    }
        /**
         * 
         * @param password
         * and check it's length and if it's in a validation then set otherwise gave error.
         */
	    public void setPassword(String password)
	    {
	    	/*if(password.length() > 8 && password.length()<15)
	    	{*/
	        this.password = password;
	    	/*}
	    	else
	    	{
	    		System.out.println("Invalid Password, Please enter valid Pelase enter valid password");
	    	}*/
	    }
	    /**
	     *
	     * @param firstName
	     * and validate firstname.
	     */
	    public void setFirstName(String firstName) throws InvalidNameException 
	    {  
		    if(!firstName.equals(""))
		    {
		    	 try{
		    		 Double.parseDouble(firstName);
		    		 throw new InvalidNameException(firstName + " is not a valid firSt name, cannot be a number.");
		    	 }catch(NumberFormatException nfe)
		    	 {
		    		 this.firstName = firstName;
		    	 }
		    }
		    else
		    {
		    	throw new InvalidNameException("First name cannot be empty, please enter your first name.");
		    }
	    }

	    /**
	     *
	     * @param lastName
	     * and validate lastname.
	     */
	    public void setLastName(String lastName) throws InvalidNameException 
	    {
	    	if(!lastName.equals(""))
		    {
		    	 try{
		    		 Double.parseDouble(lastName);
		    		 throw new InvalidNameException(lastName + " is not a valid firSt name, cannot be a number.");
		    	 }catch(NumberFormatException nfe)
		    	 {
		    		 this.lastName = lastName;
		    	 }
		    }
		    else
		    {
		    	throw new InvalidNameException("First name cannot be empty, please enter your first name.");
		    }
	    }

	    /**
	     * setEmailAddress 
	     * @param emailAddress
	     */
	    public void setEmailAddress(String emailAddress) {
	        this.emailAddress = emailAddress;
	    }

	    /**
	     * setLastAccess
	     * @param lastAccess
	     */
	    public void setLastAccess(Date lastAccess) {
	        this.lastAccess = lastAccess;
	    }

	    /**
	     * setEnroleDate
	     * @param enroleDate
	     */
	    public void setEnroleDate(Date enroleDate) {
	        this.enroleDate = enroleDate;
	    }

	    /**
	     * setEnable
	     * @param enable
	     */
	    public void setEnable(boolean enable) {
	        this.enable = enable;
	    }

	    /**
	     * setType
	     * @param type
	     */
	    public void setType(char type) {
	        this.type = type;
	    }

	    /**
	     * getID_NUMBER_LENGTH
	     * @return
	     */
	    public static byte getID_NUMBER_LENGTH() {
	        return ID_NUMBER_LENGTH;
	    }

	    /**
	     * getDF
	     * @return DF
	     */
	    public static DateFormat getDF() {
	        return DF;
	    }

	    /**
	     * getId
	     * @return id
	     */
	    public long getId() {
	        return id;
	    }
	    
	    /**
	     * getPassword
	     * @return password
	     */
	    public String getPassword(){
	    	return password;
	    	
	    }

	    /**
	     * getFirstName
	     * @return firstName
	     */
	    public String getFirstName() {
	        return firstName;
	    }

	    /**
	     * getLastName
	     * @return lastName
	     */
	    public String getLastName() {
	        return lastName;
	    }

	    /**
	     * getEmailAddress
	     * @return emailAddress
	     */
	    public String getEmailAddress() {
	        return emailAddress;
	    }

	    /**
	     * getLastAccess
	     * @return lastAccess
	     */
	    public Date getLastAccess() {
	        return lastAccess;
	    }

	    /**
	     * getEnroleDate
	     * @return enroleDate
	     */
	    public Date getEnroleDate() {
	        return enroleDate;
	    }

	    /**
	     * isEnable
	     * @return enable
	     */
	    public boolean isEnable() {
	        return enable;
	    }

	    /**
	     * getType
	     * @return type
	     */
	    public char getType() {
	        return type;
	    }
	    
	    
	    /**
	     * establish the connection
	     * 	     
	     */
	    public static void initialize(Connection c)
	    {
	    	UserDA.initialize(c);
	    }
	    
	    /**
	     * terminate connection.
	     */
	    public static void terminate()
	    {
	    	StudentDA.terminate();
	    }
        
	    public static User retrieve(long key)throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
		,InvalidUserDataException,DuplicateException 
	   {
	    	return UserDA.retrieve(key);
	    }
	   
	    
//	    public void create() throws NotFoundException, InvalidIdException,  InvalidNameException,NotFoundException
//		,InvalidUserDataException,DuplicateException
//	    	{
//	    	UserDA.create(this);
//	    	}
//	    
	    /**
	     * User Info for: 100123456
		  Name: John Doe
		  Created on: 15-Jan-2016
		  Last access: 15-Jan-2016
	      
	      **/


	   /* (non-Javadoc)
	 /**
     * toString method to  get display message
     * with uers details
     * @param 
     * @return output in string
     * 
    **/
	public  String toString()
	    { 
	        String output = " User Info FOR :"+getId();
	        output +="\tName:"+getFirstName()+" "+getLastName();
	        output +="\tCreated on:"+getEnroleDate();
	        output +="\tlast access:"+getLastAccess() ;
	        return output;

	    }
	   
	    /**
	     *
	     */
	    public void displayToConsole()
	   {
	       System.out.println(toString());
	   }
	    
	     /**created a method verifyID() that return boolean value
	      * defin a minimum and maximum ID value
	      */
	    public static boolean verifyId(long id)
	    {
	        boolean ans= true;
	        long minimum_iid = 0000000000;
	        long maximum_id = 999999999;
	        
	        if(id >minimum_iid && id< maximum_id  )
	        {
	            return ans ;
	        }
	        else
	         {
	           return ans = false ;
	         }
	    }
	   
	    
	    /**
	     * @param pd
	     * @return
	     */
	    public static boolean verifyPassword(String pd)
	    {
	        boolean ans= true;
	        if(pd.length() >MINIMUM_PASSWORD_LENGTH && pd.length()< MAXIMUM_PASSWORD_LENGTH  )
	        {
	            return ans ;
	        }
	        else
	         {
	           return ans = false ;
	         }
	    }
	   
	    /**
	     *
	     * @return
	     */
	    public String getTypeforDisplay()
	   {
	       return "";
	   }
	    
	    public static String decToHex(byte[] bytes){
	    	String hex = "";StringBuilder sb = new StringBuilder();
	    	for(int i = 0; i < bytes.length ;i++){
	    	//System.out.println(bytes[i] + " as hex is " + Integer.toHexString(bytes[i]));
	    	//System.out.println(bytes[i] + " as 2-digit hex is " + String.format("%02x", bytes[i]));
	    		sb.append(String.format("%02x", bytes[i]));}hex = sb.toString();
	    		return hex;
	    }
	    public static String hash(String thingToBeHashed) throws NoSuchAlgorithmException
	    {
	    	String hash;
	    	MessageDigest md = MessageDigest.getInstance("SHA1"); 
	    	md.update(thingToBeHashed.getBytes()); 
	    	byte[] bytesOfHashedString = md.digest();
	    	hash = decToHex(bytesOfHashedString);
	    	return hash;
	    }
		@Override
		public String getTypeForDisplay() {
			// TODO Auto-generated method stub
			return null;
		}
		public static boolean isValidEmailAddress(String email)
	    {
	    	boolean result = true;
	    	try 
	    	{
	    		InternetAddress emailAddr = new InternetAddress(email);
	    		emailAddr.validate();
	    		} 
	    	catch (AddressException ex) 
	    	{
	    		result = false;
	    	}
	    	return result;
	    	}
}
