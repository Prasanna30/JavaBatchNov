//ArrayList indexOf() Method example
package ArrayClassTest;

import java.util.ArrayList;

public class ArrayIndexOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
	      al.add("AB");
	      al.add("CD");
	      al.add("EF");
	      al.add("GH");
	      al.add("IJ");
	      al.add("KL");
	      al.add("MN");

	      System.out.println("Index of 'AB': "+al.indexOf("AB"));
	      System.out.println("Index of 'KL': "+al.indexOf("KL"));
	      System.out.println("Index of 'AA': "+al.indexOf("AA"));
	      System.out.println("Index of 'EF': "+al.indexOf("EF"));

	}

}
