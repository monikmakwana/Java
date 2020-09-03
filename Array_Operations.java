/*
Q:  Write application that creates an array of double, to provide following functionality.
	-> display the length of the array and its elements.
	-> Display an array. (Use for each version of loop for display).
	-> compute the sume of the squares of these numbers.
	-> Determine Mean and Median of anarray.
	-> Sort an array – Ascending and Descending. Use any two sorting algorithm. User can also select the sorting method.
	-> Search an element from the array, i.e.returns the location of the element of an array that matches an indicated value.
	-> Copy of an array.
	-> Reverse of an array.


****************
Program : 
****************
*/

import java.util.*;
import java.lang.*;

public class Array_Operations
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Number of elements : ");
		n=sc.nextInt();		
		double a[]=new double[n];
		System.out.println("\nEnter values of elements\n\n");
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter value for element "+i+" : ");
			a[i]=sc.nextDouble();
		}
		System.out.println("\nLength is = "+a.length);
		System.out.println();
		System.out.println("Elements of array : ");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("\nBy Using for each loop : ");
		for(double i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Sum of square of all elements : ");
		double s=0;
		for(double i:a)
		{
			s=s+(Math.pow(i,2));
		}
		System.out.print(s);
		double m,md;
		int tn=n/2;
		double tta[]=new double[a.length];
		tta=a;
		for(int i=0;i<n-1;i++)
		{
			double temp;
			for(int j=0;j<n-i-1;j++)
			{
				if(tta[j]>tta[j+1])
				{
					temp=tta[j+1];
					tta[j+1]=tta[j];
					tta[j]=temp;
				}
			}
		}
		
		if(tn%2==0)
		{
			md=tta[tn];
		}
		else
		{
			md=(tta[tn]+tta[tn+1])/2;			
		}
		s=0;
		for(double i:a)
		{
			s=s+i;
		}
		m=s/n;
		double temp;
		int in;
		System.out.println();
		System.out.println("\nMean of Array = "+m+"\nMedian of Array = "+md);
		char c=49,pc=49;
		System.out.print("\nEnter 1 to sort in ascending \nEnter 2 to sort in descending\nEnter Your Choice = ");
		pc=sc.next().charAt(0);
		System.out.print("\nEnter 1 to sort using Selection sort \nEnter 2 to sort using Bubble sort\nEnter Your Choice = ");
		c=sc.next().charAt(0);
		if(pc==49)
		{
		if(c==49)
		{
		System.out.println("\nSelection Sort : ");
		for(int i=0;i<n-1;i++)
		{
			temp=a[i];
			in=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					in=j;
					temp=a[j];
				}
			}
			a[in]=a[i];
			a[i]=temp;
		}
		for(double i:a)
		{
			System.out.print(i+" ");
		}
		}
		else if(c==50)
		{
		System.out.println("\nBubble Sort : ");
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(double i:a)
		{
			System.out.print(i+" ");
		}
		}
		}
		else if(pc==50)
		{
			if(c==49)
			{
				System.out.println("\nSelection Sort : ");
				for(int i=0;i<n-1;i++)
				{
					temp=a[i];
					in=i;
					for(int j=i+1;j<n;j++)
					{
						if(a[i]<a[j])
						{
							in=j;
							temp=a[j];
						}
					}
					a[in]=a[i];
					a[i]=temp;
				}
				for(double i:a)
				{
					System.out.print(i+" ");
				}
			}
			else if(c==50)
			{
				System.out.println("\nBubble Sort : ");
				for(int i=0;i<n-1;i++)
				{
					for(int j=0;j<n-i-1;j++)
					{
						if(a[j]<a[j+1])
						{
							temp=a[j+1];
							a[j+1]=a[j];
							a[j]=temp;
						}
					}
				}
				for(double i:a)
				{
					System.out.print(i+" ");
				}
			}
		}
		int f=0;
		System.out.println();
		System.out.print("\nEnter number to Search : ");
		temp=sc.nextDouble();
		in=0;
		for(int i=0; i<n; i++)
		{
			if(a[i]==temp)
			{
				f=1;
				in=i;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("Element = "+temp+" found at index = "+in);
		}
		else
		{
			System.out.println("Element = "+temp+" Not found");
		}
		System.out.println();
		System.out.println("Copying elements to another Array : ");
		Double b[]=new Double[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(double i:b)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("\nReversing an array : ");
		n=b.length;
		for(int i=0; i<b.length/2;i++)
		{
			temp=b[i];
			b[i]=b[n-i-1];
			b[n-i-1]=temp;
		}
		for(int i=0; i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}

/*
****************
Output : 
****************
Z:\Java\Assignment 2>javac Array_Operations.java

Z:\Java\Assignment 2>java Array_Operations

Enter Number of elements : 5

Enter values of elements


Enter value for element 0 : 10
Enter value for element 1 : 20
Enter value for element 2 : 30
Enter value for element 3 : 40
Enter value for element 4 : 50

Length is = 5

Elements of array :
10.0 20.0 30.0 40.0 50.0

By Using for each loop :
10.0 20.0 30.0 40.0 50.0
Sum of square of all elements :
5500.0

Mean of Array = 30.0
Median of Array = 30.0

Enter 1 to sort in ascending
Enter 2 to sort in descending
Enter Your Choice = 1

Enter 1 to sort using Selection sort
Enter 2 to sort using Bubble sort
Enter Your Choice = 1

Selection Sort :
10.0 20.0 30.0 40.0 50.0

Enter number to Search : 30
Element = 30.0 found at index = 2

Copying elements to another Array :
10.0 20.0 30.0 40.0 50.0

Reversing an array :
50.0 40.0 30.0 20.0 10.0

Z:\Java\Assignment 2>
*/