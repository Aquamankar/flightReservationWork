package com.crudOpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudOpe.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByEmail(String emailId); 
}