package com.niit.music.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.music.dao.CartDAO;
import com.niit.music.dao.CategoryDAO;
import com.niit.music.dao.ProductDAO;
import com.niit.music.model.Cart;
import com.niit.music.model.Product;

@Controller
public class cartController 
{
	@Autowired
	ProductDAO pdao;
	
	@Autowired
	CartDAO cdao;
	
	@RequestMapping("/viewCart")
	public ModelAndView viewCart(){
		
		ModelAndView mv=new ModelAndView("viewCart");
		List<Cart> cartList=cdao.getAllCarts();
		
		mv.addObject("cartlist", cartList);
		return mv;
	}

	@RequestMapping("/cart_delete")
	public ModelAndView editCart(HttpServletRequest request)
	{
		int cid=Integer.valueOf(request.getParameter("id"));
		Cart c=cdao.findById(cid);
		cdao.delete(c);
		
		ModelAndView mv=new ModelAndView("viewCart");
		List<Cart> cartList=cdao.getAllCarts();
		
		mv.addObject("cartlist", cartList);
		return mv;
	}
	@RequestMapping("/addCart")
	public ModelAndView addCart(HttpServletRequest request){
		int id=Integer.valueOf(request.getParameter("id"));
		int q=Integer.valueOf(request.getParameter("q"));
		
		Product p=pdao.findById(id);
		int price=p.getP_price();
		Cart c=new Cart();
	    c.setC_price(price);
		c.setC_quantity(q);
		c.setC_status(0);
		c.setProduct(p);
		
		
		
		cdao.persist(c);
		
		System.out.println(c);
		
		ModelAndView mv=new ModelAndView("viewCart");
		List<Cart> cartList=cdao.getAllCarts();
		
		mv.addObject("cartlist", cartList);
		return mv;
		
	}
	
	@RequestMapping("/customerDetails")
	public ModelAndView customer(HttpServletRequest request)
	{
		int tot=Integer.valueOf(request.getParameter("tot"));
		
		ModelAndView mv=new ModelAndView("registration");
		mv.addObject("tot", tot);
		return mv;
	}
	@RequestMapping("/invoice")
	public ModelAndView invoice(HttpServletRequest request)
	{
		String name=request.getParameter("name");
		String add=request.getParameter("add");
		String phone=request.getParameter("contact_no");
		String email=request.getParameter("email");
		String tot=request.getParameter("tot");
		ModelAndView mv=new ModelAndView("invoice");
		mv.addObject("name", name);
		mv.addObject("add", add);
		mv.addObject("phone", phone);
		mv.addObject("email", email);
		mv.addObject("tot", tot);
		
	
		return mv;
	}
	

}
