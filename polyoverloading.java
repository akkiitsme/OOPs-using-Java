package demo;
class addition{
	void sum(int a,int b){
		int j=a+b;
		System.out.println("Sum of a+b=" +j);
	}
	void sum(int a,int b,int c){
		int k=a+b+c;
		System.out.println("Sum of a+b+c=" +k);
	}
}
public class polyoverloading {
	public static void main(String[] args){
		addition a=new addition();
		a.sum(10, 20);
		a.sum(100, 200, 300);
	}
}
