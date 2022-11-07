package com.oraclejava.board.domain;

import java.util.List;

public class Article {
	private Integer id;   // 글번호
	private String name;	// 글쓴이
	private String content; // 글내용(컨텐츠)
	// 게시글에 대한 댓글 목록
	private List<Comment> commentList;
	
	// 생성자 2개
	public Article() {}

	public Article(Integer id, String name, String content, List<Comment> commentList) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.commentList = commentList;
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

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	
	// get, set
}
