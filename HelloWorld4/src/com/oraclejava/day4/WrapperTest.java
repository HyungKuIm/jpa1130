package com.oraclejava.day4;

public class WrapperTest {

	public static void main(String[] args) {
		int num1 = 20;
		Integer num2 = new Integer(30); // 포장(boxing)
		int total = num1 + num2.intValue();  // 언박싱(unboxing)
		System.out.println("두수의 합은: " + total);
		System.out.println(Integer.toBinaryString(total));  // 2진수로 표현
		System.out.println(Integer.toOctalString(total)); // 8진수로 표현
		System.out.println(Integer.toHexString(total)); // 16진수로 표현
		System.out.println(num1==num2);
		Integer num3 = new Integer(13);
		Integer num4 = new Integer(25);
		System.out.println(num3.equals(num4));
		
		Integer num5 = 445; // auto boxing
		System.out.println(num5);
		
		int num8 = num5.intValue();  // unboxing

		
		Integer num6 = Integer.parseInt("445");
		System.out.println(num6.intValue());
		
		Double num7 = new Double(1.1);
		System.out.println(num7.doubleValue());
		
		
	}

}
