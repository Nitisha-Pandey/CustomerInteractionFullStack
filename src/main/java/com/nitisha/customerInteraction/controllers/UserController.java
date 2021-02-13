package com.nitisha.customerInteraction.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nitisha.customerInteraction.entities.Product;
import com.nitisha.customerInteraction.entities.User;
import com.nitisha.customerInteraction.repos.UserRepository;
import com.nitisha.customerInteraction.services.ProductServices;


@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
//	@Autowired
//	ProductServices productServices;
	
//	private BCryptPasswordEncoder encoder;
	
	@RequestMapping("/showReg")
	public String showRegistration() {
		return "login/registerUser";
	}
	

	@RequestMapping(value="/resigterUser", method=RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		//user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
		return "login/login";
	}
	
	
	@RequestMapping("/showLogin")
	public String showLoginRegistration() {
		return "login/login";
	
	}

	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login() {
		return "Homepage";
		
	}
	
}
