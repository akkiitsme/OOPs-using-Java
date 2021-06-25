package demo;
class X {
	int a,b;
	void showX(){
		System.out.print("\rSum of X="+ (a+b));
	}
}
class Y extends X {
	int c;
	void showY(){
		System.out.print("\rValue of Y="+c);
	}
}
class Z extends Y {
	int d;
	public int sum(){
		d=a+b+c;
		return d;
	}
}

public class Multilevelinherit {
	public static void main(String args[]){
	X obj1=new X();
	Y obj2=new Y();
	Z obj3=new Z();
	
	obj1.a=1;
	obj1.b=2;
	obj1.showX();
	
	obj2.c=7;
	obj2.showY();
	
	obj3.a=5;
	obj3.b=10;
	obj3.c=15;
	System.out.println("\rSum of abc="+obj3.sum());
	}	
}
