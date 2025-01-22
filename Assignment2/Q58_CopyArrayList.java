package com.module2;

import java.util.ArrayList; 
import java.util.Collections;

public class Q58_CopyArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add('A');
		a1.add('B');
		a1.add('C');
		a1.add('D');
		
		System.out.println("a1 = "+a1);
		
		ArrayList a2=new ArrayList();
		
		a2.add('E');
		a2.add('f');
		a2.add('E');
		a2.add('H');
		System.out.println("a2 = "+a2);
		
		Collections.copy(a1, a2);
		
		System.out.println("a1= " +a1);
		System.out.println("a2= " +a2);
		
	}


}
