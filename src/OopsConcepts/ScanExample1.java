package OopsConcepts;

import java.util.Scanner;

public class ScanExample1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 
		System.out.println("Enter name:");
		
		
		 
		// String input
		String name = s.nextLine();
		 
		System.out.println("Enter Age:");
		// Numerical input
		int age = s.nextInt();
		
		System.out.println("Enter Salary:");
		double salary = s.nextDouble();
		 
		// Output input by user
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Salary: "+ salary);
		}
}
