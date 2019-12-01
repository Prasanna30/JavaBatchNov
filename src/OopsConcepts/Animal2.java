package OopsConcepts;

abstract class Animal2 {
	String AnimalName = " "; 
    
    Animal2(String name) 
    { 
        this.AnimalName = name; 
    } 
       
    // declare non-abstract methods 
    // it has default implementation 
    public void BasicInfo(String details) 
    { 
        System.out.println(this.AnimalName + " " + details); 
    } 
       
    // abstract methods which will be 
    // implemented by its subclass(es) 
    abstract public void habitat() ;
    abstract public void respiration(); 
} 


