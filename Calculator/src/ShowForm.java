import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ShowForm extends JFrame 
{

	JTextField resTextField;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b_plus,b_minus,b_umn,b_del,b_cls_all,b_cls_back,res,tochka;
	JLabel l;
	GetJob ShowJob = new GetJob();
	String i,j,znak = null;
	
	public ShowForm(String s)
	{
		super(s); // обращение к самому главному классу
		setLayout(new FlowLayout()); // расположение объектов формы поумолчанию
		
		resTextField = new JTextField(10);
		l            = new JLabel("Вид операции");
		tochka       = new JButton(" . ");
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b_plus     = new JButton(" + ");
		b_minus    = new JButton(" - ");
		b_umn      = new JButton(" * ");
		b_del      = new JButton(" / ");
		b_cls_all  = new JButton(" CE ");
		b_cls_back = new JButton(" <-- ");
		res        = new JButton(" = ");
		
		add(resTextField);
		add(l);
		add(b_cls_all);
		add(b_cls_back);
		add(b9);
		add(b8);
		add(b7);
		add(b6);
		add(b5);
		add(b4);
		add(b3);
		add(b2);
		add(b1);
		add(b0);
		add(tochka);
		add(b_plus);
		add(b_minus);
		add(b_umn);
		add(b_del);
		add(res);
		
		b_cls_all.addActionListener(ShowJob);
		b_cls_back.addActionListener(ShowJob);
		b9.addActionListener(ShowJob);
		b8.addActionListener(ShowJob);
		b7.addActionListener(ShowJob);
		b6.addActionListener(ShowJob);
		b5.addActionListener(ShowJob);
		b4.addActionListener(ShowJob);
		b3.addActionListener(ShowJob);
		b2.addActionListener(ShowJob);
		b1.addActionListener(ShowJob);
		b0.addActionListener(ShowJob);
		tochka.addActionListener(ShowJob);
		b_plus.addActionListener(ShowJob);
		b_minus.addActionListener(ShowJob);
		b_umn.addActionListener(ShowJob);
		b_del.addActionListener(ShowJob);
		res.addActionListener(ShowJob);
		
		
	}
	
	public class GetJob implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 
		{

			
			if(e.getSource()==tochka)
			{
				getZnak(".");
			}
			
			if(e.getSource()==b0)
			{		
				getZnak("0");
			
			}
			
			if(e.getSource()==b1)
			{
				getZnak("1");
			}
			
			if(e.getSource()==b2)
			{
				getZnak("2");
			}
			
			if(e.getSource()==b3)
			{
				getZnak("3");
			}
			
			if(e.getSource()==b4)
			{
				getZnak("4");
			}
			
			if(e.getSource()==b5)
			{
				getZnak("5");
			}
			
			if(e.getSource()==b6)
			{
				getZnak("6");
			}
			
			if(e.getSource()==b7)
			{
				getZnak("7");
			}
			
			if(e.getSource()==b8)
			{
				getZnak("8");
			}
			
			if(e.getSource()==b9)
			{
				getZnak("9");
			}
			
			
			if(e.getSource()==b_plus)
			{
				resTextField.setText(null);
				znak = "+";
				l.setText(" Операция сложения ");
			}
			
			if(e.getSource()==b_minus)
			{
				resTextField.setText(null);
				znak = "-";
				l.setText(" Операция вычетания ");
			}
			
			if(e.getSource()==b_umn)
			{
				resTextField.setText(null);
				znak = "*";
				l.setText(" Операция умножения ");
			}
			
			if(e.getSource()==b_del)
			{
				resTextField.setText(null);
				znak = "/";
				l.setText(" Операция деления ");
			}
			
			if(e.getSource()==res)
			{
				showResult sr = new showResult();
				
				resTextField.setText(""+sr.Result(i, j, znak));
				znak = null;
				l.setText(" Результат ");
			}
			
			if(e.getSource()==b_cls_all)
			{
				resTextField.setText(null);
				znak = null;
				l.setText(" Вид операции ");
			}
			
			if(e.getSource()==b_cls_back)
			{
				if(resTextField.getText().isEmpty()==false)
				{
				resTextField.setText(resTextField.getText().substring(0,resTextField.getText().length()-1));
				}
			}
					
			
		}
		
		public void getZnak(String z)
		{
	
			if(z==".")
			{
			    resTextField.setText(resTextField.getText()+z);
			}
			else
			{
			    if(resTextField.getText().equals("0") || resTextField.getText().equals("0.0") || l.getText().equals(" Результат "))
			    {
			       l.setText(" Вид операции ");	
			       resTextField.setText(z);
			    }
			    else
			    {
			       resTextField.setText(resTextField.getText()+z);
			    }
			}
			
			
			if(znak==null)
			{
			    i = resTextField.getText();	
			}
			else
			{
				j = resTextField.getText();
			}
			
		}
			
	}

}
