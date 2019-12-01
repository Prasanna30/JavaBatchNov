package OopsConcepts;

public class AbstractEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       
		        // creating the Object of Terrestrial class 
		        // and using Animal class reference. 
		        Animal2 object1 = new Terrestrial("Humans"); 
		        object1.BasicInfo("are terrestrial beings, they "); 
		        object1.habitat(); 
		        object1.respiration(); 
		          
		           
		        System.out.println(" "); 
		           
		        // creating the Objects of circle class 
		        Animal2 object2 = new Aquatic("Fishes"); 
		        object2.BasicInfo("are aqautic beings, they "); 
		        object2.habitat(); 
		        object2.respiration(); 
		         
		    } 
		
	}

