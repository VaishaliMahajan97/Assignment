package Assessment;

public class DogBiteException  extends RuntimeException {
public String getMessage()
{
	return "dog bites u";//go to the hospital
	
	}
	
}
class DogRunException  extends RuntimeException
{
	public String getMessage()
	{
	return "dog is running ";//you have to be happy
	}
}
class  DogEatException  extends RuntimeException
{
	public String getMessage()
	{
	return "dog is eating buscuit but u have to be careful boc he can bite u";
	}
}
	
	