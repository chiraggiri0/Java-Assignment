/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. Its 
constructor having parameters for length and breadth is used to initialize the length 
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
constructor having a parameter for its side (suppose s) calling the constructor of its 
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.
*/

package com.module2;

public class Q26_Constructer_Calling 
{
	public static void main(String[] args) 
	{
		Square1 s1=new Square1(4);
		s1.area();
		s1.perimeter();
		s1.areaOfRect();
		s1.perimeterOfRect();
	}
}

class Rectangle1
{
	int length;
	int breadth;
	
	public Rectangle1(int length,int breadth) 
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public void areaOfRect()
	{
		System.out.println("area of rectangle = " + (length*breadth));
	}
	
	public void perimeterOfRect()
	{
		System.out.println("perimeter of rectangle = " +((length*breadth)*2));
	}
}

class Square1 extends Rectangle1
{
	int side;
	
	public Square1(int side) 
    {
        super(4,5); 
        this.side=side;
    }
	public void area()
	{
		System.out.println("area of square = " +(side*side));
	}
	
	public void perimeter()
	{
		System.out.println("perimeter of square = " + (4*side));
	}
}