package CollectionsPrograms;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListEx {
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
		   
		       //Adding "Steve" at the fourth position
		       alist.add(3, "Sree");
		   
		       //displaying elements
		       System.out.println(alist);
		    }  
		 
	 }
