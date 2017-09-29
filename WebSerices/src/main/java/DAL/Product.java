package DAL;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class Product
{
	@SuppressWarnings("unchecked")
	public static ArrayList<DAL.DEL.Product> getAllProducts() throws Exception
	{
		ArrayList<DAL.DEL.Product> products = new ArrayList<DAL.DEL.Product>();
		Session session = DAL.HibernateHelper.getCurrentSession();
		Transaction tran = null;
		try{
			tran = session.beginTransaction();
			products = (ArrayList<DAL.DEL.Product>) session.createQuery("from Product").list();
			tran.commit();			
		}catch( Exception e)
		{
			if (tran != null) {
	             tran.rollback();
	             throw e;
	           }
		} finally{
			session.close();
		}
		return products;
	}

	public static void addProduct(DAL.DEL.Product product) throws Exception {
		
		Session session = DAL.HibernateHelper.getCurrentSession();
		Transaction tran = null;
		try{
			tran = session.beginTransaction();
				session.save(product);
			tran.commit();
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

	public static void deleteProductByID(String productID) throws Exception {
		Session session = DAL.HibernateHelper.getCurrentSession();
		Transaction tran = null;
		try{
			tran = session.beginTransaction();
				session.createQuery(String.format("delete from Product where id = %s",productID)).executeUpdate();
			tran.commit();
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
}