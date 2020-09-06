/*
Take a string from user. Find the occurrences of a word. And print that word in reverse order.

****************
Program : 
****************
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Reverse_Word
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int cnt=0;
		
		System.out.print("\nEnter the string : ");
		String str = sc.nextLine();
		
		System.out.print("Enter the word you want to find : ");
		String word = sc.nextLine();
		String t[] = str.split(" ");
		for(int i=0;i<t.length;i++)
		{
			if(word.equalsIgnoreCase(t[i]))
			{
				cnt++;
			}
		}
		if(cnt>0)
		{
			System.out.println(word + " Found " + cnt + " times" );
			
			String rev = "";
			int l = word.length();
			
			for(int i=l-1;i>=0;i--)
			{
				rev = rev + word.charAt(i);
			}
			
			System.out.println("Word in reverse order : " + rev);
			
		}
		else
		{
			System.out.println(word + " word not found");
		}
	}
}

/*
****************
Output : 
****************

Z:\java\assignment 2>javac Reverse_Word.java

Z:\java\assignment 2>java Reverse_Word

Enter the string : monik makwana
Enter the word you want to find : monik
monik Found 1 times
Word in reverse order : kinom

Z:\java\assignment 2>
*/