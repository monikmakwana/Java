/*
Write a program to accept a string from user and a point from where you want to print next three
words. Print the old and the new string.
Old String = “The quick brown fox jumps over the lazy dog”
New String = “brown fox jumps”

****************
Program : 
****************
*/

import java.util.*;
class Next_Three_Words
{
	public static void main(String args[])
	{
		int cnt = 0,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string=");
		String str = sc.nextLine();		
		String t[] = str.split(" ");
		
		System.out.print("Enter position from where 3 words u want to print=");
		n = sc.nextInt();
		
		System.out.println("Old string=" + str);
		System.out.print("New string=");
		while(cnt < 3)
		{
			System.out.print(t[n-1] + " ");
			cnt++;
			n++;
		}
	}
}

/*
****************
Output : 
****************

Z:\java\assignment 2>java Next_Three_Words
Enter String : this is department of computer center rollwala
Enter Position : 3
OLD STRING : this is department of computer center rollwala
NEW STRING : department of computer
Z:\java\assignment 2>
*/