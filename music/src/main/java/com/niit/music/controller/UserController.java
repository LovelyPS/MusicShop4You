package com.niit.music.controller;

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
		
		ModelAndView mv = new ModelAndView("index");
		
		return mv;
	}
	@ModelAttribute
	public void addAttributes(Model model)
	{
		model.addAttribute("catalist",cDao.getAllCategories());
		
	}
}
