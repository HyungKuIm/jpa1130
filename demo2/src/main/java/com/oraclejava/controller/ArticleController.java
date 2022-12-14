package com.oraclejava.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.oraclejava.domain.Article;
import com.oraclejava.domain.Comment;
import com.oraclejava.form.ArticleForm;
import com.oraclejava.form.CommentForm;
import com.oraclejava.repository.ArticleRepository;
import com.oraclejava.repository.CommentRepository;

@Transactional
@RequestMapping("/board")
@Controller
public class ArticleController {

	private ArticleRepository articleRepository;
	
	private CommentRepository commentRepository;

	public ArticleController(ArticleRepository articleRepository,
			CommentRepository commentRepository) {
		super();
		this.articleRepository = articleRepository;
		this.commentRepository = commentRepository;
	}
	
	// 게시글 폼 초기화
	@ModelAttribute
	public ArticleForm setArticleForm() {
		return new ArticleForm();
	}
	
	// 댓글 폼 초기화
	@ModelAttribute
	public CommentForm setCommentForm() {
		return new CommentForm();
	}
	
	// 게시글 보기
	@RequestMapping(value="/content", method=RequestMethod.GET)
	public String showContent(@RequestParam("id") Integer id, Model model) {
		System.out.println("showContent");
		Article article = articleRepository.findOne(id);
		
		// 댓글 목록 가져오기
		List<Comment> commentList = new ArrayList<>();
		commentRepository.findByArticleId(id).forEach(c -> commentList.add(c));
		
		article.setCommentList(commentList);
		
		model.addAttribute("article", article);
		
		return "show";
	}
	
	
	// 게시글 쓰기
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write(Model model) {
		return "write";
	}
	
	@RequestMapping(value="/write_ok", method=RequestMethod.POST)
	public String write_ok(@Validated ArticleForm articleForm, 
			BindingResult result,
			Model model) {
		System.out.println("write_ok");
		
		if (result.hasErrors()) {
			return write(model);
		}
		
		
		Article article = new Article();
		BeanUtils.copyProperties(articleForm, article);
		articleRepository.save(article);
		return "redirect:/board";
	}
	
	// 댓글 쓰기
	@RequestMapping(value="/comment_ok", method=RequestMethod.POST)
	public String insertComment(@Validated CommentForm commentForm,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			return showContent(commentForm.getArticleId(), model);
		}
		Comment comment = new Comment();
		BeanUtils.copyProperties(commentForm, comment);
		commentRepository.save(comment);
		return "redirect:/board/content?id=" + comment.getArticleId();
	}
	
	// 글 목록 보기
	@RequestMapping
	public String findAll(Model model) {
		List<Article> arti = new ArrayList<>();
		
		articleRepository.findAll().forEach(e -> arti.add(e));
		
		model.addAttribute("arti", arti);
		return "board";
	}
	
	// 글 삭제하기
	@RequestMapping("/deletearticle")
	public String deleteArticle(ArticleForm articleForm) {
		// 자식글 삭제
		commentRepository.deleteByArticeId(articleForm.getId());
		//int i = 1 / 0;
		// 부모글 삭제
		articleRepository.deleteById(articleForm.getId());
		return "redirect:/board";
	}
	
	
	
}
