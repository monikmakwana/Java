/*
Q : Write a Program that inputs a line of text, tokenizes the line with StringTokenizer and outputs the tokens in reverse order.

****************
Program : 
****************
*/

import java.util.*;
import java.lang.*;
public class StringTokenizer_Eg
{
	public static void main(String args[])
	{
		String s;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String : ");
		s = scan.nextLine();
		
		StringTokenizer str = new StringTokenizer(s," ");
		String rs = "";
		
		while(str.hasMoreTokens())
		{
			rs = str.nextToken() + " " + rs;
		}
		
		System.out.println("New String : " + rs);
	}
}

/*
****************
Output : 
****************

E:\Java>javac StringTokenizer_Eg.java

E:\Java>java StringTokenizer_Eg
Enter String : Monik Makwana
New String : Makwana Monik

E:\Java>java StringTokenizer_Eg
Enter String : Rollwala Computer Center
New String : Center Computer Rollwala
*/