//Write a Java program to get a collection view of the values contained in this map
package com.module2;

import java.util.HashMap;

public class Q77_CollectionView_HashMap 
{
	public static void main(String[] args) 
	{
		HashMap h1 = new HashMap();  
		h1.put(1, "Blue");
		h1.put(2, "Green");
		h1.put(3, "Pink");
		h1.put(4, "White");
		h1.put(5, "Red");
		
		System.out.println("Collection View is = "+ h1.values());
	}
}
	
