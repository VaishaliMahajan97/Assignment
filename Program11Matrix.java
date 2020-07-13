package assignmentday1;

public class Program11Matrix {

	public static void main(String[] args) {
		int arr[][]=new int[4][4];
		arr[0][0]=1;
		arr[1][0]=2;
		arr[1][1]=3;
		arr[2][0]=4;
		arr[2][1]=5;
		arr[2][2]=6;
		arr[3][0]=7;
				arr[3][1]=8;
				arr[3][2]=9;
				arr[3][3]=10;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}

	}

}
