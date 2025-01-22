package com.module2;

import java.util.ArrayList;
import java.util.Collections;

public class Q67_CompareArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Red");
		a1.add("Green");
		a1.add("Blue");
		a1.add("White");
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Red");
		a2.add("Green");
		a2.add("White");
		a2.add("Blue");
		
		Collections.sort(a1);

		Collections.sort(a2);
		
		System.out.println(a1.equals(a2));
	}
}
