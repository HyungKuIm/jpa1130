package day1;

public class Hello2 {
              //실행 단축키 컨트롤+f11
	          //변수(Variable)
	public static void main(String[] args) {
		int a = 100, b = 200;
		//int a; a = 100; 해도됨
		
		System.out.println(a);
		System.out.println(b);
		
		
		a = b; //b 값을 a에 대입(오른쪽에서 왼쪽으로 일어남)
		System.out.println(a);
		
		char c = '이'; //잠깐 존재하고 사라짐
		c = '유';  
		//'유' = c;
		c = '박';
		System.out.println(c);
	}

}
