package com.niit.music.daoimpl;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.music.dao.ProductDAO;
import com.niit.music.model.Category;
import com.niit.music.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}


	public void persist(Product p) 
	{	
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(p);
		s.getTransaction().commit();
		s.close();
	}  

	public void update(Product p) 
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.update(p);
		s.getTransaction().commit();
		s.close();
		
	}

	public Product findById(int id) {
		
		// TODO Auto-generated method stub
		return (Product)sessionFactory.openSession().get(Product.class,id);
	}

	public void delete(Product p) {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.delete(p);
		s.getTransaction().commit();
		s.close();sessionFactory.openSession().delete(p);
		
	}

	public List<Product> getProducts() {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		Query query=s.createQuery("from Product");
		List<Product> list=query.list();
		System.out.println(list);
		s.getTransaction().commit();
		return list;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	public List<Product> getFilterProducts(int cid)
	{
		Session s=sessionFactory.openSession();
		
		List<Product> results =s.createQuery("from Product where c_id="+cid).list();
		s.close();
		// TODO Auto-generated method stub
		return results;
	}
	
		
}
