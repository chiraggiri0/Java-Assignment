/* Create an abstract class 'Bank' with an abstract method 'getBalance'.
$100, $150 and$200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC'are subclasses of class 'Bank', each having 
a method named 'getBalance'. Call this method by creating an object of 
each of the three classes.*/

package com.module2;

abstract class Bank
{
	public abstract void getBalance(); 
}

class BankA extends Bank
{
	int bal=100;

	@Override
	public void getBalance() 
	{
		System.out.println("Total Balance of Bank A is = " +bal );		
	}
	
}

class BankB extends Bank
{
	int bal=150;
	@Override
	public void getBalance() 
	{
		System.out.println("Total Balance of Bank B is = " +bal);
		
	}

}

class BankC extends Bank
{
	int bal=200;
	
	@Override
	public void getBalance() 
	{
		System.out.println("Total Balance of Bank c is = " +bal);		
	}
	
}
public class Q30_AbstractBank 
{
	public static void main(String[] args) 
	{
		BankA A=new BankA();
		
		A.getBalance();
		

		BankB B=new BankB();
		
		B.getBalance();
		

		BankC C=new BankC();
		
		C.getBalance();
		
	}
}
