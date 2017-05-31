package com.niit.music.dao;

import java.util.List;

import com.niit.music.model.Supplier;


public interface SupplierDAO 
{
public void persist(Supplier u);
	
	public void update(Supplier u);
	
	public Supplier  findById(int id);
	
	public void delete(Supplier u);
	
	public List<Supplier> getAllSppliers();
	
	public void deleteAll();

}
