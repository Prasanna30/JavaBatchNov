package CollectionsPrograms;

import java.util.List;
import java.util.ArrayList;

import java.util.LinkedList;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		   al.add("Chaitanya");
		   al.add("Rahul");
		   al.add("Ajeet");
		   System.out.println("ArrayList Elements: ");
		   System.out.print(al);

		   List<String> ll = new LinkedList<String>();
		   ll.add("Kevin");
		   ll.add("Peter");
		   ll.add("Kate");
		   System.out.println("\nLinkedList Elements: ");
		   System.out.print(ll);

	}

}
