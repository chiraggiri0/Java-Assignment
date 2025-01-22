//Write a Java program to insert an element into the array list at the first position.
package com.module2;

import java.util.ArrayList;

public class Q52_InsertFirstPosArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add("Rohit Sharma");
		a1.add("Virat Kohli");
		a1.add("Pet Cummins");
		a1.add("Ben Stokes");
		
		a1.add(0, "Hardik Pandya");
		
		System.out.println(a1);
	}

}
