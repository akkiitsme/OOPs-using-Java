package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2498313085564213957L;
	private transient int empNo;
	private String empName;
	private int empBasic;
	Employee(int empNo,String empName,int empBasic){
		this.empNo=empNo;
		this.empName=empName;
		this.empBasic=empBasic;
	}
	public int getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpBasic() {
		return empBasic;
	}
}

public class WriteEmployee {
	public static void main(String args[])throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.print("---Enter Employee Details---");
		System.out.print("\rEnter Employee Number:");
		int empNo=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee name:");
		String empName=sc.nextLine();
		System.out.print("\rEnter Employee Basic Salary:");
		int empBasic=sc.nextInt();
		//Output stream
		Employee empObj=new Employee(empNo,empName,empBasic);
		FileOutputStream Fout=new FileOutputStream("Emp.txt");
		ObjectOutputStream obj=new ObjectOutputStream(Fout);
		obj.writeObject(empObj);
		System.out.println("Value has been Stored successfully and Serialized");
		obj.close();
		Fout.close();
		sc.close();
		//Input stream
		FileInputStream Fin=new FileInputStream("Emp.txt");
		ObjectInputStream objfn=new ObjectInputStream(Fin);
		try {
			empObj = (Employee)objfn.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.print(empObj.getEmpNo());
		System.out.print(empObj.getEmpName());
		System.out.print(empObj.getEmpBasic());
		System.out.print("\rObject De-Serialized");
		Fin.close();
	}
}
//One output is 0 because of transient.
//transient is used to avoid serializing the empNo.
//It is specially used for variable like password.