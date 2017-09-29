package WSL;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class UserFacade 
{
	/**
	 * Creates a new user
	 * @param token
	 * @param user
	 * @return a BOLO.User representing the new user.
	 * @throws Exception if failed to create a new user.
	 */
	@WebMethod
	public BOLO.User createUser(String token, String user, String password) throws Exception
	{
		return BSL.UserAdmin.createUser(token, user, password);		
	}
	
	/**
	 * Cleans out all the persisted tokens for this user. 
	 * @param token
	 * @return
	 * @throws AxisFault
	 */
	@WebMethod
	public boolean logout(String token) throws Exception
	{	
		return BOL.Token.cleanOldUserTokens(token);		
	}
		
}
