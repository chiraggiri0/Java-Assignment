/*Write a program in Java to display the pattern like right angle triangle with a number.
1
12
123
1234
12345
*/


package com.module2;

public class Q6_Right_Trianlge 
{
	public static void main(String[] args)
	{
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		
	}

}
