package com.niit.music.dao;

import java.util.List;

import com.niit.music.model.Category;


public interface CategoryDAO
{
	 public void persist(Category c);
		
		public void update(Category c);
		
		public Category  findById(int id);
		
		public void delete(Category c);
		
		public List<Category> getAllCategories();
		
		public void deleteAll();
	

}
