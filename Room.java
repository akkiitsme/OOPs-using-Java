package demo;
public class Room {
	int roomNo;
	String roomType;
	float roomArea;
	boolean acMachine;
	
	void setData(int roomNo, String roomType,float roomArea,boolean acMachine) {
	this.roomNo=roomNo;
	this.roomType=roomType;
	this.roomArea=roomArea;
	this.acMachine=acMachine;
	}

	void displayData() {
	System.out.println("RoomNo:"+this.roomNo+ "\rType: "+this.roomType+"\rArea: "
	+this.roomArea+"\rAc/NonAc:" +this.acMachine);
	}

	public static void main(String args[]) {
	Room R1= new Room();
	Room R2=new Room();
	R1.setData(1,"AC",100,true);
	R2.setData(2,"NonAc",200,false);
	R1.displayData();
	R2.displayData();
	}//end of main
}