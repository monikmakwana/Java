/*
Print following pattern.

1
01
101
0101
10101
010101

****************
Program : 
****************
*/

import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				if((i+j)%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println("\n");
		}
	}
}

/*
****************
Output : 
****************

Z:\java\assignment 2>javac Pattern.java

Z:\java\assignment 2>java Pattern
Enter number of rows : 6
1

01

101

0101

10101

010101


Z:\java\assignment 2>
*/