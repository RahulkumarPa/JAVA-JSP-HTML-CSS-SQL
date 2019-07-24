package webd4201.PatelR;
/**
 *A class that gave a InvalidId Exception .
 * @author Rahulkumar Patel
 * @version 1.0 (2019/1/20)
 * @since 1.0
 */
// Declare serial version
@SuppressWarnings("serial")
public class InvalidIdException extends Exception 
{
   //InvalidIdException method 
	/**
	 * InvalidIdException for a invalid data
	 */
	public InvalidIdException() 
	{
		
		
	}
    //InvalidIdException with the string message
	/**
	 * InvalidIdException get the message
	 * @param message
	 * it's give a message to user regarding wrong data input.
	 */
	public InvalidIdException(String message) {
		
		super(message);
		
	}

}
