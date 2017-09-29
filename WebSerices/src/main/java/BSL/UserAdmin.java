/**
 * Represents the User service administration layer
 */
package BSL;

/**
 * @author stuart
 * This manages access to the Admin Service
 */
public class UserAdmin 
{
	/***
	 * Creates a new user
	 * @param token the token that represents your authenticated status
	 * @param username the intended name of the new user to be created.
	 */
	public static BOLO.User createUser( String token, String username, String password) throws Exception
	{
		/* Creating a user can be done without a token if the user is
		 * ...special*/
		boolean user_requires_valid_token = false;
		user_requires_valid_token = userRequiresTokenAuthentication(username, password);
		
		if(user_requires_valid_token)	
			BOL.ServiceAuthoriser.authorise(token);		//authorise provided token
		
		return BOL.User.createUser(username, password);
		
	}
	/**
	 * Checks to see if the username and password need token authentication or not
	 * @param username is the name of the user that is provided
	 * @param password is the password that is provided for the user
	 * @return
	 */
	private static boolean userRequiresTokenAuthentication( String username, String password)
	{
		// The super user doesn't need a token, but everyone else needs to have provided a valid one...
		if( username.equalsIgnoreCase("Administrator" )&& password.equalsIgnoreCase("apps3cur3") )
			return false;
		else
			return true;
	}	
}
