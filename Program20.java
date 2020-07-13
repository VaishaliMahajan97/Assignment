package assignmentday1;

//not completed

	import java.util.Scanner;

	public class Program20 
	{
	static void display(int result[],int n)
	{
		int i;
		for (int i1 = 0; i1 < n; i1++) {
			System.out.println(result[i1]+" ");
			
		}
	}
	public static void max_row(int mat[][],int row,int cols)
	{
		int i=0;
		int j;
		int max=0;
		int result[]=new int[row];
		while(i<row)
		{
			for (int j1 = 0; j1 < cols; j1++) {
				if(mat[i][j1]>max)
				{
					max=mat[i][j1];
				}
				
			}
			result[i]=max;
			max=0;
			i++;
		}
		display(result,row);
	}
	
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
			System.out.println("maximun element from each row");
				max_row(arr,rows,col);
			}
		
		}
	



