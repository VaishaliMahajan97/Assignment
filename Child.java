package Assessment;

class Child
{
	public void connect(Item i)
	{
		i.connect();
	}
	}
abstract class Item
{
	abstract void connect();
	}
class Stick extends Item
{ 
	
	void connect() 
	{
		try {
		throw new DogBiteException();
		}
		catch(Exception e)
		{
			DogBiteException d=new DogBiteException();
			String s=d.getMessage();
			System.out.println(s);
		new StickHandle().handle();	
		}
		
	}
	}
class Stone extends Item
{
	void connect()
	{
		try
		{
		
		throw new DogRunException();
		}
		catch(Exception e)
		{
			DogRunException d1=new DogRunException();
			String s1=d1.getMessage();
			System.out.println(s1);
		new StoneHandle().handle();	
		}
	
	}
	
	}
class Buscuit extends Item
{
	void connect()
	{
		try
		{
	throw new DogEatException();
		}
	catch(Exception e)
	{
		DogEatException d2=new DogEatException();
		String s2=d2.getMessage();
		System.out.println(s2);
	new BuiscuitHandle().handle();	
	}
	
	}
	}
