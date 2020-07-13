package assignmentday1;

import java.util.Scanner;

public class AscendingOrderArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
			//ascending order
			for (int j = 0; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(arr[j]>arr[k])
					{
						int num=arr[j];
						arr[j]=arr[k];
						arr[k]=num;
					}
					
					
				}
				
			}
			//printing ascending order
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]+" ");
				
			}
			//descending order
			for (int j = 0; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(arr[j]<arr[k])
					{
						int num=arr[j];
						arr[j]=arr[k];
						arr[k]=num;
					}
					
					
				}
				
			}
			//printing decsending order
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]+" ");
				
			}
			
		

	}

}
