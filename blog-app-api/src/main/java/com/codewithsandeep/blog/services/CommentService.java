package com.codewithsandeep.blog.services;

import com.codewithsandeep.blog.paylods.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId);

	void deleteComment(Integer commentId);

}