package com.oraclejava.day4;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		for (int i=1; i<=6; i++) {
			int ball = new Random().nextInt(45) + 1;
			System.out.print(ball + " ");
		}

	}

}
