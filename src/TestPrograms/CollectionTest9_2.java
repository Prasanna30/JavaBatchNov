package TestPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTest9_2 {

    public static void main(String args[]) {
        
        ArrayList<Student1> arraylist = new ArrayList<Student1>();
     arraylist.add(new Student1(111, "Messi", 23));
     arraylist.add(new Student1(222, "John", 29));
     arraylist.add(new Student1(333, "Ronaldo", 31));

     System.out.println("Comparing by names");
     Collections.sort(arraylist, Student1.StuNameComparator);

     for(Student1 str: arraylist){
    System.out.println(str.getRollno()+"  "+ str.getStudentname());
     }
     System.out.println("Comparing by roll numbers");

     Collections.sort(arraylist, Student1.StuRollno);

     for(Student1 str: arraylist){
    System.out.println(str.getRollno()+"  "+ str.getStudentname());
     }
   }

}
