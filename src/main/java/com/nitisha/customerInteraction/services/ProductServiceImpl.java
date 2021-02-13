package com.nitisha.customerInteraction.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitisha.customerInteraction.entities.Product;
import com.nitisha.customerInteraction.repos.ProductRepository;

@Service
public class ProductServiceImpl implements ProductServices {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = productRepository.findAll();
		return products;
	}

}