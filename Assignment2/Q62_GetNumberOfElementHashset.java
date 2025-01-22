//Write a Java program to get the number of elements in a hash set.

package com.module2;

import java.util.HashSet;

public class Q62_GetNumberOfElementHashset 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		
		h1.add("Red");
		h1.add("Green");
		h1.add("Pink");
		h1.add(12.12);
		h1.add("Yash");
		
		System.out.println(h1);
		
		System.out.println("Elements = " + h1.size());
	}
}
