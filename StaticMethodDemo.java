	public class StaticMethodDemo {
		int rollNo;
		static String studentTrainer;
		StaticMethodDemo(int rollNo){
		this.rollNo=rollNo;
		}
		static {
		studentTrainer = "Naresh chandra";
		}
		public void display() {
		System.out.println(rollNo+"\t"+studentTrainer);
		}
		static void changeTrainer(String name) {
		studentTrainer = name;
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodDemo s1 = new StaticMethodDemo(100);
		s1.display();
		StaticMethodDemo s2 = new StaticMethodDemo(200);
		s2.display();
		StaticMethodDemo.changeTrainer("Akshay singh");
		StaticMethodDemo s3 = new StaticMethodDemo(300);
		s3.display();
		s2.display();
		}
	}
