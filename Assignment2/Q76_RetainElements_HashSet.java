/*Write a Java program to compare two sets and retain elements which are same on 
both sets.*/
package com.module2;

import java.util.HashSet;

public class Q76_RetainElements_HashSet 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		
		h1.add("Java");
		h1.add("Python");
		h1.add("PHP");
		h1.add("c");
		System.out.println(h1);
		HashSet h2=new HashSet();
		
		h2.add("Java");
		h2.add("Ruby");
		h2.add("Anguler");
		h2.add("c++");
		System.out.println(h2);
		
		System.out.println("Retain Elements are");
		h1.retainAll(h2);
		
		
		System.out.println(h1);
		
	}
}
