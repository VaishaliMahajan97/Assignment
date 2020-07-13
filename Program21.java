package assignmentday1;

import java.util.Scanner;

public class Program21
{
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the month");
  String month=scan.next();
	
	switch(month)
	{
	case "jan":
		System.out.println("31 days in this month");
		break;
	case "march":
		System.out.println("31 days in this month");
		break;
	case "may": 
		System.out.println("31 days in this month");
		break;
	case "july":
		System.out.println("31 days in this month");
		break;
	case "aug":
		System.out.println("31 days in this month");
		break;
	case "oct":
		System.out.println("31 days in this month");
		break;
	case "dec":
		System.out.println("31 days in this month");
		break;
	case "april":
		System.out.println("30 days in this month");
		break;
	case "june":
		System.out.println("30 days in this month");
		break;
	case "sept":
		System.out.println("30 days in this month");
		break;
	case "nov":
		System.out.println("30 days in this month");
		break;
	case "feb":
		System.out.println("enter the year");
		int year=scan.nextInt();
		if(year %4==0||year%400==0)
		{
			System.out.println("it is a leap year");//if 29 days present in feb it is a lear year
		}
		else
		{
			System.out.println("not  a leap year");//if 28 days present
		}
	
	}
}
}
