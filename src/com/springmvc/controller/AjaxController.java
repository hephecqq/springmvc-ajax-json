package com.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjaxController {
	
	@RequestMapping("/ajax")
	public void ajax(String name,HttpServletResponse response) throws IOException{
		if("hepeng".equals(name)){
			response.getWriter().print("true");
		}else{
			response.getWriter().println("false");
		}
	}
}
