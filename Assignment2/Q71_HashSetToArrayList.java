/*Write a Java program to check whether a map contains key-value mappings (empty) 
or not.*/
package com.module2;

import java.util.ArrayList;
import java.util.HashSet;

public class Q71_HashSetToArrayList 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		
		System.out.println(h1);
		
		ArrayList a1=new ArrayList(h1);
		
		System.out.println(a1);
		
	}
}
