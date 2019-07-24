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
	public InvalidNameException() 
	{
		
		
	}
    //InvalidIdException with the string message
	public InvalidNameException(String message) {
		
		super(message);
		
	}

}
