/*
****************
Program : 
****************
*/

import java.util.TreeSet;
import java.util.Iterator;

class Tree_Demo{
 public static void main(String args[]){
  TreeSet<String> set=new TreeSet<String>(); // Data is unordered, but alphbetically sorted 
  
  //Here data is not added as in indexin approach
  // we get hashcodes for elements which are beint added
		set.add("Joseph");                 // adding elements
		set.add("Manan");
		set.add("Monik");
		set.add("Raj");                 
		set.add("Monik");
		
		System.out.println("Set is :" +set);
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			System.out.println(str);
			//hashing technique will not allow us indexing so we use iterator
		}
		set.remove("Monik");
		System.out.println("\nSet after remove is : " +set);
		
		if(set.contains("")){
			System.out.println("is in the list");
		}
	//you can also fetch set size by set.size();
 }
}

/*
****************
Output : 
****************

D:\mca214\java>javac Tree_Demo.java

D:\mca214\java>java Tree_Demo
Set is :[Joseph, Manan, Monik, Raj]
Joseph
Manan
Monik
Raj

Set after remove is : [Joseph, Manan, Raj]

D:\mca214\java>
*/