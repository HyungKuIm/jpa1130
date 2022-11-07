package day2;

public class Cat {
  int age; // 고양이 나이
  String name; //고양이 이름
  double weight; // 고양이 몸무게
  
  //행동 method (먹기 eat, 울기, 눕기)
  public void eat() {
	  System.out.println("고양이가 먹는다 냠냠");
  }
  
  public void lie() {
	  System.out.println("고양이가 눕는다 발라당");  
  }
  
  public void cry() {
	  System.out.println("고양이가 운다 야옹");
  }
  
  public void hide() {
	  System.out.println("고양이가 숨는다 후다닥");
  }
  
  public void sleep() {
	  System.out.println("고양이가 잔다 쿨쿨");
  }
  
	
}
