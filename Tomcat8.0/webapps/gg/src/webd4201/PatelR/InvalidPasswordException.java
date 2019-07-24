package webd4201.PatelR;
/**
 *A class that gave a Invalid PasswordException.
 * @author Rahulkumar Patel
 * @version 1.0 (2019/1/20)
 * @since 1.0
 */
@SuppressWarnings("serial")
public class InvalidPasswordException extends Exception 
{
	   //InvalidIdException method 
		public InvalidPasswordException() 
		{
			
			
		}
	    //InvalidIdException with the string message
		public InvalidPasswordException(String message) {
			
			super(message);
			
		}
}