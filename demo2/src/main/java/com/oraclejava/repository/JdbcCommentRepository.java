package com.oraclejava.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.oraclejava.domain.Comment;

@Repository
public class JdbcCommentRepository implements CommentRepository {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcCommentRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Iterable<Comment> findByArticleId(int articleId) {
		String sql = "select id, name, content, article_id "
				+ "from comments where article_id = ?";
		return jdbcTemplate.query(sql, this::mapRowToComment, articleId);
	}
	
	private Comment mapRowToComment(ResultSet rs, int rowNum)
		throws SQLException {
		return new Comment(
				rs.getInt("id"), 
				rs.getString("name"), 
				rs.getString("content"),
				rs.getInt("article_id"));
	}

	@Override
	public Comment save(Comment comment) {
		String sql = "insert into comments(id, name, content, article_id) "
				+ "values (comments_seq.nextval, ?, ?, ?)";
		jdbcTemplate.update(sql, 
				comment.getName(),
				comment.getContent(),
				comment.getArticleId());
		return comment;
	}

	@Override
	public void deleteByArticeId(int articleId) {
		String sql = "delete from comments where article_id = ?";
		jdbcTemplate.update(sql, articleId);
		
	}
	
	
	
}
