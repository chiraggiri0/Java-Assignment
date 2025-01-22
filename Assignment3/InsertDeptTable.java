package com.module3;

import java.sql.*;

public class InsertDeptTable 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tops","root","root");
			
			Statement st=con.createStatement();
			
			int x=st.executeUpdate("insert into DEPT values('"+10+"','"+"ACCOUNTING"+"','"+"NEW YORK"+"')");
			
			int y=st.executeUpdate("insert into DEPT values('"+20+"','"+"RESEARCH"+"','"+"DALLAS"+"')");
			
			int u=st.executeUpdate("insert into DEPT values('"+30+"','"+"SALES"+"','"+"CHICAGO"+"')");
			
			int i=st.executeUpdate("insert into DEPT values('"+40+"','"+"OPERATIONS"+"','"+"BOSTON"+"')");
			
			
			System.out.println("record inserted");
			
			con.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
