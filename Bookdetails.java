package demo;
import java.util.Scanner;
public class Bookdetails extends Book{
	   public static void main(String[] args) {
	    //Reading values from user
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter the Book Number: ");
	   int bookNo=input.nextInt();
	   System.out.println("Enter title of the Book: ");
	   String title=input.next();
	   System.out.println("Enter Author of the Book: ");
	   String author= input.next();
	   System.out.println("Enter price of the Book: ");
	   float price=input.nextFloat();
	   //Calling the setter and getter methods
	   Book obj = new Book();
	   obj.setBookNo(bookNo);
	   obj.setTitle(title);
	   obj.setAuthor(author);
	   obj.setPrice(price);
	   obj.display();
	  }	   
}
