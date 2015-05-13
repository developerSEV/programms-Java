package kz.sev.network;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Handler;


public class Networking extends JFrame implements Runnable 
{

	static private Socket conn;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    String ftxt;
    boolean t;
    JButton b1 = new JButton("Отправить клиент №1");
    JButton b2 = new JButton("Отправить клиент №2");
    eHandler hendler = new eHandler();
	//static private Thread t01;
	//static private Thread t02;
	
	public static void main(String[] args)
    {		
		Thread t01 = new Thread(new Networking("Клиент-Сервер"));
		Thread t02 = new Thread(new Server());
		
		t01.start();
		t02.start();
		//new Thread(new Networking("Клиент-Сервер")).start();
		//new Thread(new Server()).start();
      
	
	}
	
	void setField(String str)
	{
		if(ftxt == "t1")
		{
	       t1.setText(str);
		}
		
		if(ftxt == "t2")
		{
	       t2.setText(str);
		}
	}
	
	
	public Networking(String name)
	{
        super(name);
        setLayout(new FlowLayout());
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        //JTextField t1 = new JTextField(10);
        //JTextField t2 = new JTextField(10);
        //JButton b1 = new JButton("Отправить клиент №1");
        //JButton b2 = new JButton("Отправить клиент №2");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        b2.addActionListener(hendler);
		b1.addActionListener(hendler);
        
	
        /*b1.addActionListener(new ActionListener()
        {

			public void actionPerformed(ActionEvent arg0) 
			{
				
				if(arg0.getSource() == b1)
				{
					t = t1;
					SendMsg(t.getText());
				}
				
				if(arg0.getSource() == b2)
				{
					System.out.println("B2");
					t = t1;
					SendMsg(t.getText());
				}
				
			}
        	
        	
        });*/
	}
	
    public class eHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			
			if(e.getSource() == b1)
			{
				//t = t2;
				//t2.setText(null);
				//t = true;
				ftxt = "t2";
				SendMsg(t1.getText());
			}
			
			if(e.getSource() == b2)
			{
				//t = t1;
				//t1.setText(null);
				//t = false;
				ftxt = "t1";
				SendMsg(t2.getText());
			}
			
		}
		
	}


	public void run() 
	{
		
		    //conn = new Socket(InetAddress.getByName("127.0.0.1"),5678);
			//conn = new Socket(InetAddress.getByName(null),3260);
		try
		{
				
		    while(true)
		    {
		    	System.out.println("поток client");
		    	
		    	conn = new Socket(InetAddress.getByName("127.0.0.1"),Server.PORT);
		    	
		    	//conn = new Socket(InetAddress.getByName("37.150.210.62"),Server.PORT);
		    	output = new ObjectOutputStream(conn.getOutputStream());
		    	input = new ObjectInputStream(conn.getInputStream());
		    	
		    	setField((String)input.readObject());
				
				conn.close();
				
		    }
		    
		}catch(UnknownHostException e){
		}catch(IOException e){
		}catch (HeadlessException e){
		}catch (ClassNotFoundException e){};
		
		//}catch(Exception e){JOptionPane.showMessageDialog(null, "NOT");};
		
		
	}
	
	private static void SendMsg(Object obj)
	{
		//t1.start();
		//t2.start();
		
		try
		{
		output.flush();
		output.writeObject(obj);
		}catch(IOException e){};
				
		
	}

}
