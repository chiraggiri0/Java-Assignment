//Write a Java program to count the number of key-value (size) mappings in a map
package com.module2;

import java.util.HashMap;

public class Q64_CountSizeHashMap 
{
	public static void main(String[] args) 
	{
		HashMap h1=new HashMap();
		
		h1.put(1, "Rohit");
		h1.put("Rohit", 1);
		h1.put('T', 2);
		h1.put(4, 'T');
		h1.put(3, 2);
		
		System.out.println(h1);
		System.out.println("Size ="+h1.size());
		
	}

}
