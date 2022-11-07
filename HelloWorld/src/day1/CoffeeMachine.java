package day1;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cash = 0;
		int coffee=0;
		int rest = 0;
		System.out.print("돈 투입:");
		cash = scan.nextInt();
		
	    if (cash / 400 >0)  {
	    	coffee = cash / 400;
	    	rest = cash - (400*coffee);
	    	System.out.println("커피는 "+ coffee + "잔");
	    	System.out.println("거스름돈은 " + rest + "원 입니다." );

	
    	} else if (cash<400) {
	     	System.out.print("돈이 부족합니다.");
	    
	    }

	}

	

}
