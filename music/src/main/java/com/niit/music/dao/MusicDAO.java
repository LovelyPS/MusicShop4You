package com.niit.music.dao;

import java.util.List;

import com.niit.music.model.Product;

public interface MusicDAO 
{
     public List<Product> getProducts();
     public void addProduct();
     public Product getProduct(int p_id);
     public void deleteProduct(int p_id);
     public void updateProduct(int p_id);
     
}
