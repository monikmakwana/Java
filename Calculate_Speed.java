/*

Write a java program to accept distance in metres , time in hours ,minutes and seconds .Calculate
the speed in m/sec ,km/hr and miles/hr .(1 mile=1609 m).

****************
Program : 
****************
*/

import java.util.*;

class Calculate_Speed
{
	public static void main(String args[])
	{
		double metre,hr,min,sec,ts,th;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Metres=");
		metre = sc.nextDouble();
		
		System.out.print("Enter Hours=");
		hr = sc.nextDouble();
		
		System.out.print("Enter Minutes=");
		min = sc.nextDouble();
		
		System.out.print("Enter Seconds=");
		sec = sc.nextDouble();
		
		ts = sec + (min*60) + (hr*3600);		
		System.out.println("M/SECONDS=" + metre/ts);
		
		
		double km = metre/1000;		
		th = (ts/3600);
		System.out.println("KM/HOURS=" + km/th);
		
		double miles = metre/1609;
		System.out.println("MILES/HOURS=" + miles/th);		
	}
}

/*
****************
Output : 
****************

Z:\java\assignment 2>javac Calculate_Speed.java

Z:\java\assignment 2>java Calculate_Speed
Enter Metres=1000
Enter Hours=1
Enter Minutes=10
Enter Seconds=10
M/SECONDS=0.2375296912114014
KM/HOURS=0.8551068883610451
MILES/HOURS=0.5314523855568957

Z:\java\assignment 2>
*/