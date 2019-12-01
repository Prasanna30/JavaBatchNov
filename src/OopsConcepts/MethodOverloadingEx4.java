package OopsConcepts;

public class MethodOverloadingEx4 {
	public static void main(String[] args){
		System.out.println("hello");
		MethodOverloadingEx4.main("Quantum");
		}
		 
		public static void main(String arg1){
		System.out.println(" welcome" + arg1);
		MethodOverloadingEx4.main("welcome " , " Quantum");
		}
		
		
		
		 
		public static void main(String arg1,String arg2 ){
		System.out.println("hello");
		}
	}
