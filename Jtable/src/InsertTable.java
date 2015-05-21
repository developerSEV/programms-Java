import javax.swing.*;

import java.util.*;

public class InsertTable 
{
	
	public InsertTable(JTable t)
	{

		int c = 0;
		int r = 0;
		//int[][] mas = new int[3][3];
		int[][] mas = {{1,2,3},{3,2,1},{2,1,3}};
		Scanner scn = new Scanner(System.in);
		
		//do
		//{

		//	c = 0;
		//	do
		//	{
				
		//		System.out.print("Введите строку массива ["+r+"] в колонке ["+c+"]: ");
		//		mas[r][c] = scn.nextInt();					
		//		c++;
		//		
		//		
		//	}while(c < mas[r].length);
		//	
		//	r++;
			
		//}while(r < mas.length);
		
		
		//t = new JTable(mas,columns);
		//DataModel tm = new DataModel();
		
		//tm.setValueAt(mas);
		//t.setModel(tm);
		//t.setValueAt(mas, r, c);
		
		
		
		for(r = 0; r < mas.length; r++)
		{
			
			//System.out.println();
			
			c = 0;
			for(c = 0; c < mas[r].length; c++)
			{
				//System.out.print(Integer.toString(mas[r][c]) + "  ");
				String z = Integer.toString(mas[r][c]);
				t.setValueAt(z, r, c);
				//t.addRowSelectionInterval(r, c);
				//t.setValueAt(r, c, 10);
				
				//try
				//{			
				    //Thread.sleep(200);
				//}catch(Exception e){}
				
			}
			
		}
		
		
		//JOptionPane.showMessageDialog(null, "Заполнение таблицы завершено !");
	}

}
