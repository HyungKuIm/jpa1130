package day2;

public class Person {

	int id; 
	String name;
	String teamName;
	String sex;
	
	//메소드 작성
	//홈런친다(homerun), 안타친다(hit), 병살친다(doublePlay)
	
	public void homerun() {
		System.out.println("홈런~~!!");
	}
	
	public void hit() {
		System.out.println("안타~~!!");
		
	}
	
	public void doublePlay() {
		System.out.println("병살친다..?");
	}
	
}
