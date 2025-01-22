/*Write a Java program to check whether a map contains key-value mappings (empty) 
or not*/
package com.module2;

import java.util.HashMap;

public class Q72_HashMap_EmptyOrNot 
{
	public static void main(String[] args) 
	{
		HashMap h1=new HashMap();
		
		h1.put(1, "yash");
		h1.put(2,"rahul");
		h1.put(3, "jayesh");
		h1.put(4, "pritesh");
		
		System.out.println(h1.isEmpty());
		
		h1.clear();
		
		System.out.println(h1.isEmpty());
	}
}
