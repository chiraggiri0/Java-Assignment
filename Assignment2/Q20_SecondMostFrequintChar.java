/*W.A.J.P to find the second most frequent character in a given string. The given string 
is: successes The second most frequent char in the string is: c
*/
package com.module2;

public class Q20_SecondMostFrequintChar
{
	public static void main(String[] args) 
	{
		String st="successes";
		String y = null;
		y=st;
		int temp=0;
		int j=0;
		char[] str=st.toCharArray();
		
		for(int i=0; i<str.length ;i++)
		{	
			if(str[j]==str[i])
			{
				temp++;
			}
			if(i==str.length)
			{
				j++;
				i=0;
			}
		}
		System.out.println(temp);
	}
}
