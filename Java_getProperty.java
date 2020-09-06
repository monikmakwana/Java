/*
Write a program to get java version, runtime version ,java vendor name , java vendor url and

****************
Program : 
****************
*/

import java.util.*;
class Java_getProperty
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA VERSION : " + System.getProperty("java.version"));
		
		System.out.println("\nRUN TIME VERSION : " + System.getProperty("java.runtime.version"));
				
		System.out.println("\nVENDOR NAME : " + System.getProperty("java.vendor"));
		
		System.out.println("\nVENDOR URL : " + System.getProperty("java.vendor.url"));
	}	
}

/*
****************
Output : 
****************

Z:\java\assignment 2>javac Java_getProperty.java

Z:\java\assignment 2>java Java_getProperty

JAVA VERSION : 1.6.0_07

RUN TIME VERSION : 1.6.0_07-b06

VENDOR NAME : Sun Microsystems Inc.

VENDOR URL : http://java.sun.com/

Z:\java\assignment 2>
*/