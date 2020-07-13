package assignmentday1;

public class FindArrayIndex {

	
	static int findArrayIndex(int arr[],int n)
	{
		if(arr==null)
		{
			return -1;
		}
		int len=arr.length;
		int i=0;
		while(i<len)
		{
			if(arr[i]==n)
			{
				return i;
			}
			else
			{
				i=i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
int arr1[]= {6,4,8,7,2,9,3};
System.out.println("index of  6 is: "+findArrayIndex(arr1,6));
System.out.println("index of  9 is: "+findArrayIndex(arr1,9));



	}

}
