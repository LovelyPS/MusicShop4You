package com.niit.music.controller;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.music.dao.MusicDAO;

//import com.niit.music.dao.MusicDAO;
import com.niit.music.daoimpl.MusicDAOImpl;
import com.niit.music.model.Product;

@Controller
public class HomeController
{
	//MusicDAOImpl mw=new MusicDAOImpl();
	
	
	 //@Autowired
	 //MusicDAO m;
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
		MusicDAO m=new MusicDAOImpl();
		List<Product> plist=m.getProducts();
		System.out.println(plist.get(0).getP_brand());
		System.out.println("hai...printing brand");
		
		
		mv.addObject("productlist", plist);
		return mv;
	}

}
