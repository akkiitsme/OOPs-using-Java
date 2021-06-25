package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDataCopy {
	public static void main(String args[])throws IOException {
		FileInputStream fr = new FileInputStream("File1.txt");
		FileOutputStream fw = new FileOutputStream("File2.txt");
		if (fw != null) {
			System.out.println("File is Created");
		}
		if (fr != null) {
			System.out.println("File has Opened");
		}	
		int i; 
		while ((i=fr.read()) != -1)
			fw.write((char)i);
		System.out.println("Data has inserted Successfully");
		
		fr.close();
		fw.close();
		
		// Read 
		FileInputStream fin = new FileInputStream("File2.txt");
		System.out.println("---Showing data of File 2---");
		int j;
		while((j=fin.read())!=-1){
			System.out.println((char)j);
		}
		fin.close();
}

}
