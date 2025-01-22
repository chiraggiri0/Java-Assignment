/*Write a Java program to replace the second element of an Array List with the 
specified element.
*/
package com.module2;

import java.util.ArrayList;

public class Q74_ReplaceElement_ 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		
		a1.add("Cricket");
		a1.add(8);
		a1.add("MS Dhoni");
		
		System.out.println(a1);
		
		a1.set(1, 7);
		
		System.out.println(a1);
	}
}
