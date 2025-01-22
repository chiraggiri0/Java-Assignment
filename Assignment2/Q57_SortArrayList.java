package com.module2;

import java.util.ArrayList; 
import java.util.*;

public class Q57_SortArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		

		a1.add("Rohit Sharma");
		a1.add("Virat Kohli");
		a1.add("Pet Cummins");
		a1.add("Ben Stokes");
		
		System.out.println(a1);
		
		Collections.sort(a1);
		
		System.out.println(a1);
		
	}
}
