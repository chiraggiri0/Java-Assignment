//Write a Java program to reverse elements in an array list
package com.module2;

import java.util.ArrayList;

public class Q65_ReverseElementArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add(1);
		a1.add(2);
		a1.add("yash");
		a1.add(3);
		a1.add(4);
		
		System.out.println(a1.reversed());
	}

}
