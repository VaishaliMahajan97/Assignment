package assignmentday1;

public class Program17 {

	//to acess static in non-static method
	//we can acess static member in non static method
	static int a=10;
	void test()
	{
		System.out.println(Program17.a);
	}
	//argument constructor calling withiout calling parameterize object creation
	//we  cannot call parameterize constructor without parameterize object creation
	Program17(int b)
	{
		System.out.println("this is a parameterize constructor");
	}
	public static void main(String[] args) 
	{
		//modify const member
		Program17 p=new Program17();
		p.test();

	}

}
