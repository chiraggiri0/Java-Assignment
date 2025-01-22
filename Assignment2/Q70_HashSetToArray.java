//Write a Java program to convert a hash set to an array
package com.module2;

import java.util.HashSet;

public class Q70_HashSetToArray 
{
	public static void main(String[] args) 
	{
		HashSet<String> h1=new HashSet<String>();
		
		h1.add("yash");
		h1.add("rahul");
		h1.add("hardik");
		h1.add("pritesh");
		h1.add("sumit");
		
		System.out.println(h1);
		
		String[] arr=new String[h1.size()];
		
		h1.toArray(arr);
		
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		
	}
}
