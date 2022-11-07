package day1;

import java.util.Scanner;

public class Hello13 {

	public static void main(String[] args) {
		// 1~10까지 합 구하기 (1+2... + 9+10)
		//사용자가 키보드로 몇까지 합을 구할지 입력받아 계산
		// 몇까지 합을 구할까요? 15
		// 1 to 15 sum is ??
		// for문으로
		Scanner scan = new Scanner(System.in);
		System.out.print("몇까지 합을 구할까요? ");
		int num = scan.nextInt();  // 어디까지 합을 저장하는 변수 num
		
		int total = 0;  // 합을 저장하는 변수 total
		
		for (int i=1; i<=num; i++) {
			total += i;
		}
		
		System.out.println("1 to " + num + " sum is " + total);
	}

}




