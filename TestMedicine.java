package demo;
import java.util.Random;

abstract class Medicine{
	private int price;
	private int expiry_date;
	
	void getDetails(int price,int expiry_date) {
		this.price=price;
		this.expiry_date=expiry_date;
	}
	abstract void driveLabel();
}

class Tablet extends Medicine{
	Tablet(int Price,int Expiry_date){
		super.getDetails(Price,Expiry_date);
	}
	void driveLabel() {
		System.out.println("Store in cool and Dry Places");
	}
}

class Syrup extends Medicine{
	Syrup(int Price,int Expiry_date){
		super.getDetails(Price,Expiry_date);
	}
	void driveLabel() {
		System.out.println("Syrup to be stored in cool places");
	}
}

class Ointment extends Medicine{
	Ointment(int Price,int Expiry_date){
		super.getDetails(Price,Expiry_date);
	}
	void driveLabel() {
		System.out.println("For External use Only");
	}
}

public class TestMedicine {
	public static void main(String args[]) {
		Random R= new Random();
		int x=R.nextInt(3);
		switch(x) {
		case 0:
			Tablet T = new Tablet(23,27);
			T.driveLabel();
			break;
		case 1:
			Syrup S = new Syrup(23,23);
			S.driveLabel();
			break;
		case 2:
			Ointment O = new Ointment(23,29);
			O.driveLabel();
			break;
		default: System.out.println("Wrong Choice");	
		}
		
	}
}
