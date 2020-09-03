/*
Write a Java program to calculate the minimum of three integer numbers:

****************
Program : 
****************
*/

import java.util.*;
class Minimum
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		a = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		b = sc.nextInt();
		
		System.out.print("Enter Third Number : ");
		c = sc.nextInt();
		
		if(a==b && b==c)
		{
			System.out.println("all are same" + a);
		}
		else
		{
			if(a < b)
			{
				if(a < c)
					System.out.println(a + " is Smallest");
				else
					System.out.println(c + " is Smallest");						
			}
			else
			{
				if(c < b)
					System.out.println(c + " is Smallest");
				else
					System.out.println(b + " is Smallest");
			}
		}		
	}
}

/*
****************
Output : 
****************

D:\java\ass1>javac Minimum.java

D:\java\ass1>java Minimum
Enter First Number : 5
Enter Second Number : 5
Enter Third Number : 5
all are same 5

D:\java\ass1>java Minimum
Enter First Number : 2
Enter Second Number : 10
Enter Third Number : 8
2 is Smallest
*/