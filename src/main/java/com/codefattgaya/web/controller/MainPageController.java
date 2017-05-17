package com.codefattgaya.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/main")
@Controller
public class MainPageController {

	@RequestMapping("/welcome")
	public String welcome(){
		
		
		return "welcome";
	}
	
}
