/*Create a class with a method that prints "This is a parent class" and 
its subclass with another method that prints "This is child class".
Now, create an object for each of the class and call 1 - method of parent
class by object of parent class 2 - method of child class by object of
child class 3 - method of parent class by object of child class.*/
package com.module2;

class Parent
{
	public void print1()
	{
		System.out.println("This is Parent Class..");
	}
}

class Child extends Parent
{
	public void print()
	{
		System.out.println("This is Child Class..");
	}
}
public class Q24_Single_Inheritance 
{
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.print1();
		
		Child c=new Child();
		c.print();
		
		c.print1();
	}

}
