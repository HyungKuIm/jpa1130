package com.oraclejava.day4;

public class MathTest {

	public static void main(String[] args) {
		// 1.7 ==> 2 (절상)
		double num = 1.7;
		System.out.println(Math.ceil(num));
		
		// 어떤 아르바이트 직원의 주간 평균 근무 시간은 25.6 시간이었다.
		// 반올림해서 출력하여라
		double hour = 25.6;
		System.out.println(Math.round(hour));
		
		// 추신수 선수의 2022년 타율이 0.279 였다.
		// 소수점 3자리에서 절삭하여라. --> 0.27
		
		double avg = 0.279;
		System.out.println(Math.floor(avg * 100) / 100);
	}

}
