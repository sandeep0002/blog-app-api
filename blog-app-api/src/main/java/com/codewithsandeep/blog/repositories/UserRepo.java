package com.codewithsandeep.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsandeep.blog.entities.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
