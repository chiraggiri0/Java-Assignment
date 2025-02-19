package com.module3;

import java.sql.*;

public class DeptTable 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/module3","root","root");
			
			Statement st=con.createStatement();
			
			int x=st.executeUpdate("CREATE TABLE DEPT(Deptno INT(2) NOT NULL PRIMARY KEY DEFAULT 0,Dname VARCHAR(14) DEFAULT NULL,Loc VARCHAR(13) DEFAULT NULL)");
			
			System.out.println("DEPT table is created..");
			con.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
