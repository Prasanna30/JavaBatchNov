// Write a program to iterate the HashMap ?
package TestPrograms;

import java.util.HashMap;

public class CollectionTest1 {
	public static void main(String args[]) {
        // Creating a HashMap of String keys and String values
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	    hashmap.put(01, "Pratham");
	    hashmap.put(02, "Prasanna");
	    System.out.println("Iterating or looping map using foreach loop");
	    // Iterating or looping using keySet() method
	    for (Integer key : hashmap.keySet()) {
	        System.out.println("key: " + key + " value: " + hashmap.get(key));
	    }
	}
}
/*
 *  HashMap<String, String> hashmap = new HashMap<String, String>();
    hashmap.put("Key1", "Value1");
    hashmap.put("Key2", "Value2");
    System.out.println("Iterating or looping map using entrySet and foreach loop");
    // Iterating or looping using entrySet() method
    Set<Map.Entry<String, String>> entrySet = hashmap.entrySet();
    for (Map.Entry entry : entrySet) {
        System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
    }
 */
