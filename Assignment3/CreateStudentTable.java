package com.module3;

import java.sql.*;

public class CreateStudentTable 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tops","root","root");
			
			Statement st=con.createStatement();
			
			int x=st.executeUpdate("create table STUDENT (Rno int(2) not null primary key default 0,Sname varchar(14) default null,City varchar(20) default null,State varchar(20) default null)");
			
			System.out.println("student table created.");
			con.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
