package webd4201.PatelR;
/**
 *A class that gave a Duplication data Exception.
 * @author Rahulkumar Patel
 * @version 1.0 (2019/1/20)
 * @since 1.0
 */

@SuppressWarnings("serial")
public class DuplicateException extends Exception 
{
   //InvalidIdException method 
	/**
	 * DuplicateException for a wrong data
	 */
	public DuplicateException() 
	{
		
		
	}
    //InvalidIdException with the string message
	/**
	 * DuplicateException get the message
	 * @param message
	 * it's give a message to user regarding wrong data input.
	 */
	public DuplicateException(String message) 
	{
		
		super(message);
		
	}

}
