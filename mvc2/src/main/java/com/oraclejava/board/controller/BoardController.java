package com.oraclejava.board.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oraclejava.board.domain.Article;
import com.oraclejava.board.domain.Comment;
import com.oraclejava.board.form.ArticleForm;
import com.oraclejava.board.form.CommentForm;
import com.oraclejava.board.service.ArticleService;
import com.oraclejava.board.service.CommentService;

@Controller
@RequestMapping("/board")  
public class BoardController {
	
	@Autowired
	private ArticleService articleService;
	@Autowired
	private CommentService commentService;
	
	// 글쓰기 폼 초기화
	@ModelAttribute
	public ArticleForm setArticleForm() {
		return new ArticleForm();
	}
	
	// 댓글 폼 초기화
	@ModelAttribute
	public CommentForm setCommentForm() {
		return new CommentForm();
	}
	
	
	// 게시판 메인
	@RequestMapping
	public String index(Model model) {
		
		// 서비스에서 글목록 취득
		List<Article> articleList = articleService.findAll();
		
		// 각 개시글에 대해 댓글(있으면) 추가
		for (Article article : articleList) {
			List<Comment> commentList = 
					commentService.findByArticleId(article.getId());
			article.setCommentList(commentList);
		}
		
		// 글목록을 모델에 저장
		model.addAttribute("articleList", articleList);
		
		return "boardView";
	}
	
	// 게시글 쓰기
	@RequestMapping("/write_ok")  // /board/write_ok
	public String insertArticle(ArticleForm articleForm, Model model) {
		Article article = new Article();
		BeanUtils.copyProperties(articleForm, article);
		articleService.save(article);
		return "redirect:/board";
	}
	
	// 댓글 쓰기
	@RequestMapping("/comment_ok") // /board/comment_ok
	public String insertComment(CommentForm commentForm, Model model) {
		//System.out.println("1: article id:" + commentForm.getArticleId());
		Comment comment = new Comment();
		BeanUtils.copyProperties(commentForm, comment);
		//System.out.println("2: article id:" + comment.getArticleId());
		commentService.save(comment);
		return "redirect:/board";
	}
	
	
	// 게시글 삭제 구현
	@RequestMapping("/delete_ok") // /board/delete_ok
	public String deleteArticle(@RequestParam("id") Integer id, Model model) {
		commentService.deleteByArticleId(id);
		articleService.delete(id);
		return "redirect:/board";
	}

}





