package CollectionsPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
public class ListIteratorExample {
  public static void main(String a[]){
    
    List<String> names = new ArrayList<String>();
    names.add("Shyam");
    names.add("Rajat");
    names.add("Paul");
    names.add("Tom");
    names.add("Kate");
    
    ListIterator<String> litr=names.listIterator();
 
    System.out.println("Traversing the list in forward direction:");
   
    while(litr.hasNext()){
       System.out.println(litr.next());
    }
    System.out.println("\nTraversing the list in backward direction:");
    while(litr.hasPrevious()){
       System.out.println(litr.previous());
    }
  }
}