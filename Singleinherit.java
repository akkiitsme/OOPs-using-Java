package demo;
class A{
	int a,b;
	void showA()
	{
		System.out.println("a and b:"+a+""+b);
	}
}
class B extends A{
	int c;
	void showB()
	{
		System.out.println("c:"+c);
	}
	void sum()
	{
		System.out.println("a+b+c:" + (a+b+c));
	}
}

public class Singleinherit {
	public static void main(String args[])
	{
			A add1=new A();
			B add2=new B();
			add1.a=10;
			add1.b=20;
			add1.showA();
			
			add2.a=5;
			add2.b=6;
			add2.c=7;
			
			add2.showA();
			add2.showB();
			add2.sum();		
	}
}
