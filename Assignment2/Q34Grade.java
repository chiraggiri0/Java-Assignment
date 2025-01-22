/*Write a program which will ask the user to enter his/her 
marks (out of 100). Define a method that will display grades according to the marks 
entered as below:
Marks Grade
1-100 A
1-90 B
1-80 B
1-70 C
1-60 D
41-50 DD
40 Fail*/

package com.module2;

import java.util.Scanner;

public class Q34Grade 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your marks (out of 100) = " );
		int m=sc.nextInt();
		
		if(m==100)
		{
			System.out.println("Grade = A");
		}
		else if(m>=90)
		{
			System.out.println("Grade = B");
		}
		else if(m>=80)
		{
			System.out.println("Grade = C");
		}
		else if(m>=70)
		{
			System.out.println("Grade = D");
		}
		else if(m>=40)
		{
			System.out.println("Grade = E");
		}
		else
		{
			System.out.println("Fail..");
		}
	}

}
