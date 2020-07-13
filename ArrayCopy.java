package assignmentday1;

public class ArrayCopy {

	
	void copyOfArray(int arr1[])
	{
		System.out.println("Array copy elements are: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			
		}
	}
	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=4;
		arr[1]=5;
		arr[2]=9;
		arr[3]=19;
		arr[4]=36;
		System.out.println("Array elements are");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		ArrayCopy a=new ArrayCopy();
		a.copyOfArray(arr);
		

	}

}
