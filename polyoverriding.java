package demo;
class car{
	 int speed(){
		return 100;
	}
}
class maruti extends car{
	int speed(){
		return 120;
	}
}
public class polyoverriding {
	public static void main(String[] args){
		car obj=new maruti();
		int num=obj.speed();
		System.out.println("Speed limit is=" +num);		
	}
}
