/*• W.A.J. P to create one thread by extending Thread class in another Class*/
package com.module2;

class Thr1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running...");
	}
}
public class Q46_ThreadByExtendClass 
{
	public static void main(String[] args) 
	{
		Thr1 t=new Thr1();
		t.start();
	}

}
