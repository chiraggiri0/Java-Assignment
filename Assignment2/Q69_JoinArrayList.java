//Write a Java program to join two array lists.
package com.module2;

import java.util.ArrayList;

public class Q69_JoinArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add(1);
		a1.add("yash");
		a1.add(2);
		a1.add("Sumit");
		
		ArrayList a2=new ArrayList();
		
		a2.add(3);
		a2.add("Hardik");
		a2.add(4);
		a2.add("Smit");
		
		System.out.println(a1);
		System.out.println(a2);
		
		ArrayList a3=new ArrayList();
		a3.addAll(a1);
		a3.addAll(a2);
		
		System.out.println(a3);
	}
}
