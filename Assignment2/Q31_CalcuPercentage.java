/*We have to calculate the percentage of marks obtained in three subjects (each out of 
100) by student A and in four subjects (each out of 100) by student B. Create an 
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
other classes 'A' and 'B' each having a method with the same name which returns the 
percentage of the students. The constructor of student A takes the marks in three 
subjects as its parameters and the marks in four subjects as its parameters for student
B. Create an object for each of the two classes and print the percentage of marks for 
both the students.*/
package com.module2;

abstract class Marks
{
	public abstract void getPercentage();
	
}

class A extends Marks
{
	int A1,A2,A3;
	
	public A(int A1,int A2,int A3)
	{
		this.A1=A1;
		this.A2=A2;
		this.A3=A3;
		
	}
	@Override
	public void getPercentage() 
	{
		float per=(A1+A2+A3)/3;	
		
		System.out.println("Percentage of Student A = " + per);
	}
	
}

class B extends Marks
{
	int b1,b2,b3,b4;
	public B(int b1, int b2 ,int b3, int b4)
	{
		this.b1=b1;
		this.b2=b2;
		this.b3=b3;
		this.b4=b4;
	}
	@Override
	public void getPercentage() 
	{
		float per=(b1+b2+b3+b4)/4;	
		
		System.out.println("Percentage of Student B = " + per);
	}
	
}
public class Q31_CalcuPercentage 
{
	public static void main(String[] args) 
	{
		A a1=new A(50,40,70);
		a1.getPercentage();
		
		B b1=new B(90,90,80,90);
		
		b1.getPercentage();
		
	}

}
