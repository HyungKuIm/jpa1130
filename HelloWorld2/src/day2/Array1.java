package day2;

public class Array1 {

	public static void main(String[] args) {
		// 5명의 성적 관리
		int[] sungjuk = {79,90,80,42,50}; //0~4번까지
		//배열의 크기
		System.out.println("length = " + sungjuk.length);
		
		//for문을 사용하여 배열을 출력
		for(int score : sungjuk) {
			System.out.println(score);
		}
		
		//총점과 평균
		int total = 0;
		double avr = 0.0;
		
		for(int score : sungjuk ) {
			total +=score;
		}

		avr = total/sungjuk.length;
		
		System.out.println("총점"+ " =" + total);
		System.out.println("평균"+ " =" + avr);
		
		
		
}
}