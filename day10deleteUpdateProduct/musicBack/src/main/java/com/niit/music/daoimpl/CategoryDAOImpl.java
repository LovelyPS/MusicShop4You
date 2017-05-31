package com.niit.music.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.music.dao.CategoryDAO;
import com.niit.music.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO
{
    @Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void persist(Category c) 
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(c);
		s.getTransaction().commit();
		s.close();
		// TODO Auto-generated method stub
		
	}

	public void update(Category c) {
		// TODO Auto-generated method stub
		
	}

	public Category findById(int id) 
	{
		
		Category c=(Category)sessionFactory.openSession().get(Category.class, id);
		return c;
	}

	public void delete(Category c) {
		// TODO Auto-generated method stub
		
	}

	//@SuppressWarnings("unchecked")
	public List<Category> getAllCategories() {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		Query query=s.createQuery("from Category");
		List<Category> list=query.list();
		System.out.println(list);
		s.getTransaction().commit();
		return list;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
