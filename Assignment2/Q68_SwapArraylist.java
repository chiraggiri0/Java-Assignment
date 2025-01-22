//Write a Java program of swap two elements in an array 
package com.module2;

import java.util.ArrayList;
import java.util.Collections;

public class Q68_SwapArraylist 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		Collections.swap(a1, 0, 1);
		
		System.out.println(a1);
	}

}
