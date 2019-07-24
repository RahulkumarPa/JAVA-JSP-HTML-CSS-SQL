package webd4201.PatelR;
/**
 * a class that give a not found exception
 * @author Rahulkumar Patel
 * @version 1.0 (2019/1/20)
 * @since 1.0
 */

@SuppressWarnings("serial")
public class NotFoundException extends Exception 
{
   //InvalidIdException method 
	/**
	 * NotFoundException for data not found.
	 */
	public NotFoundException() 
	{
		
		
	}
    //InvalidIdException with the string message
	/**
	 * NotFoundException give message to user if it not found,
	 * data in the data base.
	 * @param message
	 */
	public NotFoundException(String message) 
	{
		
		super(message);
		
	}

}

