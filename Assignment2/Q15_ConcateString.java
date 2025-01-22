package com.module2;

import java.util.Scanner;

public class Q15_ConcateString 
{
	public static void main(String[] args) 
	{
		String str="yash";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String Concate = ");
		String str1=sc.next();
		
		StringBuffer s=new StringBuffer(str);
		
		s.append(str1);
		
		System.out.println(s);
	}
}
