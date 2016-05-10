package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {
	
	@RequestMapping("json")
	@ResponseBody
	public List<User> handleJson(){
		List<User> list=new ArrayList<User>();
		list.add(new User(1,"zhagnsan","��"));
		list.add(new User(2,"zhagnsan","Ů"));
		System.out.println(list);
		return list;
	}
}
