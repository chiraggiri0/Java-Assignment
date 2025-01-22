/*Write a Java program to associate the specified value with the specified key in a
Hash Map.*/


package com.module2;

import java.util.HashMap;

public class Q63_HashMap 
{
	public static void main(String[] args) 
	{
		HashMap h1=new HashMap();
		
		h1.put(1, "Yash");
		h1.put(2, "Hardik");
		h1.put(3, "Virendra");
		h1.put(4, "Mahesh");
		h1.put(5, "Jayesh");
		
		System.out.println(h1);
		
	}

}
