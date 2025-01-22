//Write a Java program to update specific array element by given element
package com.module2;

import java.util.ArrayList;

public class Q54_UpdateElementArraylist 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add("Red");
		a1.add("Blue");
		a1.add("Green");
		a1.add("Red");
		a1.add("Blue");
		
		System.out.println(a1);
		a1.set(3, "Brown");
		System.out.println(a1);
		
		
	}
}
