package com.preeti.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.preeti.spring.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		//do not perform operation in controller class hence create a service class
		//int k=i+j;
		
		AddService ad=new AddService();
	int k=	ad.add(i, j);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("display.jsp");
				
		mv.addObject("result", k);
		return mv;
		
	}

}
