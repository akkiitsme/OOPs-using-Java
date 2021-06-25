package demo;
class student implements Cloneable{
	int rollNo;
	String name;
	float marks;
	student(int rollNo,String name,float marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	public Object clone()
	throws CloneNotSupportedException{
		return super.clone();
	}
}
public class ObjectCloning {
	public static void main(String args[])
		throws CloneNotSupportedException{
		student s1=new student(1,"Akshay",60);
		student s2=s1;
		System.out.print(s1.rollNo);
		System.out.print(s1.name);
		System.out.print(s1.marks);
		s2.name="Rahul";
		System.out.print(s1.name);
		System.out.print(s2.name);
		student s3=(student)s1.clone();
		s3.name="Manish";
		System.out.print(s3.name);
		System.out.print(s1.name);
	}
}
