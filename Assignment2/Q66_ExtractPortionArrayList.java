//Write a Java program to extract a portion of an array list.
package com.module2;

import java.util.ArrayList;
import java.util.List;

public class Q66_ExtractPortionArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
	
		System.out.println(a1);
		List<Integer> Sort=a1.subList(0, 4);
		
		System.out.println("First Four elements are = " + Sort);
	}
}
