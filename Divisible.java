/*
Write a program that prints numbers between 17 and 100 that are evenly Divisible by 17.

****************
Program : 
****************
*/

class Divisible
{
	public static void main(String args[])
	{
		int i;
		System.out.println("\nNumbers between 17 and 100 that are evenly Divisible by 17\n");
		for(i=17;i<=100;i++)
		{
			if(i%17==0)
			{
			System.out.println(i);
			}
		}
	}
}

/*
****************
Output : 
****************

D:\java>javac Divisible.java

D:\java>java Divisible

Numbers between 17 and 100 that are evenly Divisible by 17

17
34
51
68
85

D:\java>
*/