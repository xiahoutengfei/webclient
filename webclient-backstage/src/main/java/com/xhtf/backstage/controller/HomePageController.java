package com.xhtf.backstage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomePageController {

	@RequestMapping("index")
	public String redirect(){
		return "h5/index";		
	}
	
	@RequestMapping("sumTable")
	public String sumTable(){
		return "h5/sumTable";
	}
}
