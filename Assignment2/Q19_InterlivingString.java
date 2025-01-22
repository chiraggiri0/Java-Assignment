/*W.A.J.P to find all interleaving of given strings.  
The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ*/

package com.module2;

public class Q19_InterlivingString 
{
	public static void main(String[] args) 
	{	
		String s1="WX";
		String s2="YZ";
		int i=0,j=1,p=1;
		do {
		System.out.println(s1.charAt(i)+""+s1.charAt(j)+s2.charAt(i)+s2.charAt(j));
		
		System.out.println(s2.charAt(i)+""+s2.charAt(j)+s1.charAt(i)+s1.charAt(j));
		
		if(i==0 && j==1)
		{
			i=1;
			j=0;
		}

		p++;
		}while(p!=5);
	}
}
