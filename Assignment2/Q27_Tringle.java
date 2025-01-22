/*Write a program to print the area and perimeter of a triangle having
sides of 3, 4 and 5 units by creating a class named 'Triangle' without 
any parameter in its constructor.*/

package com.module2;

class Triangle
{
	int a;
	int b;
	int c;
	
	public Triangle()
	{
		a=3;
		b=4;
	    c=5;
	}
	
	public void area()
	{
		int s=(a+b+c)/2;
		
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area of Triangle = " + area);
	}
	
	public void perimeter()
	{
		System.out.println("Perimeter of Triangle = " + (a+b+c));
	}
}
public class Q27_Tringle 
{
	public static void main(String[] args) 
	{
		Triangle t=new Triangle();
		
		t.area();
		t.perimeter();
	}
}
