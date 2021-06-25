import java.util.Scanner;
public class Menudriven {
	public static void main(String[] argvs)
	{
		int ch,num,sum=0,rev=0,temp,rem,a;
		Scanner input=new Scanner(System.in);
			System.out.println("1.TABLE");
			System.out.println("2.SUM OF DIGIT");
			System.out.println("3.REVERSE");
			System.out.println("4.ARMSTRONG");
			System.out.println("5.PALINDROME");
			System.out.println("6.QUIT");
			System.out.println("ENTER YOUR CHOICE:");
			ch=input.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter any number:");
				num=input.nextInt();
				for(int i=1; i<=10; i++)
					System.out.println(num*i);
			break;
			case 2:
				System.out.println("Enter any number:");
				num=input.nextInt();
				while(num>0)
				{
					temp=num%10;
					sum=sum+temp;
					num=num/10;
				}
				System.out.println("Sum of digits:"+sum);
			break;	
			case 3:
				System.out.println("Enter a number:");
				num=input.nextInt();
				while(num>0)
				{
					temp=num%10;
					rev=rev*10+temp;
					num=num/10;		
				}
				System.out.println("Reverse="+rev);
			break;	
			case 4:
				System.out.println("Enter any number:");
				num=input.nextInt();
				temp=num;
				while(num>0)
				{
					a=num%10;
					num=num/10;
					sum=sum+(a*a*a);
				}
				if(temp==sum)
					System.out.println("Armstrong number");
				else
					System.out.println("Not Armstrong number");
			break;	
			case 5:
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
			break;
			case 6:System.exit(0);
			default:System.out.println("!!WRONG INPUT");	
			}//end of switch case
	}//end of main function
}
