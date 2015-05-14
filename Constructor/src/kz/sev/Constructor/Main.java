package kz.sev.Constructor;

import javax.swing.JOptionPane;

public class Main 
{

	public static void main(String[] args) 
	{
		Elements e = new Elements(JOptionPane.showInputDialog(null),true);
		//Elements e2 = new Elements(true);
		
		//e.setName(JOptionPane.showInputDialog(null));
		//e.setChek(true);
		
		System.out.println(e.getName() +", "+e.getChek());
	}

}
