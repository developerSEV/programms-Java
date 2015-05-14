package kz.sev.ArrayBlockingQueueThreads;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Main 
{
	//private static ArrayList<Object> list = new ArrayList<Object>();
	private static ArrayBlockingQueue<Object> list = new ArrayBlockingQueue<Object>(1000);

	public static void main(String[] args) {
		addObject();
		Proceed();

	}

	private static void addObject() 
	{
		for (int i = 0; i < 5; i++) 
		{
           list.add(new Object());
		}
	}

	private static void Proceed() 
	{
       System.out.println(list.size());
       
       
		/*while (list.size() != 0) 
		{
			Object obj = null;

			for (Object element : list) 
			{
				// list.remove(element);
				// element.toString();
				 obj = element;
				 break;
			}
			
			list.remove(obj);
		}*/
       
       for (Object element : list) 
	   {
    	   //try
    	   //{
    	       list.remove(element);
    	   //}catch(Exception e){};
    			   
	   }
       
       System.out.println(list.size());
	}

}
