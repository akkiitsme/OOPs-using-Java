package demo;
class Testexception{
	void newmethod() throws Exception{
		throw new Exception("Inside the Class Error");
	}
}
public class ThrowException {
	public static void main(String args[]){
		try{
			Testexception obj=new Testexception();
			obj.newmethod();
		} catch(Exception e){
			System.out.print("Exception is Handled\r");
		}
		System.out.print("Exception is normal");
	}
}
