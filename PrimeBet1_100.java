package assignmentday1;

public class PrimeBet1_100 {

	public static void main(String[] args) {
		int n=100;
		int num=1;
		int count=0;
		while(num<=n)
		{
			for (int i = 1; i <=num; i++) {
				if(num%i==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.print(" "+num);
			}
			count=0;num++;
		}

	}

}
