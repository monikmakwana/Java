/*
Write a java program to calculate Simple Interest using Command Line Arguments.(Hint use Wrapper classes)

****************
Program : 
****************
*/

import java.util.*;
class Simple_Interest
{
	public static void main(String args[])
	{
		int amt = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		
		System.out.println("\nAmount : " + amt);
		System.out.println("Rate : " + rate);
		System.out.println("Number of Time : " + n);
		System.out.println("Simple Interest : " + (amt*rate*n)/100);
	}
}

/*
****************
Output : 
****************

D:\java\ass1>javac Simple_Interest.java

D:\java\ass1>java Simple_Interest 15000 9 2

Amount : 15000
Rate : 9.0
Number of Time : 2
Simple Interest : 2700.0
*/