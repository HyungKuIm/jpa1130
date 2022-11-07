package day1;

import java.util.Scanner;

public class ClassSungjuk2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = 0; // 점수 합계
		int counter = 0; //입력한 점수 갯수
		System.out.print("점수 입력(종료 -1):");
		int score = scan.nextInt();
		
		while (score != -1) {
			total +=score; // total = total + score
			counter++;
			System.out.print("점수 입력(종료 -1):");
			score = scan.nextInt();
	
			
		}
		
		if(counter == 0) {
			System.out.println("성적이 입력되지 않았습니다.");
		} else {
			System.out.println("총점: " + total);
		System.out.println("평균: " +(total / (double)counter));
		}
		
		
		

	}

}
