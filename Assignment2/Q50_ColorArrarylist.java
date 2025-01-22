/*Write a Java program to create a new array list, add some colors (string) and print out 
the collection.*/

package com.module2;

import java.util.ArrayList;

public class Q50_ColorArrarylist 
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
	}
}
