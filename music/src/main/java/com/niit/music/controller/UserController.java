package com.niit.music.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.music.dao.CategoryDAO;
import com.niit.music.dao.UserDAO;
import com.niit.music.model.User;

@Controller
public class UserController 
{
	@Autowired
	UserDAO userDao;
	
	@Autowired
	CategoryDAO cDao;
	
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public ModelAndView reg(HttpServletRequest request)
	{
        String mail=request.getParameter("mail");
        ModelAndView mv = new ModelAndView("signin");  
        List<User> ulist=userDao.getAllUsers();
        int flag=1;
        for(int i=0;i<ulist.size();i++)
        {
        	if(mail.equals(ulist.get(i).getU_mail()))
        	{
        		      		
        		mv.addObject("msg","Registration Failed.....Email Id Already Exists.........." );       		

        		flag=0;
        	
        	}
        }
        if(flag==1)
        {
        String name=request.getParameter("name");
		String add=request.getParameter("address");
		int age=Integer.parseInt(request.getParameter("age"));
		String phone=request.getParameter("phone");
		String pass=request.getParameter("passwd");
		System.out.println("haoiii"+name+"mail"+"add"+add+"age"+age+"phone"+phone+"pass"+pass);
		User u=new User();
		u.setU_mail(mail);
		u.setU_name(name);
		u.setAddress(add);
		u.setAge(age);
		u.setPhone(phone);
		u.setRole("USER");
		u.setU_password(pass);
		userDao.persist(u);	
		mv.addObject("msg","Successfully Registered..You Can Login Now.." );		
        }
        return mv;
	}
	@RequestMapping("/signin")
	public ModelAndView signin(HttpServletRequest request)
	{
		
		ModelAndView mv = new ModelAndView("signin");
		
		return mv;
	}
	@RequestMapping("/signUp")
	public ModelAndView signUp()
	{
		
		ModelAndView mv = new ModelAndView("signUp");
		
		
		return mv;
	}
	
	@RequestMapping("/userlogged")
	public String userLogged() { 
		return "redirect:/";	
	}
	
	@ModelAttribute
	public void addAttributes(Model model)
	{
		model.addAttribute("catalist",cDao.getAllCategories());
		
	}
}
