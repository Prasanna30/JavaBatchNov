package String;

import java.util.*; 
public class StringReverse2{
 // Function to reverse a string in Java using StringBuffer
public static String rev(String s){ 
return new StringBuffer(s).reverse().toString(); 
} 
public static void main(String[] args){ 
String s= "Welcome to Quantum"; 
// Note that string is immutable in Java
 s= rev(s); 
System.out.println("Result after reversing a string is : "+s); 
} 
}