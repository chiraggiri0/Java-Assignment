/*Take two numbers from the user and perform the division operation and handle 
Arithmetic Exception. O/P- Enter two numbers: 10 0*/

package com.module2;

import java.util.Scanner;

public class Q37ArithmeticException 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers = ");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try
		{
		int div=a/b;
		System.out.println("Answer is = " + div);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
