package com.oraclejava.repository;

import com.oraclejava.domain.Comment;

public interface CommentRepository {
	Iterable<Comment> findByArticleId(int articleId);
	
	Comment save(Comment comment);  // 댓글 쓰기
	
	void deleteByArticeId(int articleId); // 게시글id로 댓글 삭제
}
