/*
Write a program that displays all the possible factors of a particular number.

****************
Program : 
****************
*/

import java.util.Scanner;
class Factor
{
	public static void main(String args[])
	{	
	int f,i;
	Scanner sc=new Scanner(System.in);
	System.out.print("\nEnter Number To Find Factors of Number :");
	f=sc.nextInt();	
	System.out.println("\nDisplay Factors of Number "+f+" :\n");	

	for(i=1;i<=f;i++)
	{
		if(f%i==0)
		{
			System.out.print(i +"\t");
		}
	}
	}
}

/*
****************
Output : 
****************

D:\java>javac Factor.java

D:\java>java Factor

Enter Number To Find Factors of Number :20

Display Factors of Number 20 :

1       2       4       5       10      20
D:\java>
*/