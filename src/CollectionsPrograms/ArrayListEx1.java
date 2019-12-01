package CollectionsPrograms;

import java.util.ArrayList;

public class ArrayListEx1 {
	 public static void main(String args[]){
	      ArrayList<String> alist=new ArrayList<String>(); 
	      alist.add("Sree");
	      alist.add("Tanu");
	      alist.add("Lala");
	      alist.add("Piyu");
	      alist.add("Avika");
	      alist.add("Tommy");

	      //displaying elements
	      System.out.println(alist);

	      //Removing "Steve" and "Angela"
	      alist.remove("Sree");
	      alist.remove("Avika");

	      //displaying elements
	      System.out.println(alist);

	      //Removing 3rd element
	      alist.remove(2);

	      //displaying elements
	      System.out.println(alist);
	   }

}
