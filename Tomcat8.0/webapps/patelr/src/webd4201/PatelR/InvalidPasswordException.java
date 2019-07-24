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
		/**
		 *InvalidPasswordException for a Invalid password 
		 */
		public InvalidPasswordException() 
		{
			
			
		}
	    //InvalidIdException with the string message
		/**
		 * InvalidPasswordException get the message
		 * @param message
		 * it's give a message to user regarding wrong data input.
		 */
		public InvalidPasswordException(String message) {
			
			super(message);
			
		}
}