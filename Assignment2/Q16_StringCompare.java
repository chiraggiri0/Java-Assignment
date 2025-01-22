package com.module2;

import java.util.Scanner;

public class Q16_StringCompare
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String = ");
		String s=sc.next();
		
		System.out.println("Enter the Second String compare = ");
		String y=sc.next();
		
		System.out.println(s.equals(y));
		
	}
}
