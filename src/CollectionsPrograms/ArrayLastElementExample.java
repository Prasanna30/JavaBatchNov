package CollectionsPrograms;
import java.util.ArrayList;
import java.util.List;
public class ArrayLastElementExample {

	public static void main(String[] args) {
 
     /* Creating ArrayList of Strings and adding
      * elements to it
      */
     List<String> al = new ArrayList<String>();
     al.add("Ajay");
     al.add("Becky");
     al.add("Chaitanya");
     al.add("Dimple");
     al.add("Rock");
 
     // Displaying ArrayList elements
     System.out.println("ArrayList contains: "+al);
 
     // Logic to get the last element from ArrayList
     if (al != null && !al.isEmpty()) {
        System.out.print("Last element is:");
        System.out.print(al.get(al.size()-1));
     }
  }
}

	

	
