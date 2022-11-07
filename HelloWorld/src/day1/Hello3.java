package day1;

public class Hello3 {

	public static void main(String[] args) {
		//자동 형변환(casting) - 묵시적 형변환
		// 작은 수 -> 큰 수
		int i = 100;
		long l = i;
		System.out.println(l);
		
		
		// 덜 정밀한 수 -> 정밀한 수
		float f = 1.2f;
		double d = f;
		System.out.println(d);
		
		// 정수 -> 실수
		double d2 = i;
		System.out.println(d2);

	}

}
