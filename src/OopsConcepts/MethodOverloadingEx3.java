package OopsConcepts;

//Program to overload three methods with the same name.

public class MethodOverloadingEx3 {
	public int add(int a , int b){
	       return (a + b);
	}
	public int add(int a , int b , int c){
	       return (a + b + c) ;
	}
	public double add(double a , double b){
	       return (a + b);
	}
	public static void main( String args[]){
		MethodOverloadingEx3 ob = new MethodOverloadingEx3();
	System.out.println(ob.add(15,25));
	System.out.println(ob.add(15,25,35));
	System.out.println(ob.add(11.5 , 22.5));
	}
}
