package TestPrograms;

import java.util.HashSet;

public class CollectionTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashset = new HashSet<String>();
	    // Add elements to HashSet
	    hashset.add("Pear");
	    hashset.add("Apple");
	    hashset.add("Orange");
	    hashset.add("Papaya");
	    hashset.add("Banana");
	    //Showing HashSet elements
	    System.out.println("HashSet contains :" + hashset);
	    // Creating an Array of HashSet size
	    String[] array = new String[hashset.size()];
	    // Converting HashSet to Array using toArray() method
	    hashset.toArray(array);
	    //Showing Array elements
	    System.out.println("Array contains :");
	    for(String str : array){
	        System.out.println(str);
	    }
	}

}
