package DTypesProgramsOpera;

public class MemberVarEx2 {
	public String color;     // Created an instance variable color
    
	MemberVarEx2(String c)
	   {
	    color=c;
	   }
	 
	public void display() {  // Method 
	      System.out.println("color of the car is " +color);
	   }
	 
	public static void main(String args[]){
	              MemberVarEx2 obj=new MemberVarEx2("black");
	                obj.display();
	       }
}
