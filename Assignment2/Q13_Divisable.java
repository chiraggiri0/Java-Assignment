/*Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 
and by both*/
package com.module2;

import java.util.Scanner;

public class Q13_Divisable
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number Between 1 to 100= ");
		int num=sc.nextInt();
		
		if(num%5==0 && num%3!=0)
		{
			System.out.println(num+ " is Divisable by 5 only..");
		}
		else if(num%3==0 && num%5!=0)
		{
			System.out.println(num+ " is Divisable by 3 only..");
		}
		else if(num%5==0 && num%3==0)
		{
			System.out.println(num+" is Divisable by Both..");
		}
		else
		{
			System.out.println("Not Divisable by 3 or 5..");
		}

	}

}
