/*
CountDown :
------------

***************
Program : 
***************
*/

import java.util.*;
public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        int time = Integer.parseInt(args[0]);
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = time; i >= 0; i--)
            queue.add(i);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
            Thread.sleep(1000);
        }
    }
}

/*
***************
Output : 
***************

Z:\Java>javac Countdown.java

Z:\Java>java Countdown 10

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

Z:\Java>
*/