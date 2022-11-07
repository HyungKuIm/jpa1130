package com.oraclejava.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CatSerializeTest2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String filePath = "src/resources/cat.obj";
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream(filePath));
		//살아있나?(=쏴라있나?)
		Cat cat = (Cat)ois.readObject();
		ois.close();
		
		System.out.println("아이 이름:" + cat.getName());
		System.out.println("아이 나이:" + cat.getAge());

	}

}
