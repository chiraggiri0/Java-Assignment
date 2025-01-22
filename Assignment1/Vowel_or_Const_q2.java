/*Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message.*/
package com.module1;

public class Vowel_or_Const_q2 
{
	public static void main(String[] args)
	{
		char ch='z';
		
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i'|| ch=='I' || 
					ch=='o' || ch=='O')
			{
				System.out.println(ch + " is a Vowel..");
			}
			else
			{
				System.out.println(ch + " is a Consonant..");
			}
		}
		else
		{
			System.out.println("Error: Letter must between(a and z or A and Z), with <1 lenght");
		}
	}

}
