package com.oraclejava.day4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());  // 1970-01-01 자정(영국시간) 기준으로
		// 현재까지 흐른 밀리세컨드
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		System.out.println(sdf.format(date));

	}

}
