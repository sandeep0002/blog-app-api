package com.codewithsandeep.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsandeep.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
