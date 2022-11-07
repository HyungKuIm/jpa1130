package day1;

import java.util.Scanner;

public class CoffeeMachine2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("돈을 투입: ");
		int money = scan.nextInt();
		
		System.out.println("투입한 돈:" +money);
		
		int price = 400;  // 커피 1잔 400원
        int cup = money / price; //몫(=잔)
        int change = money % price; // 나머지(=거스름돈)
      
        if (money>= price) {
        System.out.println("잔수:" +cup);
        System.out.println("거스름돈:" +change);
	}  else {
		System.out.println("돈이 부족합니다.");
	}

}
}