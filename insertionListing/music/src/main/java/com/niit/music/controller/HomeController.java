package com.niit.music.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.music.dao.CategoryDAO;
import com.niit.music.dao.ProductDAO;
import com.niit.music.dao.SupplierDAO;
import com.niit.music.model.Category;
import com.niit.music.model.Supplier;

@Controller
public class HomeController {
	
	@Autowired
	CategoryDAO categoryDao;
	
	
	public void CategoryDAO(CategoryDAO categoryDao)
	{
		this.categoryDao=categoryDao;
	}
	@Autowired
	SupplierDAO supplierDao;
	
	
	public void SupplierDAO(SupplierDAO supplierDao)
	{
		this.supplierDao=supplierDao;
	}
	
	
	
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
	@RequestMapping("/categoryList")
	public ModelAndView categoryList() { 
		ModelAndView mv = new ModelAndView("categoryList");		
		return mv;
	}	
	@RequestMapping("/supplierList")
	public ModelAndView supplierList() { 
		ModelAndView mv = new ModelAndView("supplierList");		
		return mv;
	}	
	@RequestMapping("/add")
	public ModelAndView adding() { 
		ModelAndView mv = new ModelAndView("adding");
		
		return mv;
	}
	@RequestMapping("/addCategory")
	public ModelAndView addCategory(HttpServletRequest request) 
	{ 
		int c_id=Integer.valueOf(request.getParameter("c_id"));
		String c_name=request.getParameter("c_name");
		System.out.println(c_id+"---"+c_name);
		categoryDao.persist(new Category(c_id, c_name));
		ModelAndView mv = new ModelAndView("adding");
		
		
		return mv;
	}
	@RequestMapping("/addSupplier")
	public ModelAndView addSupplier(HttpServletRequest request) 
	{ 
		int c_id=Integer.valueOf(request.getParameter("c_id"));
		String c_name=request.getParameter("c_name");
		System.out.println(c_id+"---"+c_name);
		supplierDao.persist(new Supplier(c_id, c_name));
		ModelAndView mv = new ModelAndView("adding");
		
		
		return mv;
	}
	
}
