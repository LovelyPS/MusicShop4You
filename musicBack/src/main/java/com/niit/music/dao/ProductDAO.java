package com.niit.music.dao;

import java.util.List;

import com.niit.music.model.Product;

public interface ProductDAO 
{
    public void persist(Product p);
	
	public void update(Product p);
	
	public Product  findById(int id);
	
	public void delete(Product p);
	
	public List<Product> getProducts();
	public List<Product> getFilterProducts(int cid);
	
	public void deleteAll();
   
     
}
