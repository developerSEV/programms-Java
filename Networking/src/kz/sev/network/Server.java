package kz.sev.network;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class Server implements Runnable
{
	static private Socket conn;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	static private ServerSocket server;
	public static final int PORT = 5678; // 8080
	
	

	public void run() 
	{
		    	
		    try
			{
		    	
		    	server = new ServerSocket(PORT,10); // ������ ���. ����, ������ ���-�� �����.
		    		
		        while(true)
				{
		        	System.out.println("�����: server");
		        	
		    	    
				    //System.out.println("������� ������: " + server);
				    conn = server.accept();
				
		    	    output = new ObjectOutputStream(conn.getOutputStream());
		    	    input = new ObjectInputStream(conn.getInputStream());
		            output.writeObject((String)input.readObject());
		        
		            conn.close();

		         }
		
		        
			}catch(UnknownHostException e){
			}catch(IOException e){
			}catch (HeadlessException e){
			}catch (ClassNotFoundException e){};

     }
	
}
	
