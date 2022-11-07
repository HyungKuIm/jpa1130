package day2;

public class Array3 {

	public static void main(String[] args) {
		int[][] gugu = new int[9][9];
		
		//making gugu
				for(int i=0; i<9; i++) {
					for(int j=0; j<9; j++) {
						gugu[j][i] = (i+1) * (j+1);
					}
				}
		
		
		//show gugu
		for (int i=0; i<9; i++){
			for(int j=0; j<9; j++) {
				System.out.print(" " + (j+1) + "*" + (i+1) + "=" + gugu[j][i]);
			}
			System.out.println();
		}

	}

}
