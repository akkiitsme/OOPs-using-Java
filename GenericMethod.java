package generic;

public class GenericMethod {
	static<T> void genericDisplay(T element){
		System.out.println(element.getClass().getName()+"="+element);
	}
public static void main(String[] args){
	genericDisplay(1);
	genericDisplay("Akshay");
	genericDisplay(30.55);
}
}
