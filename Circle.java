/*
Write a program that accepts radius of a Circle and display area of Circle..

****************
Program : 
****************
*/

import java.util.Scanner;
class Circle
{
	public static void main(String args[])
	{
		double pi=3.14;
		Scanner r = new Scanner(System.in);
		double ans;
		System.out.print("\nEnter Value of Radius : ");
		ans=r.nextDouble();
		System.out.println("\nArea of Circle : "+ pi * ans * ans);
	}
}

/*
****************
Output : 
****************

D:\java>javac Circle.java

D:\java>java Circle

Enter Value of Radius : 50

Area of Circle : 7850.0

D:\java>
*/