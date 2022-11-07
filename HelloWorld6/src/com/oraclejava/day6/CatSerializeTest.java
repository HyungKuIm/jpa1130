package com.oraclejava.day6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CatSerializeTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 러시안 블루 고양이 한마리를 만들어서
		// 출력 스트림화를 시켜서 파일로 저장...
		Cat cat = new Cat();
		cat.setName("나비");  //입력
		cat.setAge(6);
		
		String filePath = "src/resources/cat.obj";
		
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(filePath));
		oos.writeObject(cat);
		
		oos.close();
		

	}

}
