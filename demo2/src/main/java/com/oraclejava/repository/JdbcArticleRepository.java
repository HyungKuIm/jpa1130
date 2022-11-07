package com.oraclejava.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.oraclejava.domain.Article;

@Repository
public class JdbcArticleRepository implements ArticleRepository {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcArticleRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Iterable<Article> findAll() {
		String sql = "select * from articles order by id desc";
		return jdbcTemplate.query(sql, this::mapRowToArticle);
	}
	
	
	private Article mapRowToArticle(ResultSet rs, int rowNum)
	throws SQLException {
		Article arti = new Article();
		arti.setId(rs.getInt("id"));
		arti.setName(rs.getString("name"));
		arti.setContent(rs.getString("content"));
		return arti;
	}

	@Override
	public Article save(Article article) {
		String sql = "insert into articles(id, name, content) "
				+ "values(articles_seq.nextval, ?, ?)";
		jdbcTemplate.update(sql, article.getName(), article.getContent());
		return article;
	}

	@Override
	public Article findOne(int id) {
		String sql = "select id, name, content from articles "
					+ " where id=?";
		
		return jdbcTemplate.queryForObject(sql, this::mapRowToArticle, id);
	}

	@Override
	public void deleteById(int id) {
		String sql = "delete from articles where id=?";
		jdbcTemplate.update(sql, id);
		
	}
}







