package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
public static void main(String args[]) throws IOException {	
		// for creating a file
		FileOutputStream fout = new FileOutputStream("File1.txt");
		// Write
		String s = "Akshay singh" ; 
		byte [] data = s.getBytes();
		fout.write(data);
		System.out.print("Data has inserted successfully\r");
		fout.close();
		// Read
		FileInputStream fin = new FileInputStream("File1.txt");
		int i=0;
		while((i=fin.read())!=-1){
			System.out.println((char)i);
		}
		fin.close();
	}
}
