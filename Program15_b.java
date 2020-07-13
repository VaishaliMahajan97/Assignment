package assignmentday1;

import java.util.Scanner;

public class Program15_b {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to be check");
		int num=scan.nextInt();
		int num1=num;
		int num2=num;
		int temp; int sum;int r;int sum2=0;
		int i=1;int j=1;
		int n=0;
		sum=0;
		int total=0;
		i=num;
		while(num>0)
		{
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
		}
		if(sum==i)
		{
			System.out.print(" number  is Armstrong");
		}
//		System.out.println("check no is perfect or not");
			while(j<num1)
			{
				if(num1%j==0)
				{
					total=total+j;
				}
				j++;
			}
			if(total==num1)
			{
				System.out.println("number is perfect");
			}
//			System.out.println("check palindrom or not");
				temp=num2;
				while(num2>0)
				{
					r=num2%10;
					sum2=(sum2*10)+r;
					num2=num2/10;
					
				}
				if(temp==sum2)
				{
					System.out.println("number is palindrome");
				}
				else
				{
					System.out.println("no is not palindrome");
				}
			}
		

	}


