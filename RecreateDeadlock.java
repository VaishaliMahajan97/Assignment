package Assessment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RecreateDeadlock {

	

	public static void main(String[] args) {
		Frog frog=new Frog();
		Crane crane=new Crane();
		ExecutorService  es=Executors.newFixedThreadPool(1);
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				frog.escape(crane);
				
				
			}
		});
	
		es.shutdown();
	}


}

class Crane
{
	synchronized void eat(Frog frog)
	{
		System.out.println();

		frog.leaveHand();
	}
	synchronized void spit()
	{
		
	}
	}
class Frog
{
	synchronized void escape(Crane crane)
	{
		crane.spit();
	}
	synchronized void leaveHand()
	{
	
	}
}