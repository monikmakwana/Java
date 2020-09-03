/*
Q : Program in Java to find A+B, A-B, A*B and transpose of A, where A is a matrix of 3*3 and B is a matrix of 3*4. Take the values
     in matrixes A and B from the user.

****************
Program : 
****************
*/

import java.util.*;
import java.lang.*;
class matrix
{
	int r,c;
	int x[][];
	matrix()
	{
		r=0;
		c=0;
	}
	matrix(int a,int b)
	{
		r=a;
		c=b;
		x=new int[r][c];
	}
	void insert()
	{
		Scanner scan=new Scanner(System.in);
		
		int i,j;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				x[i][j]=scan.nextInt();
			}
		}
	}
	int gr()
	{
		return r;
	}
	int gc()
	{
		return c;
	}
	void display()
	{
		int i,j;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	void sum(matrix y)
	{
		if(this.r==y.gr() && this.c==y.gc())
		{
			matrix z=new matrix(this.r,this.c);
			int i,j;
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					z.x[i][j]=x[i][j]+y.x[i][j];
				}
			}
			z.display();
		}
		else
		{
			System.out.println("Dimensions of both the matrix are not same so addition can't be done!");
		}
	}
	void sub(matrix y)
	{
		if(this.r==y.gr() && this.c==y.gc())
		{
			matrix z=new matrix(this.r,this.c);
			int i,j;
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					z.x[i][j]=x[i][j]-y.x[i][j];
				}
			}
			z.display();
		}
		else
		{
			System.out.println("Dimensions of both the matrix are not same so subtraction can't be done!");
		}
	}
	void mul(matrix y)
	{
		if(this.c==y.gr())
		{
			matrix z=new matrix(this.r,y.gc());
			int i,j,k,s=0;
			for(i=0;i<r;i++)
			{
				for(j=0;j<y.gc();j++)
				{
					s=0;
					for(k=0;k<c;k++)
					{
						s=s+x[i][k]*y.x[k][j];
					}
					z.x[i][j]=s;
				}
			}
			z.display();
		}
		else
		{
			System.out.println("Dimensions of both the matrix are not same so multiplication can't be done!");
		}
	}
	void transpose()
	{
		int i,j;
		matrix t=new matrix(this.c,this.r);
		for(i=0;i<this.r;i++)
		{
			for(j=0;j<this.c;j++)
			{
				t.x[j][i]=x[i][j];
			}
		}
		System.out.println("Transpose of a Matrix: ");
		t.display();
	}
}

public class Matrix_Prg
{
	public static void main(String args[])
	{
		int r,c;
		char temp=49,temp2=49;
		Scanner scan=new Scanner(System.in);
		while(temp==49)
		{
			System.out.print("\nEnter Row of first matrix: ");
			r=scan.nextInt();
			System.out.print("Enter Column of first matrix: ");
			c=scan.nextInt();
			matrix m=new matrix(r,c);
			System.out.print("Enter elements in matrix 1:\n");
			m.insert();
			System.out.print("\nEnter Row of second matrix: ");
			r=scan.nextInt();
			System.out.print("Enter Column of second matrix: ");
			c=scan.nextInt();
			matrix n=new matrix(r,c);
			System.out.print("Enter elements in matrix 2:\n");
			n.insert();
			temp2=49;
			while(temp2>=49 && temp2<=56)
			{			
				System.out.println("\n1 :  Displaying elements in both the matrix: ");
				System.out.println("2 :  Displaying addition of both the matrix: ");				
				System.out.println("3 :  Displaying subtraction of both the matrix: ");				
				System.out.println("4 :  Displaying multiplication of both the matrix: ");
				System.out.println("5 :  Displaying transpose of A matrix: ");
				System.out.println("6 :  Displaying transpose of B matrix: ");
				System.out.println("7 :  Run Again ");
				System.out.println("8 :  Exit ");
				System.out.print("\nEnter Your Choice : ");
				temp2=scan.next().charAt(0);
				if(temp2==49)
				{
					System.out.print("Elements in matrix 1:\n");
					m.display();
					System.out.print("Elements in matrix 2:\n");
					n.display();					
				}
				else if(temp2==50)
				{
					m.sum(n);
				}
				else if(temp2==51)
				{
					m.sub(n);
				}
				else if(temp2==52)
				{
					m.mul(n);
				}
				else if(temp2==53)
				{
					m.transpose();
				}
				else if(temp2==54)
				{
					n.transpose();
				}
				else if(temp2==55)
				{
					temp2=48;
				}
				else if(temp2==56)
				{
					temp2=48;
					temp=48;
				}
			}
		}
	}
}

/*
****************
Output : 
****************

E:\Java>javac Matrix_Prg.java

E:\Java>java Matrix_Prg

Enter Row of first matrix: 3
Enter Column of first matrix: 3
Enter elements in matrix 1:
1
2
3
4
5
6
7
8
9

Enter Row of second matrix: 3
Enter Column of second matrix: 3
Enter elements in matrix 2:
1
2
3
4
5
6
7
8
9

1 :  Displaying elements in both the matrix:
2 :  Displaying addition of both the matrix:
3 :  Displaying subtraction of both the matrix:
4 :  Displaying multiplication of both the matrix:
5 :  Displaying transpose of A matrix:
6 :  Displaying transpose of B matrix:
7 :  Run Again
8 :  Exit

Enter Your Choice : 1
Elements in matrix 1:
1 2 3
4 5 6
7 8 9
Elements in matrix 2:
1 2 3
4 5 6
7 8 9

1 :  Displaying elements in both the matrix:
2 :  Displaying addition of both the matrix:
3 :  Displaying subtraction of both the matrix:
4 :  Displaying multiplication of both the matrix:
5 :  Displaying transpose of A matrix:
6 :  Displaying transpose of B matrix:
7 :  Run Again
8 :  Exit

Enter Your Choice : 2
2 4 6
8 10 12
14 16 18

1 :  Displaying elements in both the matrix:
2 :  Displaying addition of both the matrix:
3 :  Displaying subtraction of both the matrix:
4 :  Displaying multiplication of both the matrix:
5 :  Displaying transpose of A matrix:
6 :  Displaying transpose of B matrix:
7 :  Run Again
8 :  Exit

Enter Your Choice : 3
0 0 0
0 0 0
0 0 0

1 :  Displaying elements in both the matrix:
2 :  Displaying addition of both the matrix:
3 :  Displaying subtraction of both the matrix:
4 :  Displaying multiplication of both the matrix:
5 :  Displaying transpose of A matrix:
6 :  Displaying transpose of B matrix:
7 :  Run Again
8 :  Exit

Enter Your Choice : 5
Transpose of a Matrix:
1 4 7
2 5 8
3 6 9

1 :  Displaying elements in both the matrix:
2 :  Displaying addition of both the matrix:
3 :  Displaying subtraction of both the matrix:
4 :  Displaying multiplication of both the matrix:
5 :  Displaying transpose of A matrix:
6 :  Displaying transpose of B matrix:
7 :  Run Again
8 :  Exit

Enter Your Choice : 7

Enter Row of first matrix: 2
Enter Column of first matrix: 3
Enter elements in matrix 1:
1
2
3
4
5
6

Enter Row of second matrix: 3
Enter Column of second matrix: 2
Enter elements in matrix 2:
1
2
3
4
5
6

1 :  Displaying elements in both the matrix:
2 :  Displaying addition of both the matrix:
3 :  Displaying subtraction of both the matrix:
4 :  Displaying multiplication of both the matrix:
5 :  Displaying transpose of A matrix:
6 :  Displaying transpose of B matrix:
7 :  Run Again
8 :  Exit

Enter Your Choice : 1
Elements in matrix 1:
1 2 3
4 5 6
Elements in matrix 2:
1 2
3 4
5 6

1 :  Displaying elements in both the matrix:
2 :  Displaying addition of both the matrix:
3 :  Displaying subtraction of both the matrix:
4 :  Displaying multiplication of both the matrix:
5 :  Displaying transpose of A matrix:
6 :  Displaying transpose of B matrix:
7 :  Run Again
8 :  Exit

Enter Your Choice : 2
Dimensions of both the matrix are not same so addition can't be done!

1 :  Displaying elements in both the matrix:
2 :  Displaying addition of both the matrix:
3 :  Displaying subtraction of both the matrix:
4 :  Displaying multiplication of both the matrix:
5 :  Displaying transpose of A matrix:
6 :  Displaying transpose of B matrix:
7 :  Run Again
8 :  Exit

Enter Your Choice :
*/