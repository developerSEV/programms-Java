package kz.sev.GUISwing2;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.border.BevelBorder;


public class Form1 extends JFrame
{
	JTextField t1;
	JButton b1;
	JTable table;
	JScrollPane scrollPane;
	TableModel model;
	
	eHandler hendler = new eHandler();

	public Form1(String s) 
	{
		super(s);
		
		b1 = new JButton("Œ ");
		b1.setBounds(10, 51, 89, 23);
		getContentPane().add(b1);
		
		t1 = new JTextField();
		t1.setBounds(109, 52, 86, 20);
		getContentPane().add(t1);
		
		
		String[] columnNames = {
			     "Name",
			     "Last modified",
			     "Type",
			     "Size"
			}; 
		
		String[][] data = {};
	
		b1.addActionListener(hendler);
		
		
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 96, 414, 249);
		getContentPane().add(scrollPane);
		
		//table = new JTable(data,columnNames);
		
		
		/*TableColumn column1 = new TableColumn();
        column1.setHeaderValue("id");
        table.addColumn(column1);
        
        TableColumn column2 = new TableColumn();
        column2.setHeaderValue("name");
        table.addColumn(column2);*/
        
        model = new DefaultTableModel(data, columnNames);
        
        table = new JTable(model);
		/*LinkedList columnNames = new LinkedList<String>();
        columnNames.add("id");
        columnNames.add("name");*/
        
		
		table.setColumnSelectionAllowed(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 394);
		setResizable(true);
		setLocationRelativeTo(null);
	}
	
	
	public class eHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			
			if(e.getSource() == b1)
			{
			   Click_b1(table);
			}
			
			
		}
		
	}
	
	
	private void Click_b1(JTable t)
	{
		int c = 0;
		int r = 0;
	
		int[][] mas = {{1,2,3},{3,2,1},{2,1,3}};
		
		DefaultTableModel dtm = new DefaultTableModel();
		dtm = (DefaultTableModel)t.getModel();
		
		//TableColumn column = new TableColumn();
        //column.setHeaderValue("Name");
		
		for(r = 0; r < mas.length; r++)
		{	
			dtm.setRowCount(dtm.getRowCount() + 1);
			
			c = 0;
			for(c = 0; c < mas[r].length; c++)
			{
				String z = Integer.toString(mas[r][c]);
				//t[c]["id"] = z;
				//model.setValueAt(z, r, c);
				
				
				dtm.setValueAt(z, r, c);
				//dtm.insertRow(r, mas);
				//t.setValueAt(z, r, c);
				
			}
			
			//t.setModel(model);
		
			
		}
	}
}
