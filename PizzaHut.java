package incrementalAssignment;
class costumer {
	int custNo=10;
	String custName="Akshay";
	String CustAddress="kanpur";
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return CustAddress;
	}
	public void setCustAddress(String custAddress) {
		this.CustAddress = custAddress;
	}
	void init(){
		setCustNo(custNo);
		setCustName(custName);
		setCustAddress(CustAddress);
	}
	public void display(){
		System.out.println("Costumer Number: "+getCustNo());
		System.out.println("Costumer Name: "+getCustName());
		System.out.println("Costumer Address: "+getCustAddress());
	}
}
public class PizzaHut {
	public static void main(String args[]){
		costumer obj=new costumer();
		obj.init();
		obj.display();	
	}
}
