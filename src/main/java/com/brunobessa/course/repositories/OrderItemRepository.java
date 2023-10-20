package com.brunobessa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunobessa.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
