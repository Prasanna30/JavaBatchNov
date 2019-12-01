package OopsConcepts;

public class ObjectDemo{
	    public ObjectDemo() {
	        // Default Constructor
	        //System.out.println(“This is a default Constructor” );
	    }
	    public ObjectDemo(String name) {
	        // This constructor has one parameter
	        //System.out.println(“Hello: ” + name );
	        //System.out.println(“Welcome to Quantum Technology”);
	   }
	 
	   public static void main(String []args) {
	    //Creating an object using default constructor
	    ObjectDemo myObj = new ObjectDemo();
	   // ObjectDemo q1= new ObjectDemo();
	 
	    //Creating an object using parameterized constructor
	    ObjectDemo myObj1 = new ObjectDemo(" Prass");
	   // ObjectDemo q1 = new ObjectDemo (25);
	    System.out.println("hello");
	   }
	 }


