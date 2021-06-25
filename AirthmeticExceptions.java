package demo;

public class AirthmeticExceptions {
public static void main(String args[]){
	try{
		int num1=10,num2=0;
		System.out.print("Result:" +num1/num2);
	}
	catch (ArithmeticException e) {
		System.out.print("It is Airthmetic Exception can't be divide by Zero");
	}
}
}
