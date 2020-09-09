/*
***************
Program : 
***************
*/

import java.util.ArrayList;
class Student
{
	int rollno;
	String name;
}

public class List_Demo{
 public static void main(String args[]){

	ArrayList<String> list1=new ArrayList<String>();  
	

	ArrayList list2=new ArrayList();
	
	Student s1=new Student();
	s1.rollno=12;
	s1.name="Raj";
	
	list1.add("Monik");                 
	list1.add("Raman");
	list1.add("Manan");
	list1.add("Raj");
	list2.add("Nisarg");                 
	list2.add(50);
	list2.add(88.11);
	
		System.out.println("List1 is " + list1);
		
		System.out.println("List2 is " + list2);

			System.out.println("Student name is " + s1.name);

	
 }
 }

/*
***************
Output : 
***************

D:\mca214\java>javac List_Demo.java
Note: List_Demo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\mca214\java>java List_Demo
List1 is [Monik, Raman, Manan, Raj]
List2 is [Nisarg, 50, 88.11]
Student name is Raj

D:\mca214\java>
*/