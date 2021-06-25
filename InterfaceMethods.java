interface X{
	void a();
	void b();
	void c();
	void d();
}
abstract class Y implements X{
	public void c(){
		System.out.print("It's C method\r");
	}
}

class Z extends Y{
	public void a(){
		System.out.print("It's A method\r");
	}
	public void b(){
		System.out.print("It's B method\r");
	}
	public void d(){
		System.out.print("It's D method\r");
	}
}

public class InterfaceMethods {
	public static void main(String[] args){
		X a=new Z();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}
