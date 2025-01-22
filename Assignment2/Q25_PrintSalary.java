/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.
*/

package com.module2;
class Member
{
	String Name="Yash";
	int Age=21;
	long Pno=951090017;
	String Adr="Stavan parishray,Gota,Ahmedabad";
	int salary=10000;
	
	public void printSalary()
	{
		System.out.println("Name= " + Name);
		System.out.println("Age = " +Age);
		System.out.println("Pno = "+ Pno);
		System.out.println("Address = " + Adr);
		System.out.println("Salary = " + salary);
	}
}
public class Q25_PrintSalary 
{
	public static void main(String[] args) 
	{
		Member M=new Member();
		
		M.printSalary();
	}

}
