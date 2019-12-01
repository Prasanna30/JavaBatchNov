
public class JavaCmdEx4 {

    public static void main(String[] args)          
    {
 	 int sum;
 	 int i;
  
 	 sum = 10;          // Initialize the running sum
  
 	 for ( i = 0; i < args.length; i++ )
 	 {
 	    sum = sum + Integer.parseInt(args[i]);   // Add args[i] to running sum  

 	 }
  
 	 System.out.println( sum );
    }

}
