package com.oraclejava.day5;

import java.util.Scanner;

public class ExTest2 {

	public static void main(String[] args) {
		// 나이를 입력받아 19세 미만이면 예외가 발생
		// 예외 메시지: "당신은 맥주를 사서 마실 수 없습니다"
		try {
			int age = 0;
			Scanner scan = new Scanner(System.in);
			System.out.print("나이 입력:");
			age = scan.nextInt();
			if (age < 19) {
				throw new BeerException("당신은 맥주를 마실 수 없습니다...");
			}
			
			System.out.println("맛있게 드세요^^");
			
		} catch (BeerException ex) {
			System.out.println(ex.getMessage());
			ex.reInput();
		} finally {
			System.out.println("안녕히 가세요~");
		}
	}

}
