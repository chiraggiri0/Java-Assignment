package com.module2;

import java.util.ArrayList;
import java.util.Collections;

public class Q59_ShuffleElements_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		System.out.println(a1);
		Collections.shuffle(a1);
		
		System.out.println(a1);
	}
}
