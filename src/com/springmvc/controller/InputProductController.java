package com.springmvc.controller;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InputProductController implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@RequestMapping("/addUser")
	public String addUser(){
		//System.out.println("addUser Controller...");
		return Constants.WEB_INF+"/jsp/addUser.jsp";
	}
}
