package com.module3;

import java.sql.*;

public class CreateEmpTable 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tops","root","root");
			
			Statement st=con.createStatement();
			
			int x=st.executeUpdate("CREATE TABLE EMP \r\n"
					+ "(\r\n"
					+ "	Empno INT(4) NOT NULL PRIMARY KEY DEFAULT 0,\r\n"
					+ "	Ename VARCHAR(10) DEFAULT NULL,\r\n"
					+ "	Job VARCHAR(9) DEFAULT NULL,\r\n"
					+ "	Mgr INT(4) DEFAULT NULL,\r\n"
					+ "	Hiredate DATE DEFAULT NULL,\r\n"
					+ "	Sal DECIMAL(7,2) DEFAULT NULL,\r\n"
					+ "	Comm DECIMAL(7,2) DEFAULT NULL,\r\n"
					+ "	Deptno	INT(2) DEFAULT NULL,\r\n"
					+ "	FOREIGN KEY(deptno) REFERENCES DEPt (Deptno)\r\n"
					+ "	)");
					System.out.println("EMP table is created");
					con.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
