package OopsConcepts;


	class Terrestrial extends Animal2 {
	
	    
	       
	    // constructor 
	    Terrestrial(String name) 
	    { 
	        super(name);
	    } 
	       
	    @Override
	    public void habitat()  
	    { 
	        System.out.println("leave on land and");  
	    } 
	       
	    @Override
	    public void respiration()  
	    { 
	        System.out.println("respire through lungs or trachea. ");  
	    }
}
