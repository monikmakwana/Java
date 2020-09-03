/*
Q:  Write a program in Java to create variable size array. Data can be numeric.
		-> Flush an array
		-> add a number at a specified location in an anay.
		-> display the array


****************
Program : 
****************
*/

import java.util.*;
import java.lang.*;
class Array_Op
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("\nEnter Number of elements : ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("\nEnter Elements :\n");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\nElements in array : ");
		for(int i:a)
		{
			System.out.println(i);
		}
		a=null;
		System.out.println("flushed");
		System.out.println("\nEnter Elements Again : \n");
		a=new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\nElements in Array : ");
		for(int i:a)
		{
			System.out.println(i);
		}
		int nn,ni;
		System.out.print("\nEnter the number to add in array : ");
		nn=sc.nextInt();
		System.out.println("Enter the index at which you want to add the number : ");
		ni=sc.nextInt();
		a[ni]=nn;
		System.out.println("Elements in Array : ");
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}

/*
****************
Output : 
****************

Z:\Java\Assignment 2>javac Array_Op.java

Z:\Java\Assignment 2>java Array_Op

Enter Number of elements : 5

Enter Elements :

10
20
30
40
50

Elements in array :
10
20
30
40
50
flushed

Enter Elements Again :

60
70
80
90
100

Elements in Array :
60
70
80
90
100

Enter the number to add in array : 110
Enter the index at which you want to add the number :
2
Elements in Array :
60
70
110
90
100

Z:\Java\Assignment 2>
*/