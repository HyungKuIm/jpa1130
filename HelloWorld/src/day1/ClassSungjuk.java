package day1;

import java.util.Scanner;

public class ClassSungjuk {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = 0; // 점수 합계
		int counter = 0; //입력한 점수 갯수
		int score = 0; //각각의 점수
		
		do {
			System.out.print("성적 입력:");
			score = scan.nextInt();
			if(score != -1) {
				total += score;
				counter++;
			}
		}while (score != -1);
		
		if(counter == 0) {
			System.out.println("성적이 입력되지 않았습니다.");
		} else {
			System.out.println("총점: " + total);
		System.out.println("평균: " +(total / (double)counter));
		}
		
		
		

	}

}
