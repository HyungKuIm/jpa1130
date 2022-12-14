package com.oraclejava.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

// 게시글 폼
public class ArticleForm {
	
	// 글id
	private Integer id;
	
	//글쓴이
	@NotNull(message="글쓴이 이름을 입력해 주세요")
	@Size(min=1, max=100, message = "글쓴이 이름은 1자 이상 100자 이내로 입력해 주세요")	
	private String name;
	
	//글내용
	@NotNull(message="글 내용을 입력해 주세요")
	@Size(min=2, message="글 내용은 최소 2자 이상 입력해 주세요")
	private String content;
	
	
	
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
	
	
}
