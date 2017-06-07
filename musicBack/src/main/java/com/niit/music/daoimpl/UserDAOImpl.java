package com.niit.music.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.music.dao.UserDAO;
import com.niit.music.model.Cart;
import com.niit.music.model.Supplier;
import com.niit.music.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void persist(User u)
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();

	}
	public void update(User u) {
		// TODO Auto-generated method stub

	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(User u) {
		// TODO Auto-generated method stub

	}

	public List<User> getAllUsers() {
		Session s=sessionFactory.openSession();
		List<User> clist=s.createCriteria(User.class).list();
		s.clear();
		return clist;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
