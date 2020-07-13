package assignmentday1;

import java.util.Scanner;

public class AverageOfNum {
int num=0;
static int size1;
	void test(int a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			num=num+a[i];
		}
		System.out.println(num);
		int average=num/size1;
		System.out.println("average of all the numbers is: "+average);
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter total elements");
		int size=scan.nextInt();
		size1=size;
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=scan.nextInt();
		
		}
		
		AverageOfNum a=new AverageOfNum();
		a.test(arr);

	}

}
