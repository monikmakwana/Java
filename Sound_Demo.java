/*
Write a program that accepts one command line argument,convert it to integer and decrement its value in a loop.Sound the bell when value reaches 0.(Bell character:\v0007).

****************
Program : 
****************
*/

class Sound_Demo
{
	public static void main(String args[])
	{
		int value;
		value=Integer.valueOf(args[0]);
		while(value>=0)
		{
			System.out.println(value);
			value--;
			if(value==0)
			{
				System.out.print("\u0007");
			}
		}
	}
}

/*
****************
Output : 
****************

D:\java>javac Sound_Demo.java

D:\java>java Sound_Demo 10
10
9
8
7
6
5
4
3
2
1
0

D:\java>
*/