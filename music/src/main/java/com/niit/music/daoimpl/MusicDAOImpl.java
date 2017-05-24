package com.niit.music.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.niit.music.dao.MusicDAO;
import com.niit.music.model.Product;

public class MusicDAOImpl implements MusicDAO
{
	private static final List<Product> productlist=new ArrayList<Product>();
	 public MusicDAOImpl()
	  {
		  productlist.add(new Product(001,"BHM","Tambourine","des",23,34,"western","suup","image"));
		  productlist.add(new Product(002,"RAGINI","Casio  Electronic Keyboard","des",23,34,"western","suup","image"));
		  productlist.add(new Product(003,"RADEL","Exl  4 Strings Acoustic Bass Guitar","des",23,34,"western","suup","image"));
		  productlist.add(new Product(004,"SWARAGINI","Yamaha  Electric Bass Guitar","des",23,34,"western","suup","image"));
		  productlist.add(new Product(005,"BHM"," Bass Guitar Amplifier","des",23,34,"western","suup","image"));
		  productlist.add(new Product(006,"RADEL","Tambourine","des",23,34,"western","suup","image"));
		  productlist.add(new Product(007,"BHM","Nut Bolt Dholak","des",23,34,"western","suup","image"));
		  productlist.add(new Product(18,"BHM","Tabla","des",23,34,"western","suup","image"));
		  productlist.add(new Product(19,"SWARAGINI"," Bass Guitar Amplifier","des",23,34,"western","suup","image"));
		  productlist.add(new Product(10,"RADEL","Tambourine","des",23,34,"western","suup","image"));
		  productlist.add(new Product(11,"BHM","Special Rope Dholak","des",23,34,"western","suup","image"));
		  productlist.add(new Product(12,"SWARAGINI","Tambourine","des",23,34,"western","suup","image"));
	  }
	public List<Product> getProducts() 
	{
		
		return productlist;
	}
	public void addProduct()
	{
		//productlist.add(new Product(p_id, p_brand, p_name, p_description, p_price, p_quantity, p_category, p_supplier, p_image));
		// TODO Auto-generated method stub
		
	}
	public Product getProduct(int p_id) {
		// TODO Auto-generated method stub
		Product p=productlist.get(p_id);
		return p;
	}
	public void deleteProduct(int p_id)
	{
		productlist.remove(p_id);
		// TODO Auto-generated method stub
		
	}
	public void updateProduct(int p_id) {
		// TODO Auto-generated method stub
		
	}

}
