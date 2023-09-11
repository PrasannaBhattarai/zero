package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

	
	@GetMapping("/index")
	public ModelAndView showHome() {
	    ModelAndView modelAndView = new ModelAndView("index");

	    modelAndView.addObject("yourVariable", "Value of yourVariable");
	    modelAndView.addObject("anotherVariable", "Value of anotherVariable");

	    return modelAndView;
	}
	
	@GetMapping("/contact")
    public String showContactPage() {
        return "user/contact";
    }

	
	@RequestMapping("/login")
	public String processLogin() {

	        return "user/login";
	}

	
	
	
}
