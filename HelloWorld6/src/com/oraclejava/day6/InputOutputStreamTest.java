package com.oraclejava.day6;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class InputOutputStreamTest {

	public static void main(String[] args) throws IOException {
		byte[] arr = {83, 84, 79, 80};
		
		ByteArrayInputStream bais = new ByteArrayInputStream(arr);
		//int data = bais.read();
		int data;
		while ((data = bais.read()) != -1) {  // EOS(End of Stream)
			System.out.print(data + ",");
			//data = bais.read();
		}
		
		bais.close();

	}

}
