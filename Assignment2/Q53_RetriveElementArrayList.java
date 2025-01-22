/*Write a Java program to retrieve an element (at a specified index) from a given array 
list.*/

package com.module2;

import java.util.ArrayList;

public class Q53_RetriveElementArrayList 
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
		
		
		System.out.println("First Element is = " + a1.get(0));
	}

}
