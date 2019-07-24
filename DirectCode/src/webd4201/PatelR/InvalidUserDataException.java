package webd4201.PatelR;
/**
 *A class that gave a Invalid UserData Exception.
 * @author Rahulkumar Patel
 * @version 1.0 (2019/1/20)
 * @since 1.0
 */
@SuppressWarnings("serial")
public class InvalidUserDataException extends Exception 
{
	 //InvalidIdException method 
	public InvalidUserDataException() 
	{
		
	}
	//InvalidIdException with the string message
	public InvalidUserDataException(String message) 
	{
		super(message);
		
	}
}
