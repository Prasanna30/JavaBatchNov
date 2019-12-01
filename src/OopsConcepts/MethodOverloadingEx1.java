package OopsConcepts;

public class MethodOverloadingEx1 {
	
	public int div(int a , int b){
        return (a / b); }

public int div(int a , int b , int c){
        return ((a + b ) / c); }

public static void main(String args[]){
	MethodOverloadingEx1 ob = new MethodOverloadingEx1();
System.out.println(ob.div(10 , 2));
System.out.println(ob.div(10, 2 , 3));
System.out.println("hello");
}
}
