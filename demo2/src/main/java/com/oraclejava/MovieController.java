package com.oraclejava;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	//인생 영화 출력
	@RequestMapping("/movies")
	public String lifeMovie(Model model) {
		List<String> movies = new ArrayList<>();
		movies.add("타이타닉");
		movies.add("아바타");
		movies.add("어벤져스 엔드게임");
		model.addAttribute("movies", movies);
		return "movie";
	}
}








