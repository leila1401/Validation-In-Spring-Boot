package com.leila.springbootvalidationhibernate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leila.springbootvalidationhibernate.model.User;

public interface UserRepository extends JpaRepository<User , Long> {

}
