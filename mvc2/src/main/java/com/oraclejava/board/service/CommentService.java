package com.oraclejava.board.service;

import java.util.List;

import com.oraclejava.board.domain.Comment;

public interface CommentService {
	// 게시글id에 대한 댓글 목록
	public List<Comment> findByArticleId(int articleId);
	// 댓글 저장
	public void save(Comment comment); 
	// 게시글id에 대한 댓글 삭제
	public void deleteByArticleId(int articleId);
}
