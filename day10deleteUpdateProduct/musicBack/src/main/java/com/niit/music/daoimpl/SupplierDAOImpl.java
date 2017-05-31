package com.niit.music.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.music.dao.SupplierDAO;
import com.niit.music.model.Category;
import com.niit.music.model.Supplier;

@Repository
public class SupplierDAOImpl implements SupplierDAO 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void persist(Supplier u)
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();

	} 

	public void update(Supplier u) {
		// TODO Auto-generated method stub

	}

	public Supplier findById(int id) {
		Supplier s=(Supplier)sessionFactory.openSession().get(Supplier.class, id);
		return s;
	}

	public void delete(Supplier u) {
		// TODO Auto-generated method stub

	}

	public List<Supplier> getAllSppliers() 
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		Query query = s.createQuery("from Supplier");        
		/*Query query=s.createQuery("select CATEGORY_ID,C_NAME from CATEGORY");*/
		List<Supplier> list=query.list();
		System.out.println(list);
		s.getTransaction().commit();
		return list;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
