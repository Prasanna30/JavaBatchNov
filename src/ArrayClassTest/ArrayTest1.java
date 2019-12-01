//ArrayList indexOf() Method example if duplicate elements are present

package ArrayClassTest;

import java.util.ArrayList;

public class ArrayTest1 {
	public static void main(String args[]){ 
		ArrayList<Integer> al = new ArrayList<Integer>();
	      al.add(90);
	      al.add(15);
	      al.add(20);
	      al.add(90);

	      System.out.println("Index of 90: "+al.indexOf(90));
	      System.out.println("Index of 20: "+al.indexOf(20));
	      System.out.println("Index of 15: "+al.indexOf(15));
	   }
}
