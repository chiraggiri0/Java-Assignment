package com.module3;

import java.awt.BorderLayout; 
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.EventListener;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import javax.swing.table.DefaultTableModel;

public class SwingRegistrationForm extends Update1 implements ActionListener
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4;
	JRadioButton r1,r2;
	JButton b1,b2,b3,b4,b5,b6;
	JTable table;
	JScrollPane s1,s2;
	ButtonGroup BG;
	String gender=null;
	
	public SwingRegistrationForm()
	{
	
		
		frame=new JFrame("REGISTRATION FORM");
		frame.setSize(700,410);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Registration Form");
		l1.setBounds(40,30,170,30);
		
		l2=new JLabel("ID");
		l2.setBounds(20,65,85,30);
		
		l3=new JLabel("Name");
		l3.setBounds(20,100,85,30);
		
		l4=new JLabel("Gender");
		l4.setBounds(20,135,85,30);
		
		l5=new JLabel("Address");
		l5.setBounds(20,170,85,30);

		l6=new JLabel("Contact");
		l6.setBounds(20,205,85,30);
		
		t1=new JTextField(15);
		t1.setBounds(90,65,150,30);
		
		t2=new JTextField(15);
		t2.setBounds(90,100,150,30);
		
		r1=new JRadioButton("Male");
		r1.setBounds(90,135,60,30);
		r1.addActionListener(this);
		
		r2=new JRadioButton("Female");
		r2.setBounds(160,135,80,30);
		r2.addActionListener(this);
		
		BG = new ButtonGroup();
        BG.add(r1);
        BG.add(r2);
		
		t3=new JTextField(50);
		t3.setBounds(90,170,150,30);
		
		t4=new JTextField(20);
		t4.setBounds(90,205,150,30);
		
		b1=new JButton("Exit");
		b1.setBounds(20,270,85,30);
		b1.addActionListener(this);
		
		b2=new JButton("Register");
		b2.setBounds(115,270,85,30);
		
		b2.addActionListener(this);
		
		b3=new JButton("Delete");
		b3.setBounds(20,305,85,30);
		b3.addActionListener(this);
		
		b4=new JButton("Update");
		b4.setBounds(115,305,85,30);
		b4.addActionListener(this);
		
		b5=new JButton("Reset");
		b5.setBounds(70,340,85,30);
		b5.addActionListener(this);
	
		b6=new JButton("Refresh Table");
		b6.setBounds(370,402,200,15);
		
		String[] columns = {"S.no", "ID","Name", "Gender", "Address", "Contact"};
		DefaultTableModel model = new DefaultTableModel(columns, 100);
		
		
		table=new JTable(model);
		s1=new JScrollPane(table);
		s1.setBounds(270,20,380,380);
	
		


		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(t1);
		frame.add(t2);
		frame.add(r1);
		frame.add(r2);
		frame.add(t3);
		frame.add(t4);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);	
		frame.add(b6);
		frame.add(s1);
	
		
		
	}
	public static void main(String[] args) 
	{
		
		SwingRegistrationForm sw=new SwingRegistrationForm();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/module3","root","");
		
		Statement st=con.createStatement();
		
		if(e.getSource()==b2)
		{
			if(r1.isSelected()==true)
			{
				gender="male";
			}
			else if(r2.isSelected()==true)
			{
				gender="female";
			}
			int x=st.executeUpdate("insert into RegistratonForm values ('"+t1.getText()+"','"+t2.getText()+"','"+gender+"','"+t3.getText()+"','"+t4.getText()+"')");

			if(x>0)
			{
				System.out.println("record inserted");
				ResultSet rs=st.executeQuery("select * from RegistratonForm where ID ='"+t1.getText()+"'");
				while(rs.next())
				{
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
				}
			}
			
		}
		else if(e.getSource()==b4)
		{
			Update1 t1=new Update1();
			t1.updateRecord();
		}
		else if(e.getSource()==b3)
		{
			Delete1 d1=new Delete1();
			d1.deleteRecord();
		}
		else if(e.getSource()==b5)
		{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				r1.setSelected(false);	
				r2.setSelected(false);	
		}
		else if(e.getSource()==b1)
		{
			System.exit(0);
		}
		con.close();
		} catch (Exception e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	

}

class Update1
{	
	public static void updateRecord () 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID to Update : ");
		int UID=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new Name =");
		String UName=sc.nextLine();
		
		System.out.println("Enter new Gender = ");
		String UGen=sc.next();
		
		sc.nextLine();
		
		System.out.println("Enter new Address =");
		String UAddr=sc.nextLine();
		
		System.out.println("Enter new Contect =");
		String UCon=sc.next();
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/module3","root","");
			
			Statement st=con.createStatement();
			
			int x=st.executeUpdate("update registratonform set Name='"+UName+"',Gender = '"+UGen+"',Address='"+UAddr+"',Contect='"+UCon+"' where ID='"+UID+"'");
			
			if(x>0)
			{
				System.out.println("Record Updated Succesfully");
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
	}
}

class Delete1
{
	public static void deleteRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID to Delete : ");
		int DID=sc.nextInt();
		sc.nextLine();
		

		try 
		{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/module3","root","");
		
		Statement st=con.createStatement();
		
		int x=st.executeUpdate("delete from registratonform where ID = '"+DID+"'");
		
		if(x>0)
		{
			System.out.println("Record Delete Succes	fully");
		}
		
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

