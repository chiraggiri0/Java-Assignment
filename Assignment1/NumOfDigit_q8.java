/*Write a Java program that reads a positive integer and count the number of digits the 
number.
Input an integer number less than ten billion: 125463 
Number of digits in the number: 6*/

package com.module1;

public class NumOfDigit_q8 
{
	public static void main(String[] args) 
	{
		int in=234567;
		
		if(in<0)
			System.out.println(in + " Number is Negetive Number..");
		
		int i=0;
		int count;
		int rem;
		while(in!=0)
		{
			rem=in%10;
			in=in/10;
			i++;
		}
		System.out.println("Number of Digit is " + i);
	}

}
