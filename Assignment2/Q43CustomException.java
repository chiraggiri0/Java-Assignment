/*W.A.J.P to create a custom exception if Customer withdraw amount which is greater
than account balance then program will show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 
2500*/
package com.module2;

import java.util.Scanner;

class YashCustomException extends Exception
{
}
class BankOperation
{
	int amount=2000;
	int width;
	
	public void enterWidthAmount()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Withdrawal amount = ");
	
	width=sc.nextInt();
	}
	
	public void checkException() throws YashCustomException
	{
		if(width>amount)
		{
			throw new YashCustomException();
		}
		else
		{
			System.out.println(width + "amount Widthdrawl Succesfully..");
		}
	}
}
 
public class Q43CustomException 
{
	public static void main(String[] args) 
	{
		BankOperation q=new BankOperation();
		
		q.enterWidthAmount();
		
		try 
		{
			q.checkException();
		} 
		catch (YashCustomException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Sorry, insufficient balance, you need more"  + (q.width-q.amount) + "Rs. To perform this transaction.");
		}
	}

}
