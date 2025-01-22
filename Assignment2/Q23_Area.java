/*Create a class to print the area of a square and a rectangle. The 
class has two methods with the same name but different number of 
parameters. The method for printing area of a rectangle has two
parameters which are length and breadth respectively while the other
method for printing area of square has one parameter which is side 
of square.*/

package com.module2;
class Area
{
	public void Findarea(int length,int breadth)
	{
		System.out.println("Area of Rectangle = " +(length*breadth));
	}
	
	public void Findarea(int side)
	{
		System.out.println("Area of Square = " + (side*side));
	}
}
public class Q23_Area 
{
	public static void main(String[] args)
	{
		Area A=new Area();
		
		A.Findarea(2, 4);
		A.Findarea(2);
		
	}
}
