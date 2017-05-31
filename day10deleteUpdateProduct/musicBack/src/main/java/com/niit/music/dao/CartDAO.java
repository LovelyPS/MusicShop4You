package com.niit.music.dao;

import java.util.List;

import com.niit.music.model.Cart;

public interface CartDAO 
{
	 public void persist(Cart p);
		
		public void update(Cart p);
		
		public Cart  findById(int id);
		
		public void delete(Cart p);
		
		public List<Cart> getAllCarts();
		
		public void deleteAll();
     
}
