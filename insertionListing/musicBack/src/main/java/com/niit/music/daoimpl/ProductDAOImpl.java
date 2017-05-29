package com.niit.music.daoimpl;


import java.util.ArrayList;
import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.music.dao.ProductDAO;
import com.niit.music.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO
{

	public void persist(Product p) 
	{	
		// TODO Auto-generated method stub
		
	}

	public void update(Product p) {
		// TODO Auto-generated method stub
		
	}

	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Product p) {
		// TODO Auto-generated method stub
		
	}

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
		
		/*@Autowired
	    private SessionFactory sessionFactory;
		
       public ProductDAOImpl()
       {
    	   
       }
       public ProductDAOImpl(SessionFactory sessionFactory)
       {
    	   this.sessionFactory=sessionFactory;
       }*/
       
	   /* private Session currentSession;
		
		private Transaction currentTransaction;
		public Session openCurrentSession() {
			System.out.println("in open current session");
			currentSession = sessionFactory.getCurrentSession();
			System.out.println("in After open current session");
			return currentSession;
		}

		public Session openCurrentSessionwithTransaction() {
			currentSession = sessionFactory.getCurrentSession();
			currentTransaction = currentSession.beginTransaction();
			return currentSession;
		}
		
		public void closeCurrentSession() {
			currentSession.close();
		}
		
		public void closeCurrentSessionwithTransaction() {
			currentTransaction.commit();
			currentSession.close();
		}

		public Session getCurrentSession() {
			return sessionFactory.getCurrentSession();
		}

		public void setCurrentSession(Session currentSession) {
			this.currentSession = currentSession;
		}

		public Transaction getCurrentTransaction() {
			return currentTransaction;
		}

		public void setCurrentTransaction(Transaction currentTransaction) {
			this.currentTransaction = currentTransaction;
		}
		
*//*	private static final List<Product> productlist=new ArrayList<Product>();
	 public ProductDAOImpl()
	  {
		 
		 
		  productlist.add(new Product(001,"BHM","Tambourine","des",23,34,"western","suup","image"));
		  productlist.add(new Product(002,"RAGINI","Casio  Electronic Keyboard","des",23,34,"western","suup","image"));
		  productlist.add(new Product(003,"RADEL","Exl  4 Strings Acoustic Bass Guitar","des",23,34,"western","suup","image"));
		  productlist.add(new Product(004,"SWARAGINI","Yamaha  Electric Bass Guitar","des",23,34,"western","suup","image"));
		  productlist.add(new Product(005,"BHM"," Bass Guitar Amplifier","des",23,34,"western","suup","image"));
		  productlist.add(new Product(006,"RADEL","Tambourine","des",23,34,"western","suup","image"));
		  productlist.add(new Product(007,"BHM","Nut Bolt Dholak","des",23,34,"western","suup","image"));
		  productlist.add(new Product(18,"BHM","Tabla","des",23,34,"western","suup","image"));
		  productlist.add(new Product(19,"SWARAGINI"," Bass Guitar Amplifier","des",23,34,"western","suup","image"));
		  productlist.add(new Product(10,"RADEL","Tambourine","des",23,34,"western","suup","image"));
		  productlist.add(new Product(11,"BHM","Special Rope Dholak","des",23,34,"western","suup","image"));
		  productlist.add(new Product(12,"SWARAGINI","Tambourine","des",23,34,"western","suup","image"));
	  }*/
	
	 
    
	/*@Transactional
	public List<Product> getProducts() 
	{
		System.out.println("Hai...In GetProducts");
		List<Product> p=new ArrayList<Product>();
		p.add(new Product());
		
		
		@SuppressWarnings("unchecked")
		List<Product> list=(List<Product>)sessionFactory.getCurrentSession().createCriteria(Product.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return p;
	}
	
	
	

	public void persist(Product p)
	{
		System.out.println("in Impl Persist");
		sessionFactory.getCurrentSession().save(p);
		// TODO Auto-generated method stub
		
	}

	public void update(Product p) {
		sessionFactory.getCurrentSession().saveOrUpdate(p);
		// TODO Auto-generated method stub
		
	}

	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Product p) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
*/
}
