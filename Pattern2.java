/*
Write a program to print the following Pattern :
	****
	***
	**
	*

****************
Program : 
****************
*/

import java.util.*;
class Pattern2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of lines : ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
}

/*------------------------

****************
Output : 
****************

D:\java\ass1>javac Pattern2.java

D:\java\ass1>java Pattern2
Enter number of lines : 4
* * * *

* * *

* *

*

------------------------*/