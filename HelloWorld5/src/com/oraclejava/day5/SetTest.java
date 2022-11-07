package com.oraclejava.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// Set: 순서없고, 중복이 불가능한 컬렉션
		// 로또 출력(6/45)
		// 오름차순으로 출력
		Set<Integer> set = new HashSet<>();
		
		while (set.size() < 6) {
			set.add(new Random().nextInt(45) + 1);
		}
		
		List<Integer> list = new ArrayList<>(set);
		//Collections.sort(list);  //오름차순
		
		list.sort((n1, n2) -> n2.compareTo(n1)); //내림차순(역방향)
		
		for (Integer num : list) {
			System.out.printf("%3d", num);
		}
		
		
	}

}
