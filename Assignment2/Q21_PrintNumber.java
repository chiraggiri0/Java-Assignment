/*Create a class named 'Print Number' to print various numbers of 
different data types by creating different methods with the same name
'printn' having a parameter for each data type.*/

package com.module2;

public class Q21_PrintNumber
{
	
		public void printn(int n)
		{
			System.out.println("Integer Number=" + n);
		}
		
		public void printn(float n)
		{
			System.out.println("Float Number=" + n);
		}
		
		public void printn(long n)
		{
			System.out.println("Long Number=" + n);
		}
		
		public void printn(double n)
		{
			System.out.println("Double Number=" + n);
		}
		
		public static void main(String[] args) 
		{
			Q21_PrintNumber p=new Q21_PrintNumber();
			
			p.printn(12);
			p.printn(12.1);
			p.printn(12000000);
			p.printn(12.1212);
			
		}
}
