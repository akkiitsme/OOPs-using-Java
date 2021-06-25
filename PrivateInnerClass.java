package demo;
class Outer{
	private class Inner{
		public void show(){
			System.out.print("I am Inner class");
		}
	}
	 void displayinner(){
		Inner in=new Inner();
		in.show();
	}
}
public class PrivateInnerClass {
	public static void main(String args[]){
		Outer out=new Outer();
		out.displayinner();
	}
}
