/*W.A.J.P to check whether a given string starts with the contents of another string. 
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts 
with Red? False
*/
package com.module2;

public class Q18_StringStartContent 
{
	public static void main(String[] args) 
	{
	String s1="Red is favorite color";
	String s2="Orange is also my favorite color";
	
	System.out.println("Check String 1 = " + s1.startsWith("Red"));
	System.out.println("Check String 2 =" +s2.startsWith("Red"));
	}
	
}
