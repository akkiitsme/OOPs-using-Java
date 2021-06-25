package filehandling;
import java.io.File;
import java.io.IOException;
public class CheckFileExist {
	public static void main(String args[]){
	File fp = new File( "c:\\java", "abc.txt");
	//check whether that file exists or not
	System.out.println("File name :" + fp.getName());
	System.out.println("path :" + fp.getPath());
	System.out.println("Absolute path :" +fp.getAbsolutePath());
	System.out.println(fp.exists() ? "file exists": "file does not exists");
	System.out.println(fp.isDirectory() ? "file is a directory": "file is not" + "in directory");
	System.out.println(fp.isFile()? "file is an ordinary file": "file may be a named as Akshay") ;
	}
}
