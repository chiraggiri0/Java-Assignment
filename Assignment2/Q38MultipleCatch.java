/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
exception and another one is to handle
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;*/

package com.module2;

public class Q38MultipleCatch 
{
	public static void main(String[] args) 
	{
		int a[]=new int[4];
		
		try
		{
			//int j=10/0;
			
			for(int i=0; i<5; i++)
			{
				a[i]=i;
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
