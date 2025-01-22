/*Write a Java program to iterate through all elements in an array list.*/
package com.module2;

import java.util.ArrayList;
import java.util.Iterator;

public class Q51_ArrayList_Iterate 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add("yash");
		a1.add("Chavda");
		a1.add("Charadva");
		
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
