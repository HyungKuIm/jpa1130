package com.oraclejava.day5;

import java.net.MalformedURLException;
import java.net.URL;

public class ExTest {

	public static void main(String[] args)  {

		try {
			URL url = new URL("www.yahoo.co.kr");
		} catch (MalformedURLException e) {
			System.out.println("--- Exception 발생 구문 -----");
			System.out.println("예외 발생 정보:" + e.getMessage());
			System.out.println("예외 자체 정보:" + e.toString());
			e.printStackTrace();
			return;
		} finally {
			// 예외 발생 여부와 관계없이 무조건 실행됨
			System.out.println("finally 결국이리로 오는군요");
		}
		
	}

}
