/*Write a Java program that takes a year from user and print whether that year is a leap 
year or not*/
package com.module1;

public class LeapYear_q3 
{
	public static void main(String[] args)
	{
		int year=2024;
		
		if(year%4==0)
			System.out.println(year + " is Leap year..");
		else
			System.out.println(year + " is Not Leap year..");
	}

}
