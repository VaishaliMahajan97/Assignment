package assignmentday1;

public class Program16 {
	public static void main(String[] args) {
		
	
	int arr[]=new int[5];
	arr[0]=3;
	arr[1]=3;
	arr[2]=76;
	arr[3]=45;
	arr[4]=3;
	int search_element=3;
	int index=0;
	int count=0;
	for(int i=0;i<5;i++)
	{
		if(arr[i]==search_element)
		{
			index=i;
			count=count+1;
		}
	}
	System.out.println("position of element is: "+index);
	System.out.println("occurance of element: "+count);
	}
}
