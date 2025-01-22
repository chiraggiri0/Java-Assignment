/*Create a class named 'Shape' with a method to print "This is this is shape". Then 
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
having a method to print "This is rectangular shape" and "This is circular shape" 
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
object of 'Square' class.*/

package com.module2;

public class Q35Shape 
{
	public static void main(String[] args) 
	{
		Square s1=new Square();
		
		s1.printRect();
		s1.printShape();
	}

}
class Shaape
{
	public void printShape()
	{
		System.out.println("This is Shape..");
	}
}
class Rectangle extends Shaape
{
	public void printRect()
	{
		System.out.println("This is Rectangle Shape..");
	}
}

class Circle extends Shaape
{
	public void printcirc()
	{
		System.out.println("This is Circiler Shape..");
	}
}
class Square extends Rectangle
{
	public void printsquare()
	{
		System.out.println("Square is Rectangle..");
	}
}