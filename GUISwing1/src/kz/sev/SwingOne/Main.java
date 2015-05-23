package kz.sev.SwingOne;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) 
	{
		Form1 f1 = new Form1("Справочник");
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f1.setSize(500, 250);
		f1.setSize(300, 200);
		f1.setResizable(true);
		f1.setLocationRelativeTo(null);
		
	}

}
