package ReaderFile;

import java.io.*;
public class ReaderFileTesting {
	public static void main(String args[]){
		try {
			int i =0;
			File file =new File("FileReader.txt");
			FileReader fr = new FileReader(file);
			while(i!=-1) {
				i=fr.read();
				System.out.print((char)i);
					}
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io error");
		}		
	}

}
