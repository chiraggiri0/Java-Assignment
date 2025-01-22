/*1)Write a Java program to Take three numbers from the user and print the greatest 
number.*/
package com.module1;

public class Maxnum_q1 
{
	public static void main(String[] args) 
	{
		int n1=10;
		int n2=20;
		int n3=15;
		
		if(n1>n2 && n1>n3)
			System.out.println(n1+ "is max Number..");
		
		else if(n2>n1 && n2>n3)
			System.out.println(n2+ "is Max Number..");
		
		else
			System.out.println(n3+ "is Max Number..");
	}

}
