package threading;
class MyThread3 extends Thread{
	int a=2;
	public void run(){
		synchronized(this){
			System.out.print("\rCalculation Started");
			for (int i=0; i<=5; i++){
				a=a+i;
			}
			System.out.print("\rHello");
			this.notify();
		}
	}
}
public class InterThread {
	public static void main(String args[]) throws InterruptedException{
		MyThread3 t1=new MyThread3();
		t1.start();
		synchronized(t1){
			System.out.print("Calling wait method");
			t1.wait();
			System.out.print("\rMain thread calling");
			System.out.print("\rTotal= "+t1.a);
		}
	}
}
