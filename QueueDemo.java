/*
QueueDemo : 
------------

***************
Program : 
***************
*/

import java.util.PriorityQueue; 
public class QueueDemo
{
 public static void main(String args[])
	{
	
		PriorityQueue<Integer> queue =new PriorityQueue<Integer>();  
			
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		System.out.println(queue.peek());
		queue.poll(); 
		System.out.println(queue.peek()); 
		
	 }
 }

/*
**************
Output : 
**************

C:\Users\mca207\Desktop>javac QueueDemo.java

C:\Users\mca207\Desktop>java QueueDemo
1
2
*/