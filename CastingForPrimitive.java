package assignmentday1;

public class CastingForPrimitive {

	public static void main(String[] args) {
		byte b=10;
	     short s=45;
	     int a=67;
	     long c=937035362l;
	     float d=34.8f;
	     double e=56.86;
//	     char f='c';
//	     boolean g=false;
	     //implicit type casting
	     short a1=b;
	     System.out.println(a1);
	     int a2=s;
	     System.out.println(a2);
	     long a3=a;
	     System.out.println(a3);
	     float a4=c;
	     System.out.println(a4);
	     double a5=c;
	     System.out.println(a5);
	     float a6=b;
	     System.out.println(a6);
	     //explicit type casting
	     int a7=(int)c;
	     System.out.println(a7);
	     float a8=(float)e;
	     System.out.println(a8);
	     byte a9=(byte)a;
	     System.out.println(a9);
	     
	     

	}

}
