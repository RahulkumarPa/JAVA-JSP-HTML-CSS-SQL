package webd4201.PatelR;
/**
 *An interface that stores college specifications.
 * @author Rahulkumar Patel
 * @version 1.0 (2019/1/20)
 * @since 1.0
 */

public interface CollegeInterface 

{
	 /**
     *The name of the educational institute 
     **/
    public static final String COLLEGE_NAme = "Durham College";
    /**
     * The main phone number of the Educational Institute
     */
     public static final String PHONE_NUMBER = "(905)721-200";
     /**
      *The minimum number of valid user id at the educational institute
      */
      public static final long MINIMUM_ID_NUMBER = 100000000;
      
      /**
      *The maximum number of valid user id at the educational institute
      */
      public static final long MAXIMUM_ID_NUMBER = 999999999;
      
      /**
     * getTypeForDisplay
     * @return display data used for testing
     */
    public String getTypeForDisplay();

}
