package kz.sev.SwingOne;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Form1 extends JFrame
{
   public Form1(String s)
   {
	   super(s);
	   
	   setLayout(null);
	   
	   JScrollPane jsp = new JScrollPane();
	   jsp.setBounds(1, 1, 200,100);
	   add(jsp);
	   
	   JTextArea jta = new JTextArea();
	   String txt = "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
	   
	   jta.setText(txt);
	   
	   jsp.setViewportView(jta);
   }
}
