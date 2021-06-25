package demo;
class OuterDemo{
	static int num=10;
	static class Inner{
		static void show(){
			System.out.print("NUMBER IS=" +num);
		}
	}
}
public class StaticInnerClass {
	public static void main(String args[]){
		OuterDemo.Inner.show();
	}
}
