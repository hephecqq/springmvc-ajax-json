package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaveProductCotroller {

	@RequestMapping(value="/saveUser")
	public String saveUser(HttpServletRequest request){
		String username=request.getParameter("username");
		request.setAttribute("username", username);
		System.out.println(username);
		return "saveUser";
	}
}
