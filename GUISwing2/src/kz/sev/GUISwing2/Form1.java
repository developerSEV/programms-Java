package kz.sev.GUISwing2;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.JPanel;


public class Form1 extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JTextField t1;
	private JButton b1;
	private JTable table;
	private JScrollPane scrollPane;
	
	eHandler hendler = new eHandler();

	public Form1(String s) 
	{
		super(s);
		getContentPane().setLayout(null);
		
		
		b1 = new JButton("ОК");
		b1.setBounds(10, 51, 89, 23);
		getContentPane().add(b1);
		
		t1 = new JTextField();
		t1.setBounds(109, 52, 86, 20);
		getContentPane().add(t1);
		
			
		b1.addActionListener(hendler);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 96, 414, 249);
		getContentPane().add(scrollPane);
		
		/*TableColumn column1 = new TableColumn();
        column1.setHeaderValue("id");
        table.addColumn(column1);
        
        TableColumn column2 = new TableColumn();
        column2.setHeaderValue("name");
        table.addColumn(column2);*/
		
		/*LinkedList columnNames = new LinkedList<String>();
        columnNames.add("id");
        columnNames.add("name");*/
        
		String[] columnNames = {"id","name","sale"};
		String[][] data      = null;
		
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		
		/*model.setDataVector(new Object[][]{{"button 1","foo"},
                {"button 2","bar"}},
 new Object[]{"Button","String"});*/
        
        table = new JTable(model);
        
        //JButton myButton = new JButton("...");
        
        
        //table.getColumn("Button").setCellRenderer(new ButtonRenderer());
        //table.getColumn("Button").setCellEditor(new ButtonEditor(new JCheckBox()));
        
		table.setColumnSelectionAllowed(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		/*JComboBox combo = new JComboBox();
        combo.addItem("Склад №1");
        combo.addItem("Склад №2");
        
        table.getColumn("sale").setCellEditor(new DefaultCellEditor(combo));*/
		
		
		//table.getColumn("sale").setCellEditor(null);
		
		table.getColumn("sale").setCellRenderer(new TableCellRenderer() 
		{
	        public Component getTableCellRendererComponent(JTable table, Object value,
	                boolean isSelected, boolean hasFocus, int row, int column) 
	        {
	            JPanel buttonPanel = new JPanel(new BorderLayout());//new BorderLayout()
	            buttonPanel.setBackground(Color.white);
	            JButton button = new JButton("..");
	            buttonPanel.add(button,BorderLayout.EAST);
	            //isSelected = true;
	            return buttonPanel;
	        }
	        
		});
		
		table.getColumn("sale").setCellEditor(new TableCellEditor() {
	        public boolean stopCellEditing() {return false;}
	        public boolean shouldSelectCell(EventObject arg0) {return false;}
	        public void removeCellEditorListener(CellEditorListener arg0) {}
	        public boolean isCellEditable(EventObject arg0) {return true;}
	        public Object getCellEditorValue() {return null;}
	        public void cancelCellEditing() {}
	        public void addCellEditorListener(CellEditorListener arg0) {}
	        public Component getTableCellEditorComponent(JTable arg0, Object arg1,
	                boolean arg2, int arg3, int arg4) {
	        	JOptionPane.showMessageDialog(null, "OK");
	            //JFrame frame = new JFrame();
	            //frame.setVisible(true);
	            return null;}
	    });
		
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
			   Click_b1();
			}
			
			
		}
		
	}
	
	/*public class ButtonRenderer extends JButton implements TableCellRenderer {
		  
		  public ButtonRenderer() {
		    setOpaque(true);
		  }
		   
		  public Component getTableCellRendererComponent(JTable table, Object value,
		                   boolean isSelected, boolean hasFocus, int row, int column) {
		    if (isSelected) {
		      setForeground(table.getSelectionForeground());
		      setBackground(table.getSelectionBackground());
		    } else{
		      setForeground(table.getForeground());
		      setBackground(UIManager.getColor("Button.background"));
		    }
		    setText( (value ==null) ? "" : value.toString() );
		    return this;
		  }
		}
	
	public class ButtonEditor extends DefaultCellEditor {
		  protected JButton button;
		  private String    label;
		  private boolean   isPushed;
		  
		  public ButtonEditor(JCheckBox checkBox) {
		    super(checkBox);
		    button = new JButton();
		    button.setOpaque(true);
		    button.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        fireEditingStopped();
		      }
		    });
		  }
		  
		  public Component getTableCellEditorComponent(JTable table, Object value,
		                   boolean isSelected, int row, int column) {
		    if (isSelected) {
		      button.setForeground(table.getSelectionForeground());
		      button.setBackground(table.getSelectionBackground());
		    } else{
		      button.setForeground(table.getForeground());
		      button.setBackground(table.getBackground());
		    }
		    label = (value ==null) ? "" : value.toString();
		    button.setText( label );
		    isPushed = true;
		    return button;
		  }
		  
		  public Object getCellEditorValue() {
		    if (isPushed)  {
		      // 
		      // 
		      JOptionPane.showMessageDialog(button ,label + ": Ouch!");
		      // System.out.println(label + ": Ouch!");
		    }
		    isPushed = false;
		    return new String( label ) ;
		  }
		    
		  public boolean stopCellEditing() {
		    isPushed = false;
		    return super.stopCellEditing();
		  }
		  
		  protected void fireEditingStopped() {
		    super.fireEditingStopped();
		  }
		}*/
	
	private void Click_b1()
	{
		int c = 0;
		int r = 0;
	
		int[][] mas = {{1,2,3},{3,2,1},{2,1,3}};
		
		DefaultTableModel dtm = new DefaultTableModel();
		dtm = (DefaultTableModel)table.getModel();
		dtm.setRowCount(0);
	
		for(r = 0; r < mas.length; r++)
		{	
			dtm.setRowCount(dtm.getRowCount() + 1);
			
			c = 0;
			for(c = 0; c < mas[r].length; c++)
			{
				String z = Integer.toString(mas[r][c]);
				dtm.setValueAt(z, r, c);
			}
		
			
		}
	}
}
