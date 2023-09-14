package com.example.demo.config;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Post;
import com.example.demo.security.JwtHelper;
import com.example.demo.service.PostService;

import jakarta.servlet.http.HttpServletResponse;


@Controller
public class AuthController {

	@Autowired
	public JwtHelper jwtHelper;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	PostService service;
	
	
	@RequestMapping("admin/adminDashboard")
	public String dash() {
		return "admin/adminDashboard";
	}
	
	
	@PostMapping("/loginSuccess")
	public String processLogin(@RequestParam String username, @RequestParam String password, HttpServletResponse response) {
	    if (isValidAdmin(username, password)) {
	        // Valid admin credentials
	        String token = jwtHelper.generateToken(userDetailsService.loadUserByUsername(username)); // Generate JWT token
	        response.addHeader("Authorization", "Bearer " + token); // Add token to response header
	        System.out.println("Generated Token: " + token);
	        System.out.println("Added Header: Authorization: Bearer " + token);

	        return "admin/adminDashboard";
	    } else {
	        // Invalid credentials
	        return "user/login";
	    }
	}
	
	private boolean isValidAdmin(String username, String password) {
	    // username "zeroadmin" and password "zerowastage"
	    return username.equals("zeroadmin") && password.equals("zerowastage");
	}


}
