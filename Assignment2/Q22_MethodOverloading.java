/*Create a class to print an integer and a character with two methods 
having the same name but different sequence of the integer and the 
character parameters*/
package com.module2;

class IntChar
{
	public void getter(int no,char grade)
	{
		System.out.println("First Number is = " + no);
		System.out.println("First Grade is = " + grade);
	}
	
	public void getter(char grade,int no)
	{
		System.out.println("Second Number is = " + no);
		System.out.println("First Grade is = " + grade);
	}
}
public class Q22_MethodOverloading 
{
	public static void main(String[] args) 
	{
		IntChar i=new IntChar();
		
		i.getter(1, 'A');
		System.out.println();
		i.getter('B', 2);
	}
}
