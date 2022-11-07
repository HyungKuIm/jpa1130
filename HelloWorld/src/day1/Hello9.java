package day1;

public class Hello9 {

	public static void main(String[] args) {
		// or 논리
		// 비가 오거나현금이 50,000 미만이 아니라면 택시타고 집가기.
		// 아니면 전철타기...
		boolean comeRain =true;//비가 오느냐
		int money = 50000;
		// ! 참 -> 거짓, 거짓 -> 참
		if (comeRain && !(money <50000)) {
			System.out.println("택시타고 집에 가기");
			
		} else {
			System.out.println("전철타고 집에 가기");
		}

	}

}
