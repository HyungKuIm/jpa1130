package day2;

public class CatTestMain {

	public static void main(String[] args) {
		Cat cat; //객체 변수 선언
		cat = new Cat(); //메모리 할당
		//Cat cat = new Cat(); 동시에 선언과 할당하기
		cat.age = 1;
		cat.name = "한국 고양이";
		cat.weight = 6.5;
		System.out.println("age = " + cat.age);
		System.out.println("name = " + cat.name);
		System.out.println("weight = " +cat.weight);
		
		// 메소드 호출(method call)
		cat.hide();
		cat.cry();
		cat.eat();

	}

}
