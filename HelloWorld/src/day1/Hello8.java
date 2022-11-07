package day1;

public class Hello8 {

	public static void main(String[] args) {
		//90점 이상이면 A, 80~89 이면 B, 70~79이면 C, 나머지 D
		int num = 100;
		if (num >= 90) {
			System.out.println("A");
		}else if (num >= 80) {  // 80~89
			System.out.println("B");	
		
		}else if (num >=70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		
	}

}
