/*
Convert Minutes into years and days
For Eg. Input =&gt; 3456789
Output =&gt; 6 Years and 210 days
WAP to display environment variables like PATH, TEMP, USERNAME

****************
Program : 
****************
*/

import java.util.*;
class Convert_Minutes
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter mins=");
		int min = sc.nextInt();
		
		int day = min/1440;
		
		int year = day/365;
		
		day = day%365;
		
		System.out.println("Minutes=" + min);
		System.out.println(year + " Years and " + day + " days");
	}
}

/*
****************
Output : 
****************

Z:\java\assignment 2>javac Convert_Minutes.java

Z:\java\assignment 2>java Convert_Minutes
Enter mins=3456789
Minutes=3456789
6 Years and 210 days

Z:\java\assignment 2>
*/