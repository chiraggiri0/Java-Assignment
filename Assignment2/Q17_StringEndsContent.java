/*W.A.J.P to check whether a given string ends with the contents of another string. 
"Java Exercises" ends with "se"? False Java Exercises ends with "se"? True
*/
package com.module2;

public class Q17_StringEndsContent 
{
	public static void main(String[] args) 
	{
		String s1="Java Exercises";
		String s2="Java Exercise";
		
		System.out.println("Chech String 1 = " +s1.endsWith("se"));
		System.out.println("Chech String 2 = " +s2.endsWith("se"));
	}
}
