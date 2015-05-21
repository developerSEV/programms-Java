import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.AncestorListener;

public class ShowForm extends JFrame 
{
	
	JTable t;
	JButton b;
	GetJob Job = new GetJob();
	
	
	public ShowForm(String s)
	{
		super(s);
		setLayout(new FlowLayout());
		
		t = new JTable(3,3);
		b = new JButton("Запонить");
		
		add(t);
		add(b);
		
		//t.addAncestorListener(null);
		b.addActionListener(Job);
		
		
	}
	
	
	public class GetJob implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 
		{
			
			if(e.getSource() == b)
			{
				InsertTable inst = new InsertTable(t);
			}
			
		}
		
	}
	

}
