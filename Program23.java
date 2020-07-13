package assignmentday1;

public class Program23 {

	//static
	protected int i=10;
	public static void main(String[] args) {
	

	}

}
//with extends (with inheritance) protected can be access within the package
class ProtectedDemo //extends Program23
{
	
	Program23 p=new Program23();

	void test()
	{
		//for static 
		//System.out.println(Program23.i);
		//for non-static
		System.out.println(p.i);
	}
	}