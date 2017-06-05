package com.niit.music.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.music.dao.CartDAO;
import com.niit.music.model.Cart;

@Repository
public class CartDAOImpl implements CartDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void persist(Cart p) 
	{
		System.out.println("In Persisit "+p);
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(p);
		s.getTransaction().commit();
		s.close();

	}

	public void update(Cart p) {
		// TODO Auto-generated method stub

	}

	public Cart findById(int id) 
	{
		
		
		return (Cart)sessionFactory.openSession().get(Cart.class,id);
	}

	public void delete(Cart p)
	{
		
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.delete(p);
		s.getTransaction().commit();
		s.close();

	}

	public List<Cart> getAllCarts()
	{
		Session s=sessionFactory.openSession();
		List<Cart> clist=s.createCriteria(Cart.class).list();
		s.clear();
		return clist;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
