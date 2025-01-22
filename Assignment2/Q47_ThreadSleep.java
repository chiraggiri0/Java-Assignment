/*W.A.J.P to create 2 threads and execute that threads by providing sleep time as 
2000ms and check the execution*/
package com.module2;

class NewThr extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
		System.out.println( 1+"."+ i +" Thread is Running..");
		try 
		{
			Thread.sleep(2000);
			
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
}
class NewThr2 extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
		System.out.println( 1+"."+ i +" Thread is Running..");
		try 
		{
			Thread.sleep(2000);
			
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
}
public class Q47_ThreadSleep 
{
	public static void main(String[] args) 
	{
		NewThr N=new NewThr();
		N.start();
		
		NewThr2 N2=new NewThr2();
		N2.start();
	}
}
