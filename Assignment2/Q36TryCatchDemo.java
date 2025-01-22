package com.module2;

public class Q36TryCatchDemo 
{
	public static void main(String[] args) 
	{
		int a=0;
		try
		{
			int j=10/a;
			
			System.out.println("Answer is =" + j);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
