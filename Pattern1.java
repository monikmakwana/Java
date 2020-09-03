/*
Write a program to print the pattern using for loop

1 1 1
2 4 8
3 9 27
………………………
10 100 1000

****************
Program : 
****************
*/

import java.util.*;
class Pattern1
{
	public static void main(String[] args)
	{
		int n,i,ans;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nHow many Numbers of lines you want to print : ");
		n=sc.nextInt();
		System.out.println();
		for(i=1;i<=n;i++)
		{
			ans=i;
			for(int j=0;j<3;j++)
			{
				System.out.print(ans + "\t");
				ans=ans*i;
			}
			System.out.println();
				
		}
		
		//Another Way...
		/*
		for(i=1;i<=n;i++)
		{
			System.out.print(i+"\t"+ (i*i) + "\t" + (i*i*i) + "\n" );
		}
		*/
		
		//Another Way...	
		/*
		for(i=1;i<=n;i++)
		{
			System.out.print(i+"\t"+ (int)Math.pow(i,2)+"\t"+ (int)Math.pow(i,3)+"\n");
		}
		*/
		
	}
}

/*
****************
Output : 
****************

E:\Java>javac Pattern1.java

E:\Java>java Pattern1

How many Numbers of lines you want to print : 10

1       1       1
2       4       8
3       9       27
4       16      64
5       25      125
6       36      216
7       49      343
8       64      512
9       81      729
10      100     1000

E:\Java>
*/