package com.bima.service;

import java.util.ArrayList;
import java.util.List;

import com.bima.model.Comment;

public class CommentService implements ICommentService {
	private List<Comment> comments = new ArrayList<Comment>();
	@Override
	public Comment addComment(Comment newComment) {
		// TODO Auto-generated method stub
		comments.add(newComment);
		return newComment;
	}

	@Override
	public List<Comment> listOfComment() {
		// TODO Auto-generated method stub
		return comments;
	}
	
}
