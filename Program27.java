package assignmentday1;

public class Program27 {

	public static void main(String[] args) {

		int investment=14000;
		System.out.println("initial investment is 14000");
		int val1=14000*40/100;
		int val2=investment+val1;
		System.out.println("after incresing 40% in one year: "+val2);
		int val3=val2-1500;
		System.out.println("after lost of 1500 in second year the investment is: "+val3);
		int val4=val3*12/100;
		int val5=val3+val4;
		System.out.println("after 12% incresed in third year the investment is:"+val5);
        int val6=val5-investment;
        //System.out.println("we get "+val6+" rs profit after 3 years so the investment is worth");

	}

}
