//Write a Java program to iterate through all elements in a hash list.
package com.module2;
import java.util.HashSet;
import java.util.Iterator;

public class Q61_IterateElementHashSet 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		h1.add(6);
		
		Iterator i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	}

}
