package com.module2;

class ThreadTwice extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running..");
	}
}
public class Q48_ThreadTwice 
{
	public static void main(String[] args) 
	{	
		ThreadTwice t1=new ThreadTwice();
		
		t1.start();
		t1.start();
	}
}
