package OopsConcepts;

import java.util.Scanner;

public class ScanExample {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);// Create a Scanner object
	System.out.println("Enter username");
	 
	String name = s.nextLine();// Read user input
	System.out.println("name is: " + name);;// Output user input
	}
}
