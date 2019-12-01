package OopsConcepts;

class Aquatic extends Animal2 
{ 
       
    // constructor 
    Aquatic(String name) 
    { 
        super(name);
    } 
       
    @Override
    public void habitat()  
    { 
        System.out.println("It leaves in water and");  
    } 
       
    @Override
    public void respiration()  
    { 
        System.out.println("respire through gills or their skin. ");  
    }
}