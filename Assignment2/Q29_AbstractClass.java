/*Create an abstract class 'Parent' with a method 'message'. It has two 
subclasses each having a method with the same name 'message' that prints 
"This is first subclass" and "This is second subclass" respectively.
Call the methods 'message' by creating an object for each subclass.*/
package com.module2;

abstract class Parents
{
	public abstract void message();
}

class Child1 extends Parents
{

	@Override
	public void message() 
	{
		System.out.println("It is Subclass 1...");
	}

}

class Child2 extends Parents
{

	@Override
	public void message()
	{
		System.out.println("It is Subclass 2...");
	}
	
}
public class Q29_AbstractClass 
{
	public static void main(String[] args) 
	{
		Child1 c1=new Child1();
		
		c1.message();
		
		Child2 c2=new Child2();
		
		c2.message();
	}

}
