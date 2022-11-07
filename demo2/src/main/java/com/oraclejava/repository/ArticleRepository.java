package com.oraclejava.repository;

import com.oraclejava.domain.Article;

public interface ArticleRepository {
	Iterable<Article> findAll();
	Article save(Article article);  // --> 글쓰기
	Article findOne(int id); // --> 글 상세보기
	void deleteById(int id); // 글 지우기
}
