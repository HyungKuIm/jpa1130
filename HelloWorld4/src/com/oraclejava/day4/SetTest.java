package com.oraclejava.day4;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		//영화 목록
		Set<String> movieList = new HashSet<>();
		movieList.add("쥬라기공원");
		movieList.add("쥬라기공원 2");
		movieList.add("쥬라기공원 3");
		movieList.add("쥬라기공원 읽어버린 세계");
		movieList.add("쥬라기공원 도미니언");
		movieList.add("쥬라기공원");
		
		System.out.println("목록의 크기:" + movieList.size());
		
		for (String movie : movieList) {
			System.out.println(movie);
		}

	}

}
