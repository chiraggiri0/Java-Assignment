/*W.A.J.P to get the character at the given index within the String. Original
String = Tops Technologies! The character at position 0 is T, 
The character at position 10 is o*/
package com.module2;

import java.util.Scanner;

public class Q14_IndexChar
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String = ");
		String str=sc.nextLine();
		
		System.out.println("Enter the Index Position= ");
		int pos=sc.nextInt();
		System.out.println(str.charAt(pos));
	}

}
