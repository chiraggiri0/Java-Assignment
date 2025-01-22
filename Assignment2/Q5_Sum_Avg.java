/*Write a program in Java to input 5 numbers from keyboard and find their sum and 
average using for loop.*/
package com.module2;

import java.util.Scanner;

public class Q5_Sum_Avg 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Five Numbers=");
		
		int a[]=new int[5];
		int sum=0;
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		
		int avg=sum/5;
		
		
		System.out.println("Sum of five Number is = " +sum);
		
		System.out.println("average of five Number is = "+avg);
		
		
	}

}
