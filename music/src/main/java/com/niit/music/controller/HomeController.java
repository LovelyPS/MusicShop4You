package com.niit.music.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.music.dao.CategoryDAO;
import com.niit.music.dao.ProductDAO;
import com.niit.music.dao.SupplierDAO;
import com.niit.music.model.Category;
import com.niit.music.model.Product;
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
	@Autowired
	ProductDAO productDao;
	
	@RequestMapping("/user")
	public ModelAndView user(){
		ModelAndView mv=new ModelAndView("index");
		return mv;
		
	}
	@RequestMapping("/admin")
	public ModelAndView admin(){
		ModelAndView mv=new ModelAndView("index");
		return mv;
		
	}
	
	@RequestMapping("/")
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("index");	
		List<Category> c=categoryDao.getAllCategories();
		mv.addObject("catalist",c);
		return mv;
	}
	
	
	@RequestMapping("/productFilter")
	public ModelAndView productListFilter(HttpServletRequest request)
	{ 
		List<Product> list=productDao.getFilterProducts(Integer.valueOf(request.getParameter("id")));
		//List<Product> list=productDao.getProducts();
		ModelAndView mv = new ModelAndView("productFilter");	
		mv.addObject("list",list);
		return mv;
	}
	
	@RequestMapping("/product")
	public ModelAndView product() {
		

		ModelAndView mv = new ModelAndView("productDetails");
		List<Category> c=categoryDao.getAllCategories();
		mv.addObject("list",c);
		
		return mv;
	}
	
	@RequestMapping("/admin/categoryList")
	public ModelAndView categoryList() { 
		List<Category> c=categoryDao.getAllCategories();
		ModelAndView mv = new ModelAndView("categoryList");	
		mv.addObject("list",c);
		return mv;
	}	
	@RequestMapping("/admin/supplierList")
	public ModelAndView supplierList() { 
		List<Supplier> s=supplierDao.getAllSppliers();
		ModelAndView mv = new ModelAndView("supplierList");
		mv.addObject("list",s);
		return mv;
	}	
	@RequestMapping("/admin/productList")
	public ModelAndView productList()
	{ 
		List<Product> list=productDao.getProducts();
		ModelAndView mv = new ModelAndView("productList");	
		mv.addObject("list",list);
		return mv;
	}
	@RequestMapping("/admin/add")
	public ModelAndView adding() { 
		List<Category> list=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllSppliers();
		
	
		ModelAndView mv = new ModelAndView("adding");
		mv.addObject("slist", slist);
		mv.addObject("clist", list);
		
		return mv;
	}
	@ModelAttribute
	public void addAttributes(Model model)
	{
		model.addAttribute("catalist",categoryDao.getAllCategories());
		
	}
	
	
}
