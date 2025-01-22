/*Write a Java program to print the ASCII value of a given character*/

package com.module2;

import java.util.Scanner;

public class Q10_AsciiValueOfChar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character= ");
		char ch=sc.next().charAt(0);
		
		System.out.println("Ascii value of "+ch +" is= "+ (int)ch);
	}

}
