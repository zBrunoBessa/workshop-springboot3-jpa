package com.brunobessa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunobessa.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
