/*

Write a program to generate first 50 prime numbers .(Use all types of loops)

*********************************
Program : (Using For Loop)
*********************************
*/

class Prime_For
{
	public static void main(String args[])
	{	
		int n=50;
		int i=2,cnt,j;
		int m=1;
		System.out.println("\n\nFirst "+n+" Prime Numbers :\n ");
		
		for(cnt=1;cnt<=n;i++)
		{
			for(j=2;j<i;j++)
			{	
				if(i%j==0)
				break;
			}
			
			if(j==i)
			{
				System.out.println(m + "..." + i);
				cnt++;
				m++;
			}
		}
			
	}
}

/*
****************
Output : 
****************

D:\java>javac Prime_For
error: Class names, 'Prime_For', are only accepted if annotation processing is explicitly requested
1 error

D:\java>javac Prime_For.java

D:\java>java Prime_For


First 50 Prime Numbers :

1...2
2...3
3...5
4...7
5...11
6...13
7...17
8...19
9...23
10...29
11...31
12...37
13...41
14...43
15...47
16...53
17...59
18...61
19...67
20...71
21...73
22...79
23...83
24...89
25...97
26...101
27...103
28...107
29...109
30...113
31...127
32...131
33...137
34...139
35...149
36...151
37...157
38...163
39...167
40...173
41...179
42...181
43...191
44...193
45...197
46...199
47...211
48...223
49...227
50...229

D:\java>
*/