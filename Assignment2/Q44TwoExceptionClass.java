/*W.A.J.P to create a class Student with attributes roll no, name, age and course. 
Initialize values through parameterized constructor. If age of student is not in 
between 15 and 21 then generate user defined exception 
"AgeNotWithinRangeException". If name contains numbers or special symbols 
raise exception "NameNotValidException". Define the two exception classes.
*/
package com.module2;

import java.util.Scanner;

class AgeNotWithinRangeException extends Exception
{
	
}
class NameNotValidException extends Exception
{
	
}

class Student
{
	int rollno;
	int age;
	String name;
	String course;
	
	public Student(int rollno,int age,String name,String course)
	{
		this.rollno=rollno;
		this.age=age;
		this.name=name;
		this.course=course;
	}
	
	public void checkage() throws AgeNotWithinRangeException
	{
		if(age<15 || age>21)
		{
			throw new AgeNotWithinRangeException();
		}	
	}
	
	public void checkname() throws NameNotValidException
	{
		int temp=0;
		for(int i=0;i<name.length(); i++)
		{
			char ch;
			ch=name.charAt(i);
			
			if(ch<'a' && ch>'z' || ch<'A'&& ch>'Z')
			{
				temp++;
			}
		}
		
		if(temp>0)
		{
			throw new NameNotValidException();
		}
	}
}

public class Q44TwoExceptionClass 
{
	public static void main(String[] args) 
	{
		int a,b;
		String c,d;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rollno = ");
		a=sc.nextInt();
		
		System.out.println("Enter the Age = ");
		b=sc.nextInt();
		
		System.out.println("Enter the name = ");
		c=sc.next();
		
		System.out.println("Enter the Course = ");
		d=sc.next();
		
		Student s=new Student(a, b, c, d);
		
		try 
		{
			s.checkage();
			System.out.println("Age Entered Succesfully..");
		} 
		catch (AgeNotWithinRangeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Enter age between 15 to 21...");
		}
		
		try
		{
			s.checkname();
			System.out.println("Name Entered Succesfully..");
		} 
		catch (NameNotValidException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Name only contain character..");
		}
		
		
		
	}
}
