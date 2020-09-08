/*

Create an abstract class “Monster” which is extended by three classes “Ware wolf “,”Zombie” and
“Vampire” .Create 6 types of Monsters in single dimension array and print them.

****************
Program : 
****************
*/

import java.util.*;
abstract class monster
{
	abstract void display();
}
class warewolf extends monster
{
	void display()
	{
		System.out.println("WAREWOLF-MONSTER");
	}
}
class zombie extends monster
{
	void display()
	{
		System.out.println("ZOMBIE-MONSTER");
	}
}
class vampire extends monster
{
	void display()
	{
		System.out.println("VAMPIRE-MONSTER");
	}
}
class SingleDimension
{
	public static void main(String args[])
	{
		monster m[] = new monster[20];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total number of monsters=");
		int n = sc.nextInt();
		int i=0;

		while(i<n)
		{
			m[i] = new warewolf();
			m[i].display();
			i++;	
			m[i] = new zombie();
			m[i].display();
			i++;
			m[i] = new vampire();
			m[i].display();
			i++;
		}		
	}
}

/*
****************
Output : 
****************

Z:\java\assignment 2>javac SingleDimension.java

Z:\java\assignment 2>java SingleDimension
Enter total number of monsters=10
WAREWOLF-MONSTER
ZOMBIE-MONSTER
VAMPIRE-MONSTER
WAREWOLF-MONSTER
ZOMBIE-MONSTER
VAMPIRE-MONSTER
WAREWOLF-MONSTER
ZOMBIE-MONSTER
VAMPIRE-MONSTER
WAREWOLF-MONSTER
ZOMBIE-MONSTER
VAMPIRE-MONSTER

Z:\java\assignment 2>
*/