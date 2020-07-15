package Assessment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class RecreateThreadLocker {
	public static void main(String[] args) {
		ExecutorService  es=Executors.newFixedThreadPool(2);
		es.execute(new Runnable() {
			
			@Override
			public void run() {

				Laptop laptop=Locker.getLaptop("ramu");
				System.out.println(laptop);
			
				
			}
		});
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				Laptop laptop=Locker.getLaptop("somu");
				System.out.println(laptop);

				
			}
		});
		es.shutdown();
	}

}


class Locker
{
	static ThreadLocal  tlocal=new ThreadLocal();
	public static Laptop getLaptop(String name)
	{
		Laptop laptop=(Laptop) tlocal.get();
		if(laptop==null)
		{
		laptop=new Laptop(name);	
		tlocal.set(laptop);
		return laptop;
		}
			return laptop;
		
	}
	public static void removeLaptop()
	{
		tlocal.remove();
	}
	
	}
class Laptop
{
	String name;
	public Laptop(String name)
	{
		this.name=name;
	}
	public String getMessage()
	{
		return this.name;
	}
	}
