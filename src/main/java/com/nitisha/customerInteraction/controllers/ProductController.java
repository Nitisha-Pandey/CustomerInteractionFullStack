package com.nitisha.customerInteraction.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import com.nitisha.customerInteraction.entities.Product;
import com.nitisha.customerInteraction.repos.ProductRepository;
import com.nitisha.customerInteraction.services.ProductServices;


@Controller
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProductServices productServices;
	
	
	@RequestMapping("/showAllProducts")
	public String showProducts(ModelMap ModelMap) {
		List<Product> products = productServices.getAllProducts();
		ModelMap.addAttribute("AllProducts", products);
		return "displayProducts";
	}

}
