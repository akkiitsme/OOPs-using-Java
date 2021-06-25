package demo;
class J {
	int a,b,c,d,e;
	void add(){
		c=a+b;
		System.out.println("Sum of J="+c);
	}
}
class K extends J {
	void add(){
		e=c+d;
		System.out.println("Sum of K="+e);
	}
}
class M extends J{
	void add(){
		System.out.println(e);
	}
}

public class Hierarchicalinherit {
	public static void main(String args[]){
		J obj1=new J();
		obj1.a=3;
		obj1.b=4;
		obj1.add();
		
		K obj2=new K();
		obj2.c=7;
		obj2.d=4;
		obj2.add();
		
		M obj3=new M();
		obj3.e=20;
		obj3.add();
	}
}
