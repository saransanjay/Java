package InputStream;

import java.io.*;

public class InputStreamTesting {
	public static void main(String args[]){
		try {
			int i =0;
			File file =new File("InputStream.txt");
			FileInputStream is = new FileInputStream(file);
			while(i!=-1) {
				i=is.read();
				System.out.print((char)i);
					}
			is.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io error");
		}		
	}

}
