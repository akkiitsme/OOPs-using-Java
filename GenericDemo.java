package generic;

public class GenericDemo<T> {
	T x;
	public GenericDemo(T x){
		super();
		this.x=x;
	}
	void show(){
		System.out.println(this.x);
		System.out.println(x.getClass().getName());
	}
public static void main(String args[]){
	GenericDemo<Integer> g1=new GenericDemo<Integer>(123);
	GenericDemo<String> g2=new GenericDemo<String>("Akshay");
	GenericDemo<Double> g3=new GenericDemo<Double>(50.505);
	GenericDemo<Float> g4=new GenericDemo<Float>((float) 30.5);
	g1.show();
	g2.show();
	g3.show();
	g4.show();
}
}
