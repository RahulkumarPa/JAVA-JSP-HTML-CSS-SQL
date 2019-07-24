package webd4201.PatelR;

import com.sun.corba.se.impl.orbutil.closure.Constant;

import java.text.DateFormat;
import java.util.Locale;
import java.util.Date;

/**
 *A faculty class that is inherit from the user class.
 *faculty's private variable.
 * @author Rahulkumar Patel
 * @version 1.0 (2019/1/20)
 * @since 1.0
 */



public class Faculty extends User
{
	
	 /**
    * Default school code for the faculty it consider when user enter wrong.
    */
    public static final String DEFAULT_SCHOOL_CODE = "SET";
    /**
     * Default school Description for the faculty it consider when user enter wrong.
     */
    public static final String DEFAULT_SCHOOL_DESCRIPTION = "School of Engineering & Technology”";
    /**
     * Default office for the faculty it consider when user enter wrong.
     */
    public static final String DEFAULT_OFFICE = "H-140";
    /**
     * Default phone extension for the faculty it consider when user enter wrong.
     */
    public static final int DEFAULT_PHONE_EXTENSION  = 1234;  //3-A ended
    
   
    /**
     * private school code for faculty to use in this model only
     * which user entered.
     */
    private String schoolCode =" ";
    /**
     * private school Description for faculty to use in this model only
     * which user entered.
     */
    private String schoolDescription  =" ";
    /**
     * private offic for faculty to use in this model only
     * which user entered.
     */
    private String office  =" ";
    
    
    /**
    * method to setSchoolCode
    * @param schoolCode
    */
    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }
    /**
     * method to schoolDescription
     * @param schoolDescription
     */
    public void setSchoolDescription(String schoolDescription) {
        this.schoolDescription = schoolDescription;
    }
    /**
     * method to office
     * @param office
     */
    public void setOffice(String office) {
        this.office = office;
    }
    /**
     * method to extension
     * @param extension
     */
    public void setExtension(int extension) {
        this.extension = extension;
    }
    /**
     * protected extension we us in this class 
     */
    protected int extension = 000;
 
    /**
     * getSchoolCode
     * @param 
     * @return SchoolCode in string
     */
    public String getSchoolCode() {
        return schoolCode;
    }
    /**
     * getSchoolDescription
     * @param 
     * @return schoolDescription in string
     */
    public String getSchoolDescription() {
        return schoolDescription;
    }

    /**
     * @office
     */
    public String getOffice() {
        return office;
    }
    /**
     * @extension
     */

    public int getExtension() {
        return extension;
    }
     
    // 3-End
    /**
    *
    * @param id
    * @param password
    * @param firstName
    * @param lastName
    * @param emailAddress
    * @param lastAccess
    * @param enroleDate
    * @param enable
    * @param type
    */
    public Faculty(long id, String password, String firstName, String lastName, String emailAddress, Date lastAccess, Date enroleDate,boolean enable, char type )
    throws   InvalidUserDataException {
    	super(id,password,firstName,lastName,emailAddress,lastAccess,enroleDate,enable,type);
        setExtension(extension);
        setOffice(office);
        setSchoolDescription(schoolDescription);
        setSchoolCode(schoolCode);
    }
    public Faculty() throws InvalidUserDataException
    {
        this(DEFAULT_ID, DEFAULT_PASSWORD, DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_EMAIL_ADDRESS, new Date(), new Date(),DEFAULT_ENABLE_STATUS, DEFAULT_TYPE);

       
//        setOffice(DEFAULT_OFFICE);
//        setExtension(DEFAULT_PHONE_EXTENSION);
//        setSchoolDescription(DEFAULT_SCHOOL_DESCRIPTION);
//        setSchoolCode(DEFAULT_SCHOOL_CODE);
        
    }
    
    /**
    * getTypeForDisplay
    * @param 
    * @return Faculty in string
    * 
    * */
    @Override
    public String getTypeForDisplay() 
    {
        return  "Faculty";
    }
    /**
     * toString method to  get display message
     * with faculty details
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
        output += ""+getSchoolDescription()+ " "+getOffice()+ "" + getExtension();
        
        output = output.replaceAll("User", "Faculty");
        return output;
        
    }
    
}
