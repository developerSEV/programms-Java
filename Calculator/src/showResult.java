import javax.swing.JOptionPane;


public class showResult 
{
	private double x;
	
	public double Result(String i, String j, String znak)
	{
		
		if(znak=="+")
		{
			try{
				
				double a = Double.parseDouble(i);
				double b = Double.parseDouble(j);
				
				x = a + b;
				
			}catch (Exception ex){ JOptionPane.showMessageDialog(null, "������� � ���� ����� !"); } 	
		}
		
		
		if(znak=="-")
		{
			try{
				
				double a = Double.parseDouble(i);
				double b = Double.parseDouble(j);
				
				x = a - b;
				
			}catch (Exception ex){ JOptionPane.showMessageDialog(null, "������� � ���� ����� !"); } 	
		}
		
		
		if(znak=="*")
		{
			try{
				
				double a = Double.parseDouble(i);
				double b = Double.parseDouble(j);
				
				x = a * b;
				
			}catch (Exception ex){ JOptionPane.showMessageDialog(null, "������� � ���� ����� !"); } 	
		}
		
		
		if(znak=="/")
		{
			try{
				
				double a = Double.parseDouble(i);
				double b = Double.parseDouble(j);
				
				x = a / b;
				
			}catch (Exception ex){ JOptionPane.showMessageDialog(null, "������� � ���� ����� !"); } 	
		}
		
		return x;
	}
	
}
