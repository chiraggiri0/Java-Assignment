package com.module2;

import java.util.ArrayList;

public class Q56_SearchElementArrayList 
{
	public static void main(String[] args) 
	{	
		ArrayList a1=new ArrayList();
		
		a1.add("Red");
		a1.add("Blue");
		a1.add("Green");
		a1.add("Red");
		a1.add("Blue");
		
			if(a1.contains("Green"))
			{
				System.out.println("Found the Element");
			}
			else
			{
				System.out.println("There is no such Element...");
			}
		
	}
}
