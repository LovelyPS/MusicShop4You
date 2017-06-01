package com.niit.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.niit.music.dao.CategoryDAO;
import com.niit.music.dao.SupplierDAO;

@RestController
public class ListRestController
{
	@Autowired
	private CategoryDAO categorySe;
	@Autowired
	SupplierDAO supplierDao;
	
	@RequestMapping(value="/categories", method=RequestMethod.GET)
	public @ResponseBody String getCategories()
	{
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(categorySe.getAllCategories());
    
        return json;
	}
	@RequestMapping(value="/suppliers", method=RequestMethod.GET)
	public @ResponseBody String getSuppliers()
	{
		System.out.println("hai...in Controller");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(supplierDao.getAllSppliers());
    
        return json;
	}
   
}
