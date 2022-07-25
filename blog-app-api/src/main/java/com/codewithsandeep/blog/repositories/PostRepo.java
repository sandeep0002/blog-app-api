package com.codewithsandeep.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsandeep.blog.entities.Category;
import com.codewithsandeep.blog.entities.Post;
import com.codewithsandeep.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);

}
