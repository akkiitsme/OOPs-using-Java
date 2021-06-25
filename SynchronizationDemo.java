package threading;
class Test{
	synchronized void method(){
		for(int i=1; i<=5; i++){
			try{
				Thread.sleep(5000);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(i*i);
		}
	}
}
public class SynchronizationDemo {
	public static void main(String args[]){
		final Test obj=new Test();
		Thread t1=new Thread(){
			public void run(){
				obj.method();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				obj.method();
			}
		};
		t1.start();
		t2.start();
	}
}
