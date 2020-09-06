/*
Q:  Write and run a JAVA program that reads a string from the user and perform the following.
	-> counts number of occurance of a given character (for example, "a") in a string.
	-> searches the last occurance of a character in a string.
	-> removes the unneccessary spaces from a string : leading and trailing spaces.
	-> displays the substring formed by the last ten characters of a string


****************
Program : 
****************
*/

import java.lang.*;
import java.util.*;

class Str
{
	String s;
	Str()
	{
		s=null;
	}
	Str(String a)
	{
		s=a;
	}
	void display()
	{
		System.out.println("String : "+s);
	}
	void charo()
	{
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter character : ");
		c=sc.next().charAt(0);
		int l=s.length();
		int o=0;
		char cc[]=s.toCharArray();
		for(int i=0;i<l;i++)
		{
			if(c==cc[i])
			{
				o++;
			}
		}
		System.out.println("Number of Occurences : "+o);
	}
	void lastcharo()
	{
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter character to find last occurence : ");
		c=sc.next().charAt(0);
		int l=s.length();
		int o=0;
		char cc[]=s.toCharArray();
		for(int i=0;i<l;i++)
		{
			if(c==cc[i])
			{
				o=i;
			}
		}
		System.out.println("Last occurence of "+c+" in string "+s+" is at : "+o);
	}
	void removes()
	{
		String ss=s.trim();
		System.out.println("String "+s+" after removing all the leading and trailing spaces : "+ss);
	}
	void substr()
	{
		Scanner sc=new Scanner(System.in);
		if(s.length()>=10)
		{
			int l=s.length();
			int si=(l-10);
			String ss=s.substring(si);
			System.out.println("Substring : "+ss);
		}
		else
		{
			System.out.println("Can't display string is less than 10");
		}
	}
}
class String_Operations
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.print("Enter String : ");
		s=sc.nextLine();
		Str st=new Str(s);
		st.display();
		st.charo();
		st.lastcharo();
		st.removes();
		st.substr();
	}
}

/*
****************
Output : 
****************

E:\Java>javac String_Operations.java

E:\Java>java String_Operations
Enter String : My Name Is Monik Makwana
String : My Name Is Monik Makwana
Enter character : M
Number of Occurences : 3
Enter character to find last occurence : n
Last occurence of n in string My Name Is Monik Makwana is at : 22
String My Name Is Monik Makwana after removing all the leading and trailing spaces : My Name Is Monik Makwana
Substring : ik Makwana
*/