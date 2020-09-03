/*

Write a program that reads a Distance in kilometers from the keyboard  and output the Distance as miles.

****************
Program : 
****************
*/

import java.util.*;
class Distance
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter kilometers : ");
		double km = sc.nextDouble();
		double miles = (0.621371*km);
		
		System.out.println("Kilometers : " + km);
		
		System.out.println("Miles : " + miles);
		
	}
}

/*
****************
Output : 
****************
D:\java\ass1>javac Distance.java

D:\java\ass1>java Distance
Enter kilometers : 25
Kilometers : 25.0
Miles : 15.534279

*/