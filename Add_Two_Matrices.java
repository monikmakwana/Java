/*
Write a java program to add two matrices of same size.

****************
Program : 
****************
*/

import java.util.*;
class Add_Two_Matrices
{
	public static void main(String args[])
	{
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		int c[][] = new int[5][5];
		
		int row1,col1,row2,col2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Matrix\n");
		
		System.out.print("Enter Row : ");
		row1 = sc.nextInt();
		
		System.out.print("Enter Column : ");
		col1 = sc.nextInt();
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				System.out.print("Enter Data : ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nSecond Matrix\n");
		
		System.out.print("Enter Row : ");
		row2 = sc.nextInt();
		
		System.out.print("Enter Column : ");
		col2 = sc.nextInt();
		
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				System.out.print("Enter Data = ");
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n\t1st MATRIX\n");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");			
		}
		
		System.out.println("\n\t2nd MATRIX\n");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				System.out.print(b[i][j] + "\t");
			}
			System.out.println("\n");			
		}
		
		if(row1==row2 && col1==col2)
		{
		
			System.out.println("\nAddition of 2 matrix\n");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					c[i][j] = a[i][j] + b[i][j];
					System.out.print(c[i][j] + "\t");
				}
				System.out.println("\n");			
			}
		
		}
		else
		{
			System.out.println("Addition is not possible");
		}		
	}
}

/*
****************
Output : 
****************

Z:\java\assignment 2>javac Add_Two_Matrices.java

Z:\java\assignment 2>java Add_Two_Matrices
First Matrix

Enter Row : 3
Enter Column : 3
Enter Data : 10
Enter Data : 20
Enter Data : 30
Enter Data : 40
Enter Data : 50
Enter Data : 60
Enter Data : 70
Enter Data : 80
Enter Data : 90

Second Matrix

Enter Row : 3
Enter Column : 3
Enter Data = 1
Enter Data = 2
Enter Data = 3
Enter Data = 4
Enter Data = 5
Enter Data = 6
Enter Data = 7
Enter Data = 8
Enter Data = 9

        1st MATRIX

10      20      30

40      50      60

70      80      90


        2nd MATRIX

1       2       3

4       5       6

7       8       9


Addition of 2 matrix

11      22      33

44      55      66

77      88      99


Z:\java\assignment 2>



Z:\java\assignment 2>javac Add_Two_Matrices.java

Z:\java\assignment 2>java Add_Two_Matrices
First Matrix

Enter Row : 2
Enter Column : 2
Enter Data : 10
Enter Data : 20
Enter Data : 30
Enter Data : 40

Second Matrix

Enter Row : 4
Enter Column : 4
Enter Data = 1
Enter Data = 2
Enter Data = 3
Enter Data = 4
Enter Data = 5
Enter Data = 6
Enter Data = 7
Enter Data = 8
Enter Data = 9
Enter Data = 10
Enter Data = 11
Enter Data = 12
Enter Data = 13
Enter Data = 14
Enter Data = 15
Enter Data = 16

        1st MATRIX

10      20

30      40


        2nd MATRIX

1       2       3       4

5       6       7       8

9       10      11      12

13      14      15      16

Addition is not possible

Z:\java\assignment 2>
*/