package FileWriter;

import java.io.*;
public class FileWriterTesting {
	public static void main(String args[]){
		try {
			File file =new File("FileWriter.txt");
			FileWriter fw = new FileWriter(file);
			String text ="Hello\nProgrammingWorldd";
			fw.write(text);
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io error");
		}		
	}
}
