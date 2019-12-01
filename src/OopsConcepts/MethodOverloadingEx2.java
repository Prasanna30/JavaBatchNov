package OopsConcepts;

//Program to overload static methods in java.

public class MethodOverloadingEx2 {
	public static int func(int a ){
	       return 100;
	}
	public static char func(int a , int b){
	      return 'Q';
	}
	public static void main(String args[]){
	System.out.println(func(1));
	System.out.println(func(1,3));
	}
	
}
