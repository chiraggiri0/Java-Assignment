/*Write a Java program that reads a positive integer and count the number of digits the 
number*/

package com.module2;

import java.util.Scanner;

public class Q8_CountDigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number=");
		int num=sc.nextInt();
		
		if(num<0)
			System.out.println(num+" is Negetive Number..");
		else
			System.out.println(num+" is Positive Number..");
		int rem;;
		int count=0;
		for(int i=0; num!=0; i++)
		{
			rem=num%10;
			num=num/10;
			count++;
		}
		System.out.println("Number of Digit is= "+count);
	}

}
