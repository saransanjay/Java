package OutStream; 

import java.io.*;

public class OutputStreamTesting {
	public static void main(String args[]){
		try {
			File file =new File("OutStream.txt");
			FileOutputStream fos = new FileOutputStream(file);
			String text = "Hello\nProgrammingWorld";
			fos.write(text.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io error");
		}		
	}
}