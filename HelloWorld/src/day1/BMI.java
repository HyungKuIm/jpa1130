package day1;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력:");
		double a = scan.nextDouble();
		System.out.println("몸무게를 입력:");
		double b = scan.nextDouble();
		
		double bmi = b / ((a / 100.0) * (a / 100.0));
		System.out.println("bmi = " + bmi);
		

	}

}
