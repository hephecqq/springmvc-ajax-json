package com.springmvc.controller;

import java.io.Serializable;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InputProductController implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Log logger=LogFactory.getLog(InputProductController.class);
	@RequestMapping("/addUser")
	public String addUser(){
		//System.out.println("addUser Controller...");
		logger.info(InputProductController.class.getSimpleName()+"called...");
		return "addUser";
	}
}
