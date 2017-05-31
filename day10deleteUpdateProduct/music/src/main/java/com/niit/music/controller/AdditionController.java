package com.niit.music.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.music.dao.CategoryDAO;
import com.niit.music.dao.ProductDAO;
import com.niit.music.dao.SupplierDAO;
import com.niit.music.model.Category;
import com.niit.music.model.Product;
import com.niit.music.model.Supplier;

@Controller
public class AdditionController 
{
	@Autowired
	CategoryDAO categoryDao;
	
	
	public void CategoryDAO(CategoryDAO categoryDao)
	{
		this.categoryDao=categoryDao;
	}
	
	@Autowired
	SupplierDAO supplierDao;
/*	
	
	public void SupplierDAO(SupplierDAO supplierDao)
	{
		this.supplierDao=supplierDao;
	}*/
	
	@Autowired
	ProductDAO productDao;
	
	@RequestMapping("/addCategory")
	public ModelAndView addCategory(HttpServletRequest request) 
	{ 
		int c_id=Integer.valueOf(request.getParameter("c_id"));
		String c_name=request.getParameter("c_name");
		System.out.println(c_id+"---"+c_name);
		categoryDao.persist(new Category(c_id, c_name));
		ModelAndView mv = new ModelAndView("adding");
		
		List<Category> list=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllSppliers();
		
	
		
		mv.addObject("slist", slist);
		mv.addObject("clist", list);
		return mv;
	}
	/*@RequestMapping("/addProduct")
	public ModelAndView addProduct() 
	{ 
		
		List<Category> list=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllSppliers();
		ModelAndView mv = new ModelAndView("addProduct");	
		mv.addObject("slist", slist);
		mv.addObject("clist", list);
		return mv;
	}*/
	@RequestMapping("/addProducts")
	public ModelAndView addProducts(@RequestParam("file") MultipartFile file ,HttpServletRequest request) 
	{ 
		System.out.println("in Products Controller");
		int id=Integer.valueOf(request.getParameter("p_id"));
		String pname=request.getParameter("p_name");
		String pdesc=request.getParameter("p_desc");
		int price=Integer.valueOf(request.getParameter("p_price"));
		int cid=Integer.valueOf(request.getParameter("c_id"));
		int sid=Integer.valueOf(request.getParameter("s_id"));
		Category c=categoryDao.findById(cid);
		Supplier s=supplierDao.findById(sid);
		Product p=new Product();
		p.setCategory(c);
		p.setP_description(pdesc);
		p.setP_name(pname);
		p.setP_price(price);
		p.setP_id(id);	
		String originalfile = file.getOriginalFilename();
		p.setP_image(originalfile);
		p.setSupplier(s);
		
		productDao.persist(p);
		String filepath = request.getSession().getServletContext().getRealPath("/");
		System.out.println(filepath+originalfile);
		try {
			byte imagebyte[] = file.getBytes();
			BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath+"/resources/images/"+originalfile));
			fos.write(imagebyte);
			fos.close();
			} catch (IOException e) {
			e.printStackTrace();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		/*String filepath = request.getSession().getServletContext().getRealPath("/");
		String originalfile = file.getOriginalFilename();
		System.out.println(filepath+originalfile);
		//String filename = filepath + "\\" + product.getProductId() + ".jpg";
		//System.out.println("File Path File "+filepath);
		try {
		byte imagebyte[] = file.getBytes();
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath+"/resources/images/"+originalfile));
		fos.write(imagebyte);
		fos.close();
		} catch (IOException e) {
		e.printStackTrace();
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		*/
		List<Category> list=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllSppliers();
		
	
		ModelAndView mv = new ModelAndView("adding");
		mv.addObject("slist", slist);
		mv.addObject("clist", list);
		return mv;
	}
	@RequestMapping("/addSupplier")
	public ModelAndView addSupplier(HttpServletRequest request) 
	{ 
		int c_id=Integer.valueOf(request.getParameter("c_id"));
		String c_name=request.getParameter("c_name");
		System.out.println(c_id+"---"+c_name);
		supplierDao.persist(new Supplier(c_id, c_name));
		List<Category> list=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllSppliers();
		
	
		ModelAndView mv = new ModelAndView("adding");
		mv.addObject("slist", slist);
		mv.addObject("clist", list);
		return mv;
	}
	@RequestMapping(value="/product_delete")
	public ModelAndView deleteProduct(HttpServletRequest request){
		
		Product p=productDao.findById(Integer.valueOf(request.getParameter("id")));
		System.out.print(p);
	productDao.delete(p);
	List<Product> list=productDao.getProducts();
	ModelAndView mv = new ModelAndView("productList");	
	mv.addObject("list",list);
	return mv;
	}
	@RequestMapping(value="/product_edit")
	public ModelAndView editProducts(HttpServletRequest request){	
	int id=Integer.parseInt(request.getParameter("id"));
	ModelAndView mv=new ModelAndView("productEdit");
	List<Category> list=categoryDao.getAllCategories();
	List<Supplier> slist=supplierDao.getAllSppliers();	
	mv.addObject("product",productDao.findById(id) );	
	mv.addObject("slist", slist);
	mv.addObject("clist", list);
	return mv;
	}
	@RequestMapping(value = "/product_update", method = RequestMethod.POST)
	public  ModelAndView updateProduct(@RequestParam("file") MultipartFile file ,HttpServletRequest request) 
	{ 
		System.out.println("in Products Controller");
		int id=Integer.valueOf(request.getParameter("p_id"));
		String pname=request.getParameter("p_name");
		String pdesc=request.getParameter("p_desc");
		int price=Integer.valueOf(request.getParameter("p_price"));
		int cid=Integer.valueOf(request.getParameter("c_id"));
		int sid=Integer.valueOf(request.getParameter("s_id"));
		Category c=categoryDao.findById(cid);
		Supplier s=supplierDao.findById(sid);
		Product p=new Product();
		p.setCategory(c);
		p.setP_description(pdesc);
		p.setP_name(pname);
		p.setP_price(price);
		p.setP_id(id);	
		String originalfile = file.getOriginalFilename();
		p.setP_image(originalfile);
		p.setSupplier(s);
		
		productDao.update(p);
		String filepath = request.getSession().getServletContext().getRealPath("/");
		System.out.println(filepath+originalfile);
		try {
			byte imagebyte[] = file.getBytes();
			BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath+"/resources/images/"+originalfile));
			fos.write(imagebyte);
			fos.close();
			} catch (IOException e) {
			e.printStackTrace();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		/*String filepath = request.getSession().getServletContext().getRealPath("/");
		String originalfile = file.getOriginalFilename();
		System.out.println(filepath+originalfile);
		//String filename = filepath + "\\" + product.getProductId() + ".jpg";
		//System.out.println("File Path File "+filepath);
		try {
		byte imagebyte[] = file.getBytes();
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath+"/resources/images/"+originalfile));
		fos.write(imagebyte);
		fos.close();
		} catch (IOException e) {
		e.printStackTrace();
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		*/
		List<Category> list=categoryDao.getAllCategories();
		List<Supplier> slist=supplierDao.getAllSppliers();
		
	
		ModelAndView mv = new ModelAndView("productList");
		mv.addObject("slist", slist);
		mv.addObject("clist", list);
		return mv;
	}

}
