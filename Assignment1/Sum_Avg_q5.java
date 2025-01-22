/*Write a program in Java to input 5 numbers from keyboard and find their sum and 
average using for loop.*/
package com.module1;

public class Sum_Avg_q5 
{
	public static void main(String[] args) 
	{
		int n1=1, n2=3, n3=5, n4=7, n5=8;
		
		int sum=n1+n2+n3+n4+n5;
		int avg=sum/5;
		
		System.out.println("Sum of Five Number= " + sum + " Average of five Number= " + avg);
		
	}

}
