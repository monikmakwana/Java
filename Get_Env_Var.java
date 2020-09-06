/*
Write a java program to get environment variables USERNAME,TEMPNAME and PATH.

****************
Program : 
****************
*/

import java.util.*;
class Get_Env_Var
{
	public static void main(String args[])
	{
		System.out.println("USERNAME = " + System.getenv("USERNAME"));
		
		System.out.println("TEMPNAME = " + System.getenv("TEMP"));
		
		System.out.println("PATH = " + System.getenv("PATH"));
	}
}

/*
****************
Output : 
****************

Z:\java\assignment 2>javac Get_Env_Var.java

Z:\java\assignment 2>java Get_Env_Var
USERNAME = mca207
TEMPNAME = C:\Users\mca207\AppData\Local\Temp
PATH = D:\apache-tomcat-6.0.26\bin;D:\apache-tomcat-6.0.26\bin;D:\apache-tomcat-
6.0.26\bin;C:\Windows\System32;C:\Program Files\Java\jdk1.6.0_07\bin;C:\Program
Files\Java\jre1.6.0_07\bin;C:\Program Files\Java\jre1.6.0_07\lib;E:\Oracle\Ora81
\bin;C:\Program Files\Oracle\jre\1.1.7\bin;C:\Windows\system32;C:\Windows;C:\Win
dows;C:\Program Files\Microsoft SQL Server\90\Tools\binn\;C:\Python30\;C:\Progra
m Files\Java\jdk1.6.0_07\bin;C:\Program Files\Java\jre1.6.0_07\bin;C:\Program Fi
les\Java\jre1.6.0_07\lib;E:\Oracle\Ora81\bin;C:\Program Files\Oracle\jre\1.1.7\b
in;C:\Windows\system32;C:\Windows;C:\Windows;C:\Program Files\Microsoft SQL Serv
er\90\Tools\binn\;C:\Python30\;C:\Program Files\Java\jdk1.6.0_07\bin;C:\Program
Files\Java\jre1.6.0_07\bin;C:\Program Files\Java\jre1.6.0_07\lib;E:\Oracle\Ora81
\bin;C:\Program Files\Oracle\jre\1.1.7\bin;C:\Windows\system32;C:\Windows;C:\Win
dows;C:\Program Files\Microsoft SQL Server\90\Tools\binn\;C:\Python30\

Z:\java\assignment 2>
*/