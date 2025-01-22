/*Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
  Input number: 5*/

package com.module2;

import java.util.Scanner;

public class Q11_ComputeValue
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n=sc.nextInt();
		
		int value=n+(n*n)+(n*n*n);
		
		System.out.println("The Value is= "+value);
		
	}

}
