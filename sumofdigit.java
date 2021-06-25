import java.util.Scanner;
public class sumofdigit {
	public static void main(String args[])
	{
		int num,sum=0,temp;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=input.nextInt();
		while(num>0)
		{
			temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		System.out.println("Sum of digits:"+sum);
	}
}
