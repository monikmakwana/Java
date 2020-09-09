/*
****************
Program : 
****************
*/

import java.util.HashSet;
import java.util.Iterator;

class SetDemo{
 public static void main(String args[]){
  HashSet<String> set=new HashSet<String>(); // creating hashSet
  
  //Here data is not added as in indexin approach
  // we get hashcodes for elements which are beint added
		set.add("Joseph");                 // adding elements
		set.add("Manan");
		set.add("Monik");
		set.add("Raj");                 
		set.add("Monik");
		
		System.out.println("Set is : " +set);
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			System.out.println(str);
			//hashing technique will not allow us indexing so we use iterator
		}
	}
 }

/*
****************
Output : 
****************

D:\mca214\java>javac SetDemo.java

D:\mca214\java>java SetDemo
Set is : [Joseph, Raj, Manan, Monik]
Joseph
Raj
Manan
Monik

D:\mca214\java>
*/