package TestPrograms;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Mango");
	    linkedlist.add("Banana"); 
	    linkedlist.add("Pear");
	    linkedlist.add("Apple");
	    linkedlist.add("Orange");
	    // Converting LinkedList to ArrayList
	    List<String> list = new ArrayList<String>(linkedlist);

	    for (String str : list){
	      System.out.println(str);
	    } 

	}

}
