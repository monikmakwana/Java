/*

Q : Write a class called Statistics, which has a static method called average, which takes a one-dimensional array for double type,
     as parameter, and prints the average for the values in the array. 
	
	a. Now write a class with the main method, which creates a two-dimensional array for the four weeks of a month, containing
	   minimum temperatures for the days of the week(an array of 4 by 7), and uses the average method of the Statistics class
	   to compute and print the average temperatures for the four weeks.

****************
Program : 
****************
*/

import java.util.Scanner;
class Statistics
{
	public static double average(double arr[])
	{
		int len = arr.length;
		double sum = 0;
		
		for(double d : arr)
		{
			sum += d;
		}
		if(len == 4)
		{
			System.out.println();
			for(int i=0;i<len;i++)
				System.out.println("Average of Week "+ (i+1) + " is : " + arr[i]);
			
			System.out.println("\nAverage of Month is : " + (sum/len));
			return 0.0;
		}
		else
		{
			return (sum/len);
		}
	}
}

public class Temprature
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		
		double temp[][] = new double[4][7];
		double ans[] = new double[4];
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<7;j++)
			{
				System.out.print("\nEnter Temperature of " + (i+1) + " week's " + (j+1) +" day : ");
				temp[i][j] = s1.nextDouble();
			}
		}
		
		for(int i=0;i<4;i++)
		{
			ans[i] = Statistics.average(temp[i]);
		}
		
		ans[0] = Statistics.average(ans);
	}
}

/*
****************
Output : 
****************

E:\Java>javac Temprature.java

E:\Java>java Temprature

Enter Temperature of 1 week's 1 day : 32

Enter Temperature of 1 week's 2 day : 30

Enter Temperature of 1 week's 3 day : 29

Enter Temperature of 1 week's 4 day : 31

Enter Temperature of 1 week's 5 day : 30

Enter Temperature of 1 week's 6 day : 34

Enter Temperature of 1 week's 7 day : 32

Enter Temperature of 2 week's 1 day : 29

Enter Temperature of 2 week's 2 day : 28

Enter Temperature of 2 week's 3 day : 29

Enter Temperature of 2 week's 4 day : 29

Enter Temperature of 2 week's 5 day : 28

Enter Temperature of 2 week's 6 day : 27

Enter Temperature of 2 week's 7 day : 29

Enter Temperature of 3 week's 1 day : 28

Enter Temperature of 3 week's 2 day : 27

Enter Temperature of 3 week's 3 day : 26

Enter Temperature of 3 week's 4 day : 25

Enter Temperature of 3 week's 5 day : 25

Enter Temperature of 3 week's 6 day : 23

Enter Temperature of 3 week's 7 day : 26

Enter Temperature of 4 week's 1 day : 27

Enter Temperature of 4 week's 2 day : 29

Enter Temperature of 4 week's 3 day : 25

Enter Temperature of 4 week's 4 day : 24

Enter Temperature of 4 week's 5 day : 28

Enter Temperature of 4 week's 6 day : 27

Enter Temperature of 4 week's 7 day : 29

Average of Week 1 is : 31.142857142857142
Average of Week 2 is : 28.428571428571427
Average of Week 3 is : 25.714285714285715
Average of Week 4 is : 27.0

Average of Month is : 28.07142857142857
*/