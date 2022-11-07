package com.oraclejava.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CommentForm {
	// 댓글 쓴 사람명
	// 이름은 1자 이상 100자 이하로 입력
	@NotNull(message = "이름은 필수입력입니다.")
	@Size(min = 1, max = 100, message = "이름은 1자 이상 100자 이내로 입력바랍니다")  // 선우은숙, 을지문덕, 디카프리오
	private String name;
	// 댓글 내용
	// 내용은 3자 이상 입력
	@NotNull(message = "내용은 필수입력입니다.")
	@Size(min = 3, message = "내용은 3자이상 입력바랍니다")
	private String content;
	
	private Integer articleId;
	
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
