package OopsConcepts;

class Message implements Cloneable
{
   String FirstString;
 
   Message() {
       this.FirstString = "Hello World";
   }
  public Object clone() throws
           CloneNotSupportedException
   {
       return super.clone();
   }
 
}
public class ObjectDemo2 {

		   public static final char[] FirstString = null;

		public static void main(String[] args) throws
		           CloneNotSupportedException
		   {
		       Message FirstObj = new Message();
		       System.out.println(FirstObj.FirstString);
		 
		       Message SecondObj = (Message)FirstObj.clone();
		       System.out.println(SecondObj.FirstString);
		 
		 
		       SecondObj.FirstString = "Welcome to the world of programming";
		       
		       System.out.println(SecondObj.FirstString);
		 
		       System.out.println(FirstObj.FirstString);
		      
		 
		   }
}
