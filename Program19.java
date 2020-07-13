package assignmentday1;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of rows student");
		int rows=scan.nextInt();
		System.out.println("Enter no of   column marks");
		int col=scan.nextInt();
		
		int arr[][]=new int[rows][col];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		//printing array element
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//reversing row element 
		
		for (int i = 0; i < rows; i++) {
			
			int start=0;
			int end=col-1;
			while(start<end)
			{
				int temp=arr[i][start];
				arr[i][start]=arr[i][end];
				arr[i][end]=temp;
				start++;
				end--;
			}
				}
		//printing reverse array
		System.out.println("reversed row element of array");
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
			
		}

}
