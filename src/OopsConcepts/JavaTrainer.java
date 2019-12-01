package OopsConcepts;

class Trainer{
String designation = "Teacher";
String collegeName = "Quantum";
void does(){
System.out.println("Teaching");
}
 void display(){
	System.out.println("This is java/Sql class");
}
}
public class JavaTrainer extends Trainer{
String mainSubject = "Spark";
public static void main(String args[]){
JavaTrainer obj = new JavaTrainer();
System.out.println(obj.collegeName);
System.out.println(obj.designation);
System.out.println(obj.mainSubject);
obj.does();
obj.display();
}
}


