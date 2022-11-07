package com.oraclejava.board.service;

import java.util.List;

import com.oraclejava.board.domain.Article;

// 게시글을 위한 서비스
public interface ArticleService {
	
	// 게시글 목록
	public List<Article> findAll();
	
	// 게시글 저장
	public void save(Article article);
	
	// 게시글 삭제
	public void delete(int id);
}
