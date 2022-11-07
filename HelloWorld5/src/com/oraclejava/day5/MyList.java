package com.oraclejava.day5;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		//중복가능하고 순서가 있는 객체(리스트) - 컬렉션
		List<GoodsInfo> goodsList = 
				new ArrayList<>();  // 빈 리스트 생성
		//라면 리스트
		goodsList.add(new GoodsInfo(1, "신라면", 6000, "2022-10-12"));
		goodsList.add(new GoodsInfo(2, "진라면", 5500, "2022-10-11"));
		goodsList.add(new GoodsInfo(3, "열라면", 5900, "2022-10-10"));
		goodsList.add(new GoodsInfo(4, "불닭볶음면", 7000, "2022-10-09"));
		goodsList.add(new GoodsInfo(5, "일본라멘", 10000, "2022-10-09"));
		
		System.out.printf("%-10s%-15s%-10s%-10s\n", "상품아이디", "상품명", "날짜", "상품가격");
		
		for (GoodsInfo goods : goodsList) {
			System.out.printf("%-12d%-15s%10s%10d\n", 
					goods.getId(), goods.getName(), goods.getDate(), goods.getMoney());
		}

	}

}
