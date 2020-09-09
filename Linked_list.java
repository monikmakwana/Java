/*
****************
Program : 
****************
*/

import java.util.*; 
public class Linked_list{ 
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
       		al.add("Joseph"); // adding elements
		al.add("Manan");
		al.add("Monik");
		al.add("Raj");                 
		al.add("Monik");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){ 
            System.out.println(itr.next());
        }
    }
}

/*
****************
Output : 
****************

D:\mca214\java>javac Linked_list.java

D:\mca214\java>java Linked_list
Joseph
Manan
Monik
Raj
Monik

D:\mca214\java>
*/