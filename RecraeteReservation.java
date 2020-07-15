package Assessment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RecraeteReservation {
	public static void main(String[] args) {
		
		ReservationCounter counter=new ReservationCounter();
		ExecutorService  es=Executors.newFixedThreadPool(2);
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				String s=counter.bookTicekt(1000);
				System.out.println(s);
				int rs=counter.giveChange();
				System.out.println("change given: "+rs);
				System.out.println("first thread");
				
			}
		});
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				String s=counter.bookTicekt(500);
				System.out.println(s);
				int rs=counter.giveChange();
				System.out.println("change given: "+rs);
				System.out.println("second thread");
				
			}
		});
		es.shutdown();
	}
	}

class ReservationCounter
{
	int amt;
	synchronized public String bookTicekt(int amt)
	{
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		return "ticket booked y..."+name;
		
	}
	synchronized public int giveChange()
	{
	Thread t=Thread.currentThread();
	String name=t.getName();
	System.out.println("change given to..."+name);
	return (amt-100);
	}
	}



	