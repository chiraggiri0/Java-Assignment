/*Write a Java program to Take three numbers from the user and print the greatest number.*/
package com.module2;

import java.util.Scanner;

public class Q1_MaxNum
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers=");
	
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	
		if(a>b && a>c)
			System.out.println(a+ " is max..");
		else if(b>a && b>c)
			System.out.println(b+ " is max..");
		else
			System.err.println(c+ " is max..");
	}

}
