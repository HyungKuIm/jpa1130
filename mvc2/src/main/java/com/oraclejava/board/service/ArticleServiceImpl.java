package com.oraclejava.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.oraclejava.board.domain.Article;
import com.oraclejava.board.domain.Comment;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	// 재활용을 위한 객체
	private static final RowMapper<Article> ARTICLE_ROW_MAPPER =
			(rs, i) -> {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				String content = rs.getString("content");
				List<Comment> commentList = new ArrayList<>();
				return new Article(id, name, content, commentList);
			};
	
	@Override
	public List<Article> findAll() {
		String sql = "select id, name, content from articles "
					+ " order by id desc";
		List<Article> articleList = 
				jdbcTemplate.query(sql, ARTICLE_ROW_MAPPER);
		return articleList;
	}

	// 게시글 저장
	@Override
	public void save(Article article) {
		String insertSql = "insert into articles(id, name, content) "
				+ " values (articles_seq.nextval, ?, ?)";
		jdbcTemplate.update(insertSql, article.getName(), article.getContent());
		
	}

	@Override
	public void delete(int id) {
		String deleteSql = "delete from articles where id=?";
		jdbcTemplate.update(deleteSql, id);
		
	}

}







