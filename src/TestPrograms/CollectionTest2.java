package TestPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		 
	    // Adding Key and Value pairs to HashMap
	    hashmap.put(22,"A");
	    hashmap.put(55,"B");
	    hashmap.put(33,"Z");
	    hashmap.put(44,"M");
	    hashmap.put(99,"I");
	    hashmap.put(88,"X");
	 
	    System.out.println("Before Sorting:");
	    Set set = hashmap.entrySet();
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext()) {
	        Map.Entry pair = (Map.Entry)iterator.next();
	        System.out.print(pair.getKey() + ": ");
	        System.out.println(pair.getValue());
	    }
	    Map<Integer, String> map = new TreeMap<Integer, String>(hashmap);     System.out.println("After Sorting:");
	    Set set2 = map.entrySet();
	    Iterator iterator2 = set2.iterator();
	    while(iterator2.hasNext()) {
	        Map.Entry pair = (Map.Entry)iterator2.next();
	        System.out.print(pair.getKey() + ": ");
	        System.out.println(pair.getValue());
	    } 
	  }
}


