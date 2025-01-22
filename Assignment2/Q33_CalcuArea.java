/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 'Area' and 
call all the three methods*/
package com.module2;

abstract class Shape
{
	int length;
	int breadth;
	int side;
	int radius;
	
	public abstract void RectangleArea(int length,int breadth);
	
	public abstract void SquareArea(int side);
	
	public abstract void CircleArea(int radius);
	
}

class Areas extends Shape
{

	@Override
	public void RectangleArea(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
		System.out.println("Area of Rectangle = " +(length*breadth));
	}

	@Override
	public void SquareArea(int side) 
	{
		this.side=side;
		
		System.out.println("Area of Square = " + (side*side));
	}

	@Override
	public void CircleArea(int radius)
	{
		this.radius=radius;
		System.out.println("Area of Circle = " + (2*3.14*(radius*radius)));
	}
	
}
public class Q33_CalcuArea 
{
	public static void main(String[] args) 
	{
		Areas A=new Areas();
		
		A.RectangleArea(4, 8);
		A.CircleArea(6);
		A.SquareArea(4);
	}

}
