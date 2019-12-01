package OopsConcepts;

public class Car {                   // Class creation
	       String color;                        // Member variables   
	       String model;
	       public void SpeedCheck(int s)        // Method 
	         {
	         int speed=s;
	           if(speed>100)                        // Control statement
	           {
	           System.out.println(" You are driving very fast");
	           }
	           else
	           {
	            System.out.println("You are driving at normal speed");
	           }
	           }
	       
	public static void main ( String args[]) 
	         {
	         Car obj= new Car();                  // Object creation
	         obj.SpeedCheck(60);
	         }

}
