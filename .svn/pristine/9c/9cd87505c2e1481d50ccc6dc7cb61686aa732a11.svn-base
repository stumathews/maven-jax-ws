/**
 * This class represents the Admin service. 
 * Each method represents operation that the service exposes.
 * 
 * This service is useed for ad hoc testing and administering of the underlying services application
 */

package WSL;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
public class AdminFacade 
{
	/**
	 * Authenticates the client.
	 * @param username
	 * @param password
	 * @return a token hash that can be used on subsequent web service calls.
	 * @throws Exception authntication fails.
	 */
	@WebMethod
	public String authenticate( String username, String password) throws Exception
	{		
		return BSL.LoginAdmin.authenticate(username, password);
		
	}
	
}
