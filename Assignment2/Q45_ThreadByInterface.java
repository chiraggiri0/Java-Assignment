/*W.A.J. P to create one thread by implementing Runnable interface in 
Class.*/

package com.module2;
class Thr implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		System.out.println("Thread is Running...");
	}
	
}
public class Q45_ThreadByInterface 
{
	public static void main(String[] args)
	{
		
	
	Thr t=new Thr();
	
	Thread T=new Thread(t);
	T.start();
	}
}
