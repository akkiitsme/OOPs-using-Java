import java.util.Scanner;
public class Greaternumber {
	public static void main(String args[])
	{
		int n1,n2,n3,ln=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three numbers:");
		n1=input.nextInt();
		n2=input.nextInt();
		n3=input.nextInt();
		if(n1>=n2){
			if(n1>=n3)
				ln=n1;
			else
				ln=n3;
		} else{
			if(n2>=n3)
				ln=n2;
			else
				ln=n3;
		}
		System.out.print("Largest number="+ln);
	}
}
