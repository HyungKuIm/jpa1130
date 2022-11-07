package day2;

public class Coffe1Main {
	
	static Coffee coffee(int money) { //money 매개변수(parameter) static int coffee에서 변경
        Coffee cafe = new Coffee();  //객체 참조 변수
        cafe.cup = money /400; //몇잔 ex)2
        cafe.change = money % 400; //거스름돈 ex)
		return cafe;
		}
	
	public static void main(String[] args) { //가장 먼저 실행되는 메인 메서드
		Coffee cafe = coffee(400);  //400은 매개변수(arguments)
		System.out.printf("커피 %d잔\n거스름돈 %d\n"
				,cafe.cup, cafe.change);
		
		
		
		
		
	}
	
	}


   
