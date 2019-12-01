package String;

public class exampleimmutable {
private final String coursename;
exampleimmutable(final String coursename) {
this.coursename = coursename;
}
public final String getName() {
return coursename;
}
public static void main(String[] args) {
	exampleimmutable obj = new exampleimmutable("Machine Learning");
System.out.println(obj.getName());
 
}
}