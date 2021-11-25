package com.bima.service;

import java.util.List;

import com.bima.model.Comment;

public interface ICommentService {
	Comment addComment(Comment newComment);

	List<Comment> listOfComment();
}
