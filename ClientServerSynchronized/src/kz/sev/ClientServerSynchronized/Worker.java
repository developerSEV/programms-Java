package kz.sev.ClientServerSynchronized;

import java.util.ArrayList;
import java.util.Random;

public class Worker 
{
	private ArrayList<Integer> list1 = new ArrayList<Integer>();
	private ArrayList<Integer> list2 = new ArrayList<Integer>();
	private Random random            = new Random();
	private Object Obj1              = new Object();
	private Object Obj2              = new Object();
	
	private void outPart() //synchronized - если в одном методе синх., то быстрее, но объекты пустые надежнее
	{
		synchronized(Obj1)
		{
			try 
			   {
				    Thread.sleep(1);
			   } catch (InterruptedException e) {e.printStackTrace();}
			   
			   list1.add(random.nextInt(100));	
		}	  
	}
	
	private void inPart()
	{
	    synchronized(Obj2)
		{
	       try 
	       {
			 Thread.sleep(1);
	       } catch (InterruptedException e) {e.printStackTrace();}
		   
		   list2.add(random.nextInt(100));
		 }
	}
	
	private void Process()
	{
	   for(int i = 0; i < 2000; i++)
	   {
		   outPart();
		   inPart();
	   }
	}
	
    public void Start()
	{
		System.out.println("Начинаем ...");
		long starttime = System.currentTimeMillis();
		//Process();
		Thread t1 = new Thread(new Runnable(){

			public void run() 
			{
				Process();				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			public void run() 
			{
				Process();				
			}
			
		});
		
		t1.start();
		t2.start();
		
		try 
		{
			t1.join();
			t2.join();
		} catch (InterruptedException e) {e.printStackTrace();}
		
		long endttime = System.currentTimeMillis();
		System.out.println("Потраченное время: "+(endttime - starttime)+"\n"
				+ "Лист 1: "+list1.size()+"\n"
				+ "Лист 2: "+list2.size());
	}

}
