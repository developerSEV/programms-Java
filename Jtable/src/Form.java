import javax.swing.JFrame;


public class Form 
{

	public static void main(String args[])
	{
	   ShowForm sf = new ShowForm("������� �������� �������"); 
	   
	    sf.setVisible(true);
	    sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sf.setSize(500, 250);
		sf.setResizable(false);
		sf.setLocationRelativeTo(null);
	   
	}

}
