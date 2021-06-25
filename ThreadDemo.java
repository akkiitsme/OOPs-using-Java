package threading;
class MyThread extends Thread{
	public void run(){
		for(int i=1; i<=5; i++){
			try{
				Thread.sleep(4000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class ThreadDemo {
	public static void main (String args[]){
		MyThread a1=new MyThread();
		a1.start();
		MyThread a2=new MyThread();
		a2.start();
	}
}
