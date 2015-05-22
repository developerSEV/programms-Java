package kz.sev.GUISwing2;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;

public class Form1 extends JFrame
{

	public Form1(String s) 
	{
		super(s);
		
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(500,300); //new Dimation(300,500)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 484, 1);
		getContentPane().add(layeredPane);
		
		JButton b1 = new JButton("Œ ");
		b1.setBounds(10, 51, 89, 23);
		getContentPane().add(b1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(109, 55, 113, 16);
		getContentPane().add(textArea);
	}
}
