package com.oraclejava.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// 사람의 이름을 키로, 주소를 값으로 하는 맵(해쉬맵)을 작성하고
		// 자료를 여러개 입력(put)후 출력해 본다(get)
		// 강호동 -> 서울시 구로구
		Map<String, String> map = new HashMap<>();
		map.put("강호동", "서울시 구로그");
		map.put("강백호", "경기도 수원시");
		map.put("김재윤", "경기도 수원시");
		map.put("소크라테스", "그리스 아테네");
		map.put("나성범", "광주광역시 송정동");
		map.put("이종범", "광주광역시 송정동");
		map.put("이종범", "서울특별시 강남구");
		
		//전체 주소록 출력
		Set<String> keySet = map.keySet();
		
		//키순으로 정렬
		List<String> list = new ArrayList<>(keySet);
		list.sort((a, b) -> b.compareTo(a));  //오름차순 정렬
		
		//for문으로 출력
		for (String name : list) {
			System.out.println("이름: " + name + ", 주소: " + map.get(name));
		}
		System.out.println("======================");
		//iterator로 출력
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println("이름: " + key + ", 주소: " + value);
		}
		
		
		

	}

}
