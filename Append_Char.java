/*
Q : Create a StringBuffer and illustrate how to append character. Display capacity, length of the StringBuffer.


****************
Program : 
****************
*/

import java.util.*;
import java.lang.*;
public class Append_Char
{
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		s=sc.nextLine();
		
		StringBuffer str=new StringBuffer(s);
		char c;
		
		System.out.print("Enter Character to append : ");
		c=sc.next().charAt(0);
		str.append(c);
		
		System.out.println("\nAfter Appending : "+str);
		System.out.println("Length : "+str.length());
		System.out.println("Capacity : "+str.capacity());
	}
}

/*
****************
Output : 
****************

E:\Java>javac Append_Char.java

E:\Java>java Append_Char
Enter the String : Monik Makwana
Enter Character to append : @

After Appending : Monik Makwana@
Length : 14
Capacity : 29

E:\Java>
*/