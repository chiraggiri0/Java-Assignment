//Write a Java program to remove the third element from an array list.
package com.module2;

import java.util.ArrayList;

public class Q55_RemoveElementArraylist
{
	public static void main(String[] args) 
	{

		ArrayList a1=new ArrayList();
		
		a1.add("Rohit Sharma");
		a1.add("Virat Kohli");
		a1.add("Pet Cummins");
		a1.add("Ben Stokes");
		
		System.out.println(a1);
		
		a1.remove(2);
		System.out.println(a1);
		
	}

}
