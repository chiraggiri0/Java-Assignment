package com.module3;

import java.sql.*;

public class CreateEMPLOGTable 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/module3","root","root");
			
			Statement st=con.createStatement();
			
			int x=st.executeUpdate("create table EMPLOG (Emp_id int(5) not null,Log_date Date default null,New_salary int(10) default null,Action Varchar(20) default null)");
			
			System.out.println("EMPLOG table created.");
			
			con.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
