/*
****************
Program : 
****************
*/

import java.util.*;
class Frequency{
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();

        // Initialize Frequency table from command line
        for (String a : args) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}

/*
****************
Output : 
****************


D:\mca214\java>javac Frequency.java

D:\mca214\java>java Frequency
0 distinct words:
{}

D:\mca214\java>java Frequency monik makwana
2 distinct words:
{monik=1, makwana=1}

D:\mca214\java>java Frequency monik makwana monik
2 distinct words:
{monik=2, makwana=1}

D:\mca214\java>
*/