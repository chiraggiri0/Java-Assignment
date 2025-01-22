/*Write a Java program to print all the elements of an Array List using the position of 
the elements.
*/

package com.module2;

import java.util.ArrayList;

public class Q75_PrintArrayList_With_Position 
{
	public static void main(String[] args) 
	{	
		ArrayList a1=new ArrayList();
		
		a1.add("Udit Narayan");
		a1.add("Sonu Nigam");
		a1.add("Ariji Singh");
		a1.add("Neha Kakkar");
		
		for(int i=0; i<a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}
			
		
	}	
}
