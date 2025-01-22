/*Write a Java program that takes a year from user and print whether that year is a leap 
year or not.*/
package com.module2;

import java.util.Scanner;

public class Q3_LeapYear
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Year=");
		int year=sc.nextInt();
		
		if(year%4==0)
			System.out.println(year+" is Leap year..");
		else
			System.out.println(year+" is Not Leap year..");
		

	}

}
