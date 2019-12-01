package javaleads.lesson2;

public class Boat extends Vehicle {
	private int EngineCount;
	
	@Override
	void printVehicalDetails(){
		super.printVehicalDetails();
		System.out.println("This is overiding class of vehicle");
		
	}
	

	@Override
	void runVehiclel() {
		// TODO Auto-generated method stub
		System.out.println("Boat is sailing");
		
	}
	

}
