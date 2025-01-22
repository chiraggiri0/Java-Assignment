/*W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch 
block. 
try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code}
*/

package com.module2;

public class Q39NestingTryCatch 
{
	public static void main(String[] args) 
	{
		
	int arr[]=new int[4];
		try
		{
		try
		{
			//int j=10/0;
		
			for(int i=0; i<5; i++)
			{
			arr[i]=i;
			}
		}finally
		{
			System.out.println("this is Finally block");
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
