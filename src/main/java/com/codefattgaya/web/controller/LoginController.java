package com.codefattgaya.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	
	@RequestMapping(value="/login", method=RequestMethod
			.POST)
	public String loginPage(ModelMap modelMap, HttpServletRequest request,
			HttpServletResponse response){
		
		modelMap.put("Test", "Test");
		return "redirect:/app/mainpage";
		
	}
}
