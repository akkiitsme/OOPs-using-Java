package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmployee {
	public static void main(String args[])throws Exception{
		//Input stream
		FileInputStream Fin=new FileInputStream("Emp.txt");
		ObjectInputStream objfn=new ObjectInputStream(Fin);
		Employee empObj=(Employee)objfn.readObject();
		System.out.print(empObj.getEmpNo());
		System.out.print(empObj.getEmpName());
		System.out.print(empObj.getEmpBasic());
		System.out.print("Object De-Serialized");
		Fin.close();
	}
}
