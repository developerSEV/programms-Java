package kz.sev.SynchThreads;

public class Worker implements Runnable 
{

	/*public Worker() 
	{
		
	}*/

	
	public void run() 
	{
		for(int i = 0; i < 2000; i++)
		{
			SynchronizedThreads.PlusNum();
		}

	}

}
