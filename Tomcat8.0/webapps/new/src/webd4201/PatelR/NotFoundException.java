package webd4201.PatelR;
/**
 * 
 * @author gopal
 *
 */

@SuppressWarnings("serial")
public class NotFoundException extends Exception 
{
   //InvalidIdException method 
	public NotFoundException() 
	{
		
		
	}
    //InvalidIdException with the string message
	public NotFoundException(String message) 
	{
		
		super(message);
		
	}

}

