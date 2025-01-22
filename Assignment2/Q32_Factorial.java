/*Write a program to print the factorial of a number by defining a method named 
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n.*/
package com.module2;

import java.util.Scanner;

public class Q32_Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number = ");
		int n=sc.nextInt();
		
		if(n==0)
		{
			System.out.println("Factorial is 0");
		}
		else
		{
			int fact=1;
			for(int i=1; i<n ; i++)
			{
				fact=fact*i;
			}
		
			System.out.println("Factorial is = " + fact);
		}
	}

}
