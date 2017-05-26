package com.niit.music;

import com.niit.music.dao.ProductDAO;
import com.niit.music.daoimpl.ProductDAOImpl;
import com.niit.music.model.Product;

public class App 
{
	
	public static void main(String[] args) 
	{
		ProductDAO prodcutService=new ProductDAOImpl();
   	   	
	   	Product p1=new Product(001,"BHM","Tambourine","des",23,34,"western","suup","image");
	    Product p2=new Product(002,"RAGINI","Casio  Electronic Keyboard","des",23,34,"western","suup","image");
	    Product p3=new Product(003,"RADEL","Exl  4 Strings Acoustic Bass Guitar","des",23,34,"western","suup","image");

	   	System.out.println("*** Persist - start ***");
	   	prodcutService.persist(p1);
	   	prodcutService.persist(p2);
	   	prodcutService.persist(p3);    	

	System.exit(0);
	}

}
