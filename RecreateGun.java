package Assessment;

	import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



	public class RecreateGun {
		public static void main(String[] args) {
			Gun gun=new Gun();

			ExecutorService  es=Executors.newFixedThreadPool(2);
			es.execute(new Runnable() {
				
				
				public void run() {
					for(int i=0;i<5;i++)
					{
						gun.shoot();
					}
					
					
				}
			});
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					for(int i=0;i<5;i++)
					{
						gun.fill();
					}
					
					
				}
			});
			es.shutdown();
		
		}
		}

	class Gun
	{
		boolean flag;
		synchronized public void fill()
		{
			if(flag)
			{
				try
				{
					wait();
				}
				catch(Exception e)
				{
					
				}}
				System.out.println("I am filling the gun");
				flag=true;
				notify();
			
		}
		synchronized public void shoot()
		{
			if(!flag)
			{
				try
				{
					wait();
				}
				catch(Exception e)
				{
					
				}
			}
			System.out.println("shoots the gun..");
			flag=false;
		notify();
		}
	}


