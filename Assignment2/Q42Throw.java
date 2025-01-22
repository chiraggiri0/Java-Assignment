/*W.A.J.P to create the validate method that takes integer value as a parameter. If the 
age is less than 18, then throw an Arithmetic Exception otherwise print a message 
welcome to vote.*/

package com.module2;

import java.util.Scanner;

public class Q42Throw 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Age =");
		int Age=sc.nextInt();
		try
		{
		if(Age<18)
		{
			throw new ArithmeticException();
		}
		else
			System.out.println("Welcome to vote..");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
