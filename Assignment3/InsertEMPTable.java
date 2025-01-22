package com.module3;

import java.sql.*;

public class InsertEMPTable 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/module3","root","");
			
			Statement st=con.createStatement();
			
			int q=st.executeUpdate("insert into EMP(Empno,ename,job,mgr,hiredate,sal,deptno) values('"+7369+"','"+"SMITH"+"','"+"CLERK"+"','"+7902+"','"+Date.valueOf("1980-12-17")+"','"+800.00+"','"+20+"')");
	
			int w=st.executeUpdate("insert into EMP values('"+7499+"','"+"ALLEN"+"','"+"SALESMAN"+"','"+7698+"','"+Date.valueOf("1981-02-20")+"','"+1600.00+"','"+300.00+"','"+30+"')");
			
			int e=st.executeUpdate("insert into EMP values('"+7521+"','"+"WARD"+"','"+"SALESMAN"+"','"+7698+"','"+Date.valueOf("1981-02-22")+"','"+1250.00+"','"+500.00+"','"+30+"')");
			
			int r=st.executeUpdate("insert into EMP(Empno,ename,job,mgr,hiredate,sal,deptno) values('"+7566+"','"+"JONES"+"','"+"MANAGER"+"','"+7839+"','"+Date.valueOf("1981-04-02")+"','"+2975.00+"','"+20+"')");
			
			int t=st.executeUpdate("insert into EMP values('"+7654+"','"+"MARTIN"+"','"+"SALESMAN"+"','"+7698+"','"+Date.valueOf("1981-09-28")+"','"+1250.00+"','"+1400.00+"','"+30+"')");
			
			int y=st.executeUpdate("insert into EMP(Empno,ename,job,mgr,hiredate,sal,deptno) values('"+7698+"','"+"BLAKE"+"','"+"MANAGER"+"','"+7839+"','"+Date.valueOf("1981-05-01")+"','"+2850.00+"','"+30+"')");
			
			int u=st.executeUpdate("insert into EMP(Empno,ename,job,mgr,hiredate,sal,deptno) values('"+7782+"','"+"CLARK"+"','"+"MANAGER"+"','"+7839+"','"+Date.valueOf("1981-06-09")+"','"+2450.00+"','"+10+"')");
			
			int i=st.executeUpdate("insert into EMP(Empno,ename,job,mgr,hiredate,sal,deptno) values('"+7788+"','"+"SCOTT"+"','"+"ANALYST"+"','"+7566+"','"+Date.valueOf("1987-06-11")+"','"+3000.00+"','"+20+"')");
			
			int o=st.executeUpdate("insert into EMP(Empno,ename,job,hiredate,sal,deptno) values('"+7839+"','"+"KING"+"','"+"PRESIDENT"+"','"+Date.valueOf("1981-11-17")+"','"+5000.00+"','"+10+"')");
			
			int p=st.executeUpdate("insert into EMP values('"+7844+"','"+"TURNER"+"','"+"SALESMAN"+"','"+7698+"','"+Date.valueOf("1981-08-09")+"','"+1500.00+"','"+0.00+"','"+30+"')");
			
			int a=st.executeUpdate("insert into EMP(Empno,ename,job,mgr,hiredate,sal,deptno) values('"+7876+"','"+"ADAMS"+"','"+"CLERK"+"','"+7788+"','"+Date.valueOf("1987-07-13")+"','"+1100.00+"','"+20+"')");
			
			int s=st.executeUpdate("insert into EMP(Empno,ename,job,mgr,hiredate,sal,deptno) values('"+7900+"','"+"JAMES"+"','"+"CLERK"+"','"+7698+"','"+Date.valueOf("1981-03-12")+"','"+950.00+"','"+30+"')");
			
			int d=st.executeUpdate("insert into EMP(Empno,ename,job,mgr,hiredate,sal,deptno) values('"+7902+"','"+"FORD"+"','"+"ANALYST"+"','"+7566+"','"+Date.valueOf("1981-03-12")+"','"+3000.00+"','"+20+"')");
			
			int f=st.executeUpdate("insert into EMP(Empno,ename,job,mgr,hiredate,sal,deptno) values('"+7934+"','"+"MILLER"+"','"+"CLERK"+"','"+7782+"','"+Date.valueOf("1982-01-23")+"','"+1300.00+"','"+10+"')");
			
			
			System.out.println("record inserted");
			con.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
