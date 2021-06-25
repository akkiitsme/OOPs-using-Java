package demo;
abstract class AnonymousDemo{
	 abstract void method();
}
public class AnonymousInnerClass {
 public static void main(String args[]){
	 new AnonymousDemo(){
		 void method(){
			 System.out.println("I'm Anonymous Inner Class");
		 }
	 }; 
 }
}
