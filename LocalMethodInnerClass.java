package demo;
class OuterNew{
	void newmethod(){
		class InnerNew{
			int num=10;
			 void show(){
				System.out.print("I'm Local Inner class=" +num);
			}
		}
		InnerNew inner=new InnerNew();
		inner.show();
	}
}
public class LocalMethodInnerClass {
	public static void main(String args[]){
		OuterNew outer =new OuterNew();
		outer.newmethod();
	}
}
