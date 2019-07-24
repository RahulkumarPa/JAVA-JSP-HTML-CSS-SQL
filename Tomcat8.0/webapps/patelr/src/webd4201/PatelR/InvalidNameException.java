package webd4201.PatelR;

/**
 *A class that gave a Invalid NameException.
 * @author Rahulkumar Patel
 * @version 1.0 (2019/1/20)
 * @since 1.0
 */
@SuppressWarnings("serial")
public class InvalidNameException extends Exception 
{
   //InvalidIdException method 
	/**
	 * InvalidNameException for a invalid Name
	 */
	public InvalidNameException() 
	{
		
		
	}
    //InvalidIdException with the string message
	/**
	 * InvalidNameException get the message
	 * @param message
	 * it's give a message to user regarding wrong data input.
	 */
	public InvalidNameException(String message) {
		
		super(message);
		
	}

}
