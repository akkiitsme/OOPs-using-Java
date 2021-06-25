package demo;

public class democonst {
	int roomNo;
	String roomType;
	float roomArea;
	boolean acRoom;
	
	//default constructor
	democonst(){
		roomNo=1;
		roomType="AC";
		roomArea=100; 
		acRoom=true;
	}
	
	//parameterized constructor
	democonst(int roomNo, String roomType,float roomArea,boolean acRoom){           
	this.roomNo=roomNo;    
	this.roomType=roomType;   
	this.roomArea=roomArea;   
	this.acRoom=acRoom;     
	}
	
	 //Copy constructor 
	democonst(democonst R){ 
	this.roomNo=R.roomNo;   
	this.roomType=R.roomType;   
	this.roomArea=R.roomArea;    
	this.acRoom=R.acRoom;        
	}       
	
	 void displayData() {    
	System.out.println("RoomNo: "+this.roomNo+" Type: "+this.roomType+" Area: " 
	+this.roomArea+" Ac/Non: " +this.acRoom);     
	}    
	
	public static void main(String args[]) { 
	democonst R1= new democonst();
	democonst R2= new democonst(1,"AC",250,false);
	democonst R3= new democonst (R1);  
	R1.displayData();    
	R2.displayData(); 
    R3.displayData();
	}//end of main 
}
