package day2;

public class StringSam {

	public static void main(String[] args) {
		// 자신의 이름을 영문자(소문자)로 출력
		// 문자열(String)
		String name = "jimin";
		System.out.println(name);
		
		//문자배열(char array)
		char[] data = {'j','i','m','i','n'};
		String name2 = new String(data);
		System.out.println(name2);
		
		//문자열의 길이
		System.out.println("이름의 길이(영문자):" +name.length());
		System.out.println("이름의 첫글자는 " + name.charAt(0));
		System.out.println("이름을 대문자로 변환하면 " + name.toUpperCase());
		System.out.println("이름을 3번째부터 끝까지 자르면 " + name.substring(3));
		System.out.println("이름을 3번째부터 5번째까지 자르면 " + name.substring(3, 5));
		System.out.println("이름의 i를 대문자로 변환" + name.replace('i', 'I'));
		
		System.out.println(name);
 
		//2문자열이 같으면 true, 다르면 false
		System.out.println(name.equals(name2)); 
		System.out.println(name == name2);//문자열이 저장된 주소 비교(문자열에서는 사용금지!)
		System.out.println(name.compareTo(name2));
		// 기준 대문자 < 소문자 < 숫자 < 한글 (오름 차순)
		//영문: A-Za-Z 0-9 가나다순
		
		
		int price = 990000; // 아이폰14
		// 문자열 포맷
		System.out.println("iphone 14 = " + price);
		System.out.printf("iphone 14 = %,d\n", price);
		
		String price2 = String.format("iphone14 = %,d", price);
		System.out.println(price2);
		
	}

}
