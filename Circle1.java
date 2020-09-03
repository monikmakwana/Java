/*
Write an application that defines a Circle class with two constructors .The first form accepts a
double value that represents the radius of the circle .This constructor assumes that the circle is
centered at origin .The second form accepts three double values .The first two arguments defines
the coordinates of the center and the third argument defines the radius .Create 10 objects of the
Circle type and save them in the array. Randomly select a radius between 1 and 10 cm for each circle
created .After all circles have been created display each circle and total area of all circles.

****************
Program : 
****************
*/

import java.util.*;
import java.lang.*;

class circle
{
	double x,y,r;
	
	circle(double r)
	{
		x = 0.0;
		y = 0.0;
		this.r = r;
	}
	
	circle(double x,double y,double r)
	{
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	double equ()
	{
		System.out.println("\n ( X - " + x + " )^2 + ( Y -  " + y + " )^2  =  " + (r*r));
		return (Math.PI*r*r);
	}
	
}

class Circle1
{
	public static void main(String args[])
	{
		circle c[] = new circle[100];
		Scanner sc = new Scanner(System.in);
		double area=0.0;
		
		System.out.print("Enter total number circle=");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			double r = Math.round((Math.random()*10.0));
			if(i%2==0)
			{
				c[i] = new circle(r);
			}
			else
			{
				c[i] = new circle(Math.round(Math.random()*10),Math.round(Math.random()*10),r);
			}
			
			area = area + c[i].equ();
		}
		
		area = Math.round(area);		
		System.out.println("\nTotal area of all circles=" + area );
	}
}

/*
****************
Output : 
****************

Z:\java\assignment 2>javac Circle1.java

Z:\java\assignment 2>java Circle1
Enter total number circle=15

 ( X - 0.0 )^2 + ( Y -  0.0 )^2  =  81.0

 ( X - 7.0 )^2 + ( Y -  7.0 )^2  =  9.0

 ( X - 0.0 )^2 + ( Y -  0.0 )^2  =  4.0

 ( X - 7.0 )^2 + ( Y -  2.0 )^2  =  64.0

 ( X - 0.0 )^2 + ( Y -  0.0 )^2  =  25.0

 ( X - 3.0 )^2 + ( Y -  1.0 )^2  =  16.0

 ( X - 0.0 )^2 + ( Y -  0.0 )^2  =  1.0

 ( X - 7.0 )^2 + ( Y -  2.0 )^2  =  81.0

 ( X - 0.0 )^2 + ( Y -  0.0 )^2  =  25.0

 ( X - 0.0 )^2 + ( Y -  4.0 )^2  =  16.0

 ( X - 0.0 )^2 + ( Y -  0.0 )^2  =  64.0

 ( X - 8.0 )^2 + ( Y -  1.0 )^2  =  9.0

 ( X - 0.0 )^2 + ( Y -  0.0 )^2  =  25.0

 ( X - 9.0 )^2 + ( Y -  2.0 )^2  =  4.0

 ( X - 0.0 )^2 + ( Y -  0.0 )^2  =  100.0

Total area of all circles=1646.0

Z:\java\assignment 2>
*/