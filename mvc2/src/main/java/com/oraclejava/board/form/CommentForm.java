package com.oraclejava.board.form;

public class CommentForm {
	private String name;  //댓글 쓴 사람 이름
	private String content;  // 댓글 내용
	private Integer articleId;  // 원 게시글 id
	
	// get, set
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
	
	
	
	
	
	
}
