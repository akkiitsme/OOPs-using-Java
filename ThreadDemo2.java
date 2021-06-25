package threading;
class MyThread2 implements Runnable{
	public void run(){
		for(int i=1; i<=5; i++){
			try{
				Thread.sleep(5000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class ThreadDemo2 {
	public static void main(String args[]){
		MyThread2 a1=new MyThread2();
		Thread b1=new Thread(a1);
		b1.start();
		
		new MyThread2();
		Thread b2=new Thread(a1);
		b2.start();
	}
}
