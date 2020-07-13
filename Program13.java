package assignmentday1;

public class Program13 {
	public static void main(String[] args) {
		String arr1[][]=new String[4][2];
		arr1[0][0]="Vishanvi";
		arr1[0][1]="Sanika";
		arr1[1][0]="25";
	    arr1[1][1]="35";
        arr1[2][0]="65";
		arr1[2][1]="45";
	    arr1[3][0]="65";
	    arr1[3][1]="54";
      int v1=Integer.parseInt(arr1[1][0]);

      int v2=Integer.parseInt( arr1[2][0]);
      int v3=Integer.parseInt(arr1[3][0]);
      int s1=Integer.parseInt(arr1[1][1]);
      int s2=Integer.parseInt(arr1[2][1]);
      int s3=Integer.parseInt(arr1[3][1]);
      for (int i = 0; i < arr1.length; i++) {
    	  for (int j = 0; j < arr1[i].length; j++) {
			System.out.print(arr1[i][j]+"\t\t ");
		}
    	  System.out.println();
		
	}
      int vresult=v1+v2+v3;
      System.out.println("Result of vaishnavi: "+vresult);
      
      int sresult=s1+s2+s3;
      System.out.println("Result of Sanika: "+sresult);
	}
}
