package assignmentday1;
//class cannot decalred with protected modifier
protected class Program25 {

	//method name should be in small letter
String Method()
{
	return "wow";
}

}
class derived
{
	public void useD()
	{
		Program25 p=new Program25();
		System.out.println("Program25 says, "+p.Method());
	}}
