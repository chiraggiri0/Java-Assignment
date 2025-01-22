/*Write a program in Java to make such a pattern like right angle triangle with number 
increased by 1 The pattern like:
1
2 3
4 5 6
7 8 9 10
*/
package com.module2;

public class Q7_Right_Triangle2 
{

	public static void main(String[] args)
	{
		int q=1;
		for(int r=0; r<4; r++)
		{
			for(int j=0; j<=r; j++)
			{
				System.out.print(q);
				q++;
			}
			System.out.println();
		}

	}

}
