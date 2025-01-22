//Write a Java program to increase the size of an array list
package com.module2;

import java.util.ArrayList;

public class Q73_IncreaseSize_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList(3);
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		
		System.out.println(a1.size());
		
		a1.add(4);
		
		System.out.println(a1.size());//Automatically Shrink..
	}
}
