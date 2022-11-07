package com.oraclejava.board.domain;

public class Comment {
	private Integer id;	// 댓글 id
	private String name;  // 댓글단 사람
	private String content;  // 댓글 내용
	private Integer articleId;  // 게시글 id
	
	// 생성자 2개
	public Comment() {}

	public Comment(Integer id, String name, String content, Integer articleId) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.articleId = articleId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	
	// get, set
	
	
}
