package com.module3;

import java.sql.*;

public class SolveQuery 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/module3","root","root");
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("SELECT DISTINCT job FROM emp");
			
			System.out.println("i. Select unique job from EMP table.");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			System.out.println();
			
			System.out.println("ii. List the details of the emps in asc order of the Dptnos and desc of Jobs");
			
			rs=st.executeQuery("SELECT deptno,job FROM emp ORDER BY Deptno ASC , Job DESC");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			
			System.out.println();
			
			System.out.println("iii.Display all the unique job groups in the descending order");
			
			
			rs=st.executeQuery("SELECT DISTINCT job FROM emp ORDER BY job DESC");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			
			System.out.println("iv. List the emps who joined before 1981");
			
			rs=st.executeQuery("select ename from emp where hiredate>1981");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			
			System.out.println();
			
			System.out.println("v. List the Empno, Ename, Sal, Daily sal of all emps in the asc order of Annsal.");
			
			rs=st.executeQuery("SELECT EMPNO,ENAME,SAL FROM EMP ORDER BY SAL * 12 ASC");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			System.out.println();
			System.out.println("vi. List the Empno, Ename, Sal, Exp of all emps working for Mgr 7369");
			
			rs=st.executeQuery("SELECT Empno,Ename,Sal FROM EMP WHERE Mgr = 7369");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			System.out.println();
			
			System.out.println("vii. Display all the details of the emps who’s Comm. Is more than their Sal");
			
			rs=st.executeQuery("SELECT * FROM emp WHERE comm >sal");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
			}
			
			System.out.println();
			
			System.out.println("viii. List the emps who are either ‘CLERK’ or ‘ANALYST’ in the Desc order");
			
			rs=st.executeQuery("SELECT * FROM emp WHERE job IN ('"+"clerk"+"','"+"analyst"+"')");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7)+"  "+rs.getString(8));
			}
			
			System.out.println();
			System.out.println("ix. List the emps Who Annual sal ranging from 22000 and 45000.");
			rs=st.executeQuery("SELECT ename FROM emp WHERE sal*12 BETWEEN 22000 AND 45000");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			
			System.out.println();
			
			System.out.println("List the Enames those are starting with ‘S’ and with five characters");
			rs=st.executeQuery("SELECT ename FROM emp WHERE ename LIKE '"+"%S____"+"'");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			
			System.out.println();
			
			System.out.println("xi. List the emps whose Empno not starting with digit78");
			rs=st.executeQuery("SELECT empno,ename FROM emp WHERE empno NOT LIKE '"+"78%"+"'");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			
			System.out.println();
			
			System.out.println("xii. List all the Clerks of Deptno 20.");
			rs=st.executeQuery("select ename,job,deptno from emp where job='"+"clerk"+"' and deptno='"+20+"'");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			System.out.println();
			System.out.println("xiii. List the Emps who are senior to their own MGRS");
			rs = st.executeQuery("SELECT e1.empno, e1.ename, e1.hiredate,(SELECT e2.empno FROM emp e2 WHERE e2.empno = e1.mgr) AS mgr_empno,(SELECT e2.ename FROM emp e2 WHERE e2.empno = e1.mgr) AS mgr_ename,(SELECT e2.hiredate FROM emp e2 WHERE e2.empno = e1.mgr) AS mgr_hiredate FROM emp e1 WHERE e1.hiredate < (SELECT e2.hiredate FROM emp e2 WHERE e2.empno = e1.mgr)");

			while (rs.next()) 
			{
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

			
			System.out.println();
			
			System.out.println("xiv. List the Emps of Deptno 20 who’s Jobs are same as Deptno10.");
			rs=st.executeQuery("SELECT * FROM emp WHERE Deptno = 20 AND Job IN (SELECT Job FROM emp WHERE Deptno = 10);");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7)+"  "+rs.getString(8));
			}
			
			System.out.println();
			System.out.println("xv. List the Emps who’s Sal is same as FORD or SMITH in desc order of Sal");
			rs=st.executeQuery("SELECT * FROM emp WHERE Sal IN (SELECT Sal FROM emp WHERE Ename IN ('"+"FORD"+"', '"+"SMITH"+"'))ORDER BY Sal DESC");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7)+"  "+rs.getString(8));
			}
			
			System.out.println();
			System.out.println("xvi. List the emps whose jobs same as SMITH or ALLEN.");
			
			rs=st.executeQuery("select * from emp where job in(select job from emp where ename in('"+"smith"+"','"+"allen"+"'))");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7)+"  "+rs.getString(8));
			}
			
			System.out.println();
			
			System.out.println("xvii. Any jobs of deptno 10 those that are not found in deptno 20");
			rs=st.executeQuery("SELECT * FROM emp WHERE deptno=10 AND job NOT IN(SELECT deptno FROM emp WHERE deptno=20)");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7)+"  "+rs.getString(8));
			}
		
			System.out.println();
			
			System.out.println("xviii. Find the highest sal of EMP table");
			rs=st.executeQuery("select max(sal) from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
			}
			System.out.println();
			
			System.out.println("xx. Find the total sal given to the MGR");
			
			rs=st.executeQuery("select sum(sal) from emp where job='"+"manager"+"'");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			System.out.println();
			
			System.out.println("xxi. List the emps whose names contains ‘A’");
			
			rs=st.executeQuery("SELECT ename FROM emp WHERE ename LIKE '"+"%A%"+"'");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			System.out.println();
			
			System.out.println("xxii. Find all the emps who earn the minimum Salary for each job wise in ascending order");
			rs=st.executeQuery("SELECT empno, ename, sal, job FROM emp e1 WHERE sal = (SELECT MIN(sal)FROM emp e2 WHERE e1.job = e2.job)ORDER BY job ASC");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4));
			}
			
			System.out.println();
			System.out.println("xxiii. List the emps whose sal greater than Blake’s sal");
			rs=st.executeQuery("select ename from emp where sal>2850");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			con.close();
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
