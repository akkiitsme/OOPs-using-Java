package demo;
import java.util.Scanner;
class InvalidInputException extends Exception{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	InvalidInputException(String msg){
		super(msg);
	}
}
class Customer{
	private String custNo ;
	private String custName ;
	private String custCategory ;
	
	Customer(String custNo , String custName, String custCategory) throws InvalidInputException{
		if (custNo.charAt(0)=='C'|| custNo.charAt(0)=='c') {
			this.custNo = custNo ;
		}
		else {
			throw new InvalidInputException("Invalid Costumer Number!");
		}	
		if(custName.length()>=4) {
			this.custName = custName ;
		}
		else {
			throw new InvalidInputException("Invalid Costumer Name!");
		}	
		if( custCategory.equals("Platinum")  || custCategory.equals("Gold") || custCategory.equals("Silver") ) {
			this.custCategory = custCategory ;
		}
		else {
			throw new InvalidInputException("Invalid Costumer Category!");
		}
		
	}
	
	void getCustomer(){
		System.out.println("---Customer Data:---");
		System.out.println("Number: "+ this.custNo +" Name: "+ this.custName +" Category: "+ this.custCategory);		
	}		
}
//main function
public class TestCustomer {
	public static void main(String args[]) {
		
		//Taking Inputs
		System.out.println("Enter Customer Details: ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Number: ");
		String CustomerNo = sc.nextLine();
		System.out.println("Enter Customer Name: ");
		String CustomerName = sc.nextLine();
		System.out.println("Enter Cusomer Categories: ");
		String CustomerCategories = sc.nextLine();
		try {
			Customer C = new Customer(CustomerNo, CustomerName, CustomerCategories);
			C.getCustomer();
		}
		catch(InvalidInputException E) {
			System.out.println(E.getMessage());
		}		
		sc.close();
	}
}