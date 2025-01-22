/*Write a Java program to count the letters, spaces, numbers and other characters of 
an input string.*/
package com.module2;

import java.util.Scanner;
class Counter
{
	int letter=0;
	int space=0;
	int num=0;
	int other=0;
	
	public void countchar(String st)
	{
		String str=st;
		for(char ch:str.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				letter++;
			}
			else if(Character.isWhitespace(ch))
			{
				space++;
			}
			else if(Character.isDigit(ch))
			{
				num++;
			}
			else
			{
				other++;
			}
		}
	}
	public void display()
	{
		System.out.println("Letters = "+letter);
		System.out.println("Spaces = "+space);
		System.out.println("Number = "+num);
		System.out.println("other Characters = "+other);
	}
	
}
public class Q9_CountCharOfString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String = ");
		String str=sc.nextLine();
		
		
		Counter c=new Counter();
		c.countchar(str);
		c.display();
		
	}
}