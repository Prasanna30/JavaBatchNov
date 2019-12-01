package OopsConcepts;

class Dog1{
    public  void bark(){
        System.out.println("woof ");
    }
}
class Hound extends Dog1{
    public void sniff(){
        System.out.println("sniff ");
    }
 
    public void bark(){
        System.out.println("bowl");
    }
}
 
public class MethodOverriddingEx {
	public static void main(String [] args){
        Dog1 dog = new Hound();
        dog.bark();
        Hound hound = new Hound();
        hound.sniff();
}
}
