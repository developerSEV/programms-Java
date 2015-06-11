import javax.swing.JFrame;


public class Calculator 
{
	
	public static void main(String args[])
	{
	
	ShowForm sf = new ShowForm("Калькулятор"); 
	
	//sf.resTextField.setSize(100, 100);
	//sf.b_cls_all.setSize(1, 1);
	
	sf.setVisible(true);
	sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	sf.setSize(200, 300);
	sf.setResizable(false);
	sf.setLocationRelativeTo(null);
	
	}

}
