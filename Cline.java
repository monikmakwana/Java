/*
Write an application that counts the total number of characters in all of its command-line arguments.

****************
Program : 
****************
*/

import java.util.*;
class Cline
{
	public static void main(String args[])
	{
		int ch = 0;
		
		System.out.println("\nArguments : ");
		for(int i=0;i<args.length;i++)
		{
			System.out.print(args[i] + "\t");
			ch = ch + args[i].length();
		}
		
		System.out.println("\nNumber of characters : " + ch);			
	}
}

/*
****************
Output : 
****************

D:\java\ass1>javac Cline.java

D:\java\ass1>java Cline monik makwana

Arguments :
monik   makwana
Number of characters : 12
*/