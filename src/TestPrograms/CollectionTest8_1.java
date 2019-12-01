package TestPrograms;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionTest8_1 {

	public static void main(String[] args) {
	
		 LinkedList<Integer> linkedlist = new LinkedList<Integer>(); 
		 
	        //Adding elements to LinkedList object 
	        linkedlist.add(23);        
	        linkedlist.add(42);
	        linkedlist.add(56);
	        linkedlist.add(75);
	        linkedlist.add(78);         
	        linkedlist.add(80);
	        linkedlist.add(96);
	         
	        //Displaying linkedlist before reverse         
	        System.out.println("Before Reverse LinkedList:");         
	        System.out.println(linkedlist);
	         
	        /*Reversing the list using 
	          Collections.reverse() method*/        
	        Collections.reverse(linkedlist);
	         
	        //Displaying linkedlist after reverse         
	        System.out.println("After Reverse LinkedList:");         
	        System.out.println(linkedlist);

	}

}
