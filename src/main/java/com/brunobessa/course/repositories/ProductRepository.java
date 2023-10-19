package com.brunobessa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunobessa.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
