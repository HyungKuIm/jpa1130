package day2;

public class Araay2 {

	public static void main(String[] args) {
		int[][] sungjuk = new int[2][3];
		
		sungjuk[0][0] = 100; //0번 방에 100, 80, 40점 학생
		sungjuk[0][1] = 80;
		sungjuk[0][2] = 40;
		
		sungjuk[1][0] = 90;
		sungjuk[1][1] = 80;
		sungjuk[1][2] = 100;
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(" " + sungjuk[i][j]);
			}
			System.out.println();
		}

	}

}
