package webd4201.PatelR;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;



/**
 A class that provide a databse connection.
 * @author Rahulkumar Patel
 * @version 1.0 (2019/1/20)
 * @since 1.0
 */
public class DatabaseConnect 
{
	/**
	 *  Database location
	 */
	static String url = "jdbc:postgresql://127.0.0.1:5432/webd4201_db";
	/**
	 * Connection object to open port to db
	 */
	static Connection aConnection;
	/**
	 * database user
	 */
	static String user = "webd4201_admin";
	/**
	 * database user password
	 */
	static String password = "webd4201_password";
	
	/**
	 * establishes the database connection
	 * @return Connection to the webd4201example_db database
	 */
	public static Connection initialize()
	{
		try
 		{ 	
			Class.forName("org.postgresql.Driver"); // loads the JDBC Driver for PostGreSQL
			aConnection = (Connection) DriverManager.getConnection(url, user, password); // creates the database connection instance
	    	
	 	}
		catch (ClassNotFoundException e)  //will occur if you did not import the PostGreSQL *.jar file with drivers
		{
			System.out.println(e);
		}
		catch (SQLException e)	//any other database exception (misnamed db, misnamed user, worng password, etc)
			{ System.out.println(e); }
		return aConnection;
	}

	/**
	 * closes the database connection
	 */
	public static void terminate()
	{
		try
 		{
    		aConnection.close();
		}
		catch (SQLException e)
			{ System.out.println(e);	}
	}
}
