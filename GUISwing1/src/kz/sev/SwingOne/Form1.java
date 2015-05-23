package kz.sev.SwingOne;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Form1 extends JFrame
{
	JButton b1;
	JTextField t1;
	JTable table1;
	
   public Form1(String s)
   {
	   super(s);
	   
	   setLayout(null);
	   //setLayout(new FlowLayout());
	   
	   /*setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setSize(300, 200);
	   setResizable(true);
	   setLocationRelativeTo(null);*/
	   //setSize(300,200);
	   //setVisible(true);
	   
	   /*setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setSize(500, 250);
	   setResizable(true);
	   setLocationRelativeTo(null);*/
	   
	   b1 = new JButton("OK");
	   b1.setBounds(5, 5, 100, 30);
	   
	   t1 = new JTextField();
	   t1.setBounds(110,5, 100, 30);
	   
	   table1 = new JTable(10,10);
	   table1.setBounds(5, 50, 200, 100);
	   
	   add(b1);
	   add(t1);
	   add(table1);
	   /*JScrollPane jsp = new JScrollPane();
	   jsp.setBounds(1, 1, 200,100);
	   add(jsp);
	   
	   JTextArea jta = new JTextArea();
	   String txt = "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
	   
	   jta.setText(txt);
	   
	   jsp.setViewportView(jta);*/
   }
}
