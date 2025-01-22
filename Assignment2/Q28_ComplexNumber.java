/* Print the sum, difference and product of two complex numbers by
creating a class named 'Complex' with separate methods for each operation
whose real and imaginary parts are entered by user.*/

package com.module2;
class Complex
{
	int a;
	int b;
	 
	public void sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		
		System.out.println("Sum of Number = " + (a+b));
	}
	
	public void diff()
	{
		System.out.println("Difference of Number = " + (a-b));
	}
	
	public void product()
	{
		System.out.println("Product of Number = " + (a*b));
	}
}
public class Q28_ComplexNumber
{
	public static void main(String[] args) 
	{
		Complex c=new Complex();
		
		c.sum(12, 10);
		c.diff();
		c.product();
	}

}
