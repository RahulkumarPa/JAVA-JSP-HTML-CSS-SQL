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
	public InvalidIdException() 
	{
		
		
	}
    //InvalidIdException with the string message
	public InvalidIdException(String message) {
		
		super(message);
		
	}

}
