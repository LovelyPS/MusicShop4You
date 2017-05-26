package com.niit.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.niit.music.dao.ProductDAO;

@Controller
public class HomeController {
	
	@Autowired
	ProductDAO productDao;
	/*
	
	public void ProductDAO(ProductDAO productDAO)
	{
		this.productDao=productDAO;
	}*/
	
	
	
	@RequestMapping("/")
	public ModelAndView index() { 
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	@RequestMapping("/product")
	public ModelAndView product() {

		ModelAndView mv = new ModelAndView("productDetails");
		
		return mv;
	}
	
	@RequestMapping("/category")
	public ModelAndView category() { 
		ModelAndView mv = new ModelAndView("productTable");
		
		return mv;
	}
}
