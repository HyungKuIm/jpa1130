package com.oraclejava.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> movieList = 
				new HashMap<>();
		movieList.put("4", "육사오");
		movieList.put("5", "거래완료");
		movieList.put("6", "선데이리그");
		movieList.put("1", "공조2");
		movieList.put("2", "인생은 아름다워");
		movieList.put("3", "정직한 후보2");
		movieList.put("1", "수타워즈");
		
		System.out.println("맵의 크기:" + movieList.size());
		//System.out.println(movieList.get("1"));
		Set<String> keySet = movieList.keySet();
		for (String key : keySet) {
			System.out.printf("%s : %s\n", key, movieList.get(key));
		}
	}

}
