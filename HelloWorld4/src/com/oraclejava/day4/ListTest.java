package com.oraclejava.day4;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// 영화목록 순위(인생영화)
		List<String> movieList = new ArrayList<>();
		movieList.add("미나리");
		movieList.add("타이타닉");
		movieList.add("어벤져스");
		movieList.add("어벤져스 엔드게임");
		movieList.add("샹치");
		movieList.add("샹치");
		
		for (String movie : movieList) {
			System.out.println(movie);
		}
	}

}
