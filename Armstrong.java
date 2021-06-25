import java.util.Scanner;
public class Armstrong {
public static void main(String[] args)
{
	int sum=0,num,temp,a;
	Scanner input=new Scanner(System.in);
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
		System.out.println("Armsrong number");
	else
		System.out.println("Not Armstrong number");
}

}
