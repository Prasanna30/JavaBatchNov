package String;

public class mutableexample {
private String coursename;
mutableexample(String coursename) {
this.coursename = coursename;
}
public String getName() {
return coursename;
}
public void setName(String coursename) {
this.coursename = coursename;
}
public static void main(String[] args) {
mutableexample obj = new mutableexample("Machine Learning");
System.out.println(obj.getName());
 
// update the name, this object is mutable
obj.setName("Machine Learning Masters");
System.out.println(obj.getName());
 
}
}
