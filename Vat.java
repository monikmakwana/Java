/*
WAP in JAVA that calculates the VAT on an amount of sale.
	The program takes amount of sales and VAT rateas input and
	outputs the total amount inclusive of VAT.

****************
Program : 
****************
*/

import java.util.*;
class Vat
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Amount : ");
		int amt = sc.nextInt();		
		System.out.print("Enter var=");
		int v = sc.nextInt();
		int t = amt + amt*v/100;
		
		System.out.println("\nAmount : " + amt);
		System.out.println("Vat : " + v);
		System.out.println("\nTotal Amount : " + t);		
	}
}

/*
****************
Output : 
****************
D:\java\ass1>javac Vat.java

D:\java\ass1>java Vat
Enter Amount : 30000
Enter Vat : 12

Amount : 30000
Vat : 12

Total Amount : 33600
*/