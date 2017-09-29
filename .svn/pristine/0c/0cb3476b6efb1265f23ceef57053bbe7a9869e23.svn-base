/**
 * 
 */
package DAL;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import org.hibernate.Transaction;
/**
 * Manages the interaction with the database when it comes to tokens.
 * 
 */
public class Token {
	/**
	 * Physically store the token in the database.
	 * @param token
	 */
	public static void storeToken(BOLO.Token token, String username, String password ) throws Exception
	{
		// A user must exist for thiss token, check this, create otherwise
		DAL.DEL.User del_user = DAL.User.retrieve(username, password);
	
		if( del_user == null ){ // user not found, auto-create it...
			DAL.User.createUser(username, password);
		}
		
		Session session = HibernateHelper.getCurrentSession();		
		
		Transaction tran = null;
		try
		{	
		
		tran = session.beginTransaction();
		
		DAL.DEL.Token del_token = new DAL.DEL.Token(del_user);
		del_token.setIssued_time(token.getIssued_time());
		del_token.setMins_valid(token.getMins_valid());
		del_token.setToken(token.getToken());
				
		session.save(del_token);				
		session.getTransaction().commit();
		}catch( Exception e)
		{
			if (tran != null) {
	             tran.rollback();
	             throw e;
	           }
		} finally{
			session.close();
		}
		
	}
	
	/**
	 * Check to see if the token exists and if so, returns it.
	 * @param token
	 * @return the BOLO.Token
	 * @throws Exception token does not exist
	 */
	@SuppressWarnings("unchecked")
	public static BOLO.Token getToken(String token) throws Exception
	{
		Session session = HibernateHelper.getCurrentSession();
		
		Transaction tran =  null;
		try{
			tran = session.beginTransaction();
			String sql_query = String.format("from Token where token = '%s'", token);
			@SuppressWarnings("rawtypes")
			List<DAL.DEL.Token> results = session.createQuery(sql_query).list();
			session.getTransaction().commit();
			for( DAL.DEL.Token db_token : (List<DAL.DEL.Token>) results)
			{
				if( db_token.getToken().equals(token) )
				{
					BOLO.Token bol_token = new BOLO.Token();
					bol_token.setIssued_time(db_token.getIssued_time());
					bol_token.setMins_valid(db_token.getMins_valid());
					bol_token.setToken(db_token.getToken());
					return bol_token;
				}
			}
		} catch( Exception error )
		{
			if( tran != null ){
				tran.rollback();
				throw error;
			}
		} finally {
			session.close();
		}
			
			
			
			
			throw new Exception("Token provided doesn't exist.");
		
	}
	/**
	 * Clears out other tokens associated with the user of this token provided
	 * @param token 
	 */
	public static void cleanOldUserTokens(String token) throws Exception
	{
					
			Session session = HibernateHelper.getCurrentSession();
			Transaction tran = null;
			try{
				tran = session.beginTransaction();
			
			// Get user associated with this token
			DAL.DEL.Token mgt_tokn = (DAL.DEL.Token) session.byNaturalId(DAL.DEL.Token.class).using("token", token).load();
			DAL.DEL.User user = mgt_tokn.getUser();
			
			// get all tokens issued to this user
			List<DAL.DEL.Token> user_tokens = session.createQuery("from DAL.DEL.Token t where t.user = :user_id ").setString("user_id", user.getId().toString()).list();
			// for each invalid token, remove it
			int count = 0;
			for( DAL.DEL.Token t : user_tokens )
			{				
				session.delete(t);
				
				if( ++count % 20 == 0 )
				{
					session.flush();
					session.clear();
				}
			}
			session.getTransaction().commit();
			}catch( Exception error )
			{
				if( tran != null ){
					tran.rollback();
					throw error;					
				}
			}finally{				
				session.close();
			}
		
	}
	public static ArrayList<DAL.DEL.Token> GetAllTokens() throws Exception
	{
		ArrayList<DAL.DEL.Token> items = new ArrayList<DAL.DEL.Token>();
		
		Session session = DAL.HibernateHelper.getCurrentSession();
		Transaction tran = null;
		try{
			tran = session.beginTransaction();
			List<DAL.DEL.Token> results = session.createQuery("from Token").list();
			tran.commit();
			for( DAL.DEL.Token token : results )
			{
				items.add( token);
			}
			return items;
		}catch( Exception error ){
			if( tran != null )
				tran.rollback();
			throw error;
			
		}		
	}
	
}
