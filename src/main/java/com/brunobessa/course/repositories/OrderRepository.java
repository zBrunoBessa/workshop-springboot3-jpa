package com.brunobessa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunobessa.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
