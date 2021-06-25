package demo;
public class Book {
	private int bookNo;
	private String title;
	private String author;
	private float price;
	//getters and setters
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void display(){
		System.out.println("BookNo: "+getBookNo());
		System.out.println("Title: "+getTitle());
		System.out.println("Author: "+getAuthor());
		System.out.println("Price: "+getPrice());
	}
	public void validate(float price){
		if(price>=1 && price<=5000) {
			System.out.println("Error in Price");
		}
		if(title.length()<=4) {
			System.out.println("Error in Title");
		}
	}
	   
}
