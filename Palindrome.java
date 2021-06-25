import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args)
	{
		int sum=0,num,temp,rem;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=input.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Palindrome number");
		else
			System.out.println("Not Palindrome number");
	}
}