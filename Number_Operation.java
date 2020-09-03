/*
Write and run a Java program to calculate factorial and the cube of the given integer number.Also find the sum and multiplication of its digits.Also check whether the no entered is palindrome or not.

****************
Program : 
****************
*/

import java.util.*;
class Number_Operation
{
	static void factorial(int n)
	{
		double f = 1.0;
		for(int i=n;i>0;i--)
			f = f*i;
		
		System.out.println("\nNumber : " + n);
		System.out.println("Factorial : " + f);
	}
	
	static void oper(int n)
	{
		int s=0,m=1,r=0,p=0,t=n;
		
		while(t>0)
		{
			r = t%10;			
			p = (p*10) + r;			
			s = s+r;
			m = m*r;			
			t = t/10;
		}
		
		System.out.println("Sum : " + s);
		System.out.println("Multiplication : " + m);
		
		if(n==p)
			System.out.println("\n" + n + " is Paliondrome");
		else
			System.out.println("\n" + n + " is not Palindrom");
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		
		factorial(n);	
		System.out.println("Cube : " + (n*n*n));		
		oper(n);		
	}
}

/*
****************
Output : 
****************

D:\java\ass1>javac Number_Operation.java

D:\java\ass1>java Number_Operation
Enter Number : 5

Number : 5
Factorial : 120.0
Cube : 125
Sum : 5
Multiplication : 5

5 is Paliondrome
*/