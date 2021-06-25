package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	public static void main(String args[]) throws IOException {	  
	      File file = new File("File1.txt");
	      FileReader fr = new FileReader(file);
	      char chars[] = new char[(int) file.length()];
	      //Read
	      fr.read(chars);
	      //Write
	      File out = new File("File3.txt");
	      FileWriter fw = new FileWriter(out);
	      //Write
	      fw.write(chars);
	      fw.flush();
	      System.out.println("Data has inserted successfully");
	   }
}
