/*
****************
Program : 
****************
*/

import java.util.*;
class FindDups {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        for (String a : args)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.print("\nUnique words:    " + uniques);
        System.out.print("\nDuplicate words: " + dups);
    }
}

/*
****************
Output : 
****************

D:\mca214\java>javac FindDups.java

D:\mca214\java>java FindDups monik makwana monik
Unique words:    [makwana]
Duplicate words: [monik]

D:\mca214\java>
*/