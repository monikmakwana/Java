/*

Write an application that generates the first 15 number in the Fibonacci series and first 15 prime number.

****************
Program : 
****************
*/

import java.util.*;
class First_Num
{
	static void prime_no(int n)
	{
		int c=1,p=2,f=0;
		
		System.out.println("\n Prime Numbers :\n");
		System.out.println("\t" + (c) + " -> " + p);
		p++;
		
		while(c<n)
		{
			f = 0;
			if(p%2!=0)
			{
				for(int i=p-1;i>=3;i--)
				{
					if(p%i==0)
					{
						f=1;
						break;
					}						
				}
				
				if(f==0)
				{
					System.out.println("\t" + (c+1) + " -> " + p);
					c++;
				}
			}
			p++;
		}
	}
	
	static void fibonacci(int n)
	{
		int f=0,s=1,c=0,t;
		
		System.out.println("\n Fibonacci Numbers :\n");
		
		while(c<n)
		{
			System.out.println("\t" + (c+1) + " -> " + f);
			
			c++;
			t = f+s;
			f = s;
			s = t;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Numbers : ");
		int n = sc.nextInt();
				
		prime_no(n);

		fibonacci(n);
	}
}

/*
****************
Output : 
****************

D:\java\ass1>javac First_Num.java

D:\java\ass1>java First_Num
Enter Total Numbers : 20

 Prime Numbers :

        1 -> 2
        2 -> 3
        3 -> 5
        4 -> 7
        5 -> 11
        6 -> 13
        7 -> 17
        8 -> 19
        9 -> 23
        10 -> 29
        11 -> 31
        12 -> 37
        13 -> 41
        14 -> 43
        15 -> 47
        16 -> 53
        17 -> 59
        18 -> 61
        19 -> 67
        20 -> 71

 Fibonacci Numbers :

        1 -> 0
        2 -> 1
        3 -> 1
        4 -> 2
        5 -> 3
        6 -> 5
        7 -> 8
        8 -> 13
        9 -> 21
        10 -> 34
        11 -> 55
        12 -> 89
        13 -> 144
        14 -> 233
        15 -> 377
        16 -> 610
        17 -> 987
        18 -> 1597
        19 -> 2584
        20 -> 4181
		
*/