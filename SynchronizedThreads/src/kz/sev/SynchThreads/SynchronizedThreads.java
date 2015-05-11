package kz.sev.SynchThreads;

public class SynchronizedThreads {
	
	private static int num;

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Worker());
        t1.start();
        
        Thread t2 = new Thread(new Worker());
        t2.start();
        
        try 
        {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {e.printStackTrace();}
        
        
        System.out.println(num);
	}
	
	public static synchronized void PlusNum()
	{
		num++;
	}

}
