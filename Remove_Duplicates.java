/*
Write a program to remove duplicate characters from the string.

****************
Program : 
****************
*/

import java.util.*;
class Remove_Duplicates
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		char val[] = new char[50];
		int l;
		
		System.out.print("Enter the string=");
		str = sc.nextLine();
		str = str.toLowerCase();
			
		l = str.length();
			
		for(int i=0;i<l;i++)
		{
			val[i] = str.charAt(i);
		}
					
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(val[i]==val[j])
				{
					val[j] = '\0';
				}
			}
		}
		
		System.out.println("String after removing duplicates\n");
		for(int i=0;i<l;i++)
		{
			if(val[i]!='\0' && val[i]!=' ')
				System.out.print(val[i]);
		}
		
	}
}

/*
****************
Output : 
****************

Z:\java\assignment 2>javac Remove_Duplicates.java

Z:\java\assignment 2>java Remove_Duplicates
Enter the string=Monik Makwana
String after removing duplicates

monikaw
Z:\java\assignment 2>
*/