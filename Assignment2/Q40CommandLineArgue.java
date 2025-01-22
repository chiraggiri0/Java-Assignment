/*W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and perform the division operation and handle Arithmetic
O/P  
Exception in thread main java. Lang. Arithmetic Exception:/ by zero
Command line argument and perform the division operation and handle Arithmetic
O/P  
Exception in thread main java. Lang. Arithmetic Exception:/ by zero
*/
package com.module2;

import java.util.Scanner;

public class Q40CommandLineArgue 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers = ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		try
		{	
		int result=num1/num2;
		System.out.println("result is = " + result);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
