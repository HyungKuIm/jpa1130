package day1;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력:");
		int a = scan.nextInt();
		System.out.println("두번째 숫자 입력:");
		int b = scan.nextInt();
		
		System.out.println("합 = " + (a + b));
		System.out.println("차 = " + (a - b));
		System.out.println("곱 = " + (a * b));
		System.out.println("몫 = " + (a / b));
		System.out.println("나머지 = " + (a % b));

	}

}
