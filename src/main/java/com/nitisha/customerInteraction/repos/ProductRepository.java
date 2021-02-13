package com.nitisha.customerInteraction.repos;



import org.springframework.data.jpa.repository.JpaRepository;


import com.nitisha.customerInteraction.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
