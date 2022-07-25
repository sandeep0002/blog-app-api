package com.codewithsandeep.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsandeep.blog.entities.Comment;


public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
