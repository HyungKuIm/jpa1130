package com.oraclejava.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.oraclejava.board.domain.Comment;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final RowMapper<Comment> COMMENT_ROW_MAPPER =
			(rs, i) -> {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				String content = rs.getString("content");
				Integer articleId = rs.getInt("article_id");
				return new Comment(id, name, content, articleId);
			};
	
	@Override
	public List<Comment> findByArticleId(int articleId) {
		
		String sql = "select id, name, content, article_id " 
				+ "from comments where article_id = ?";
		List<Comment> commentList = 
				jdbcTemplate.query(sql, COMMENT_ROW_MAPPER, articleId);
		
		return commentList;
	}

	@Override
	public void save(Comment comment) {
		String insertSql = 
			"insert into comments(id, name, content, article_id) "
				+ " values(comments_seq.nextval, ?, ?, ?)";
		jdbcTemplate.update(insertSql, 
				comment.getName(), 
				comment.getContent(), 
				comment.getArticleId());
		
	}

	@Override
	public void deleteByArticleId(int articleId) {
		String sql = "delete from comments where article_id = ?";
		jdbcTemplate.update(sql, articleId);
		
	}

}





