package TestPrograms;

public class EncapsulTestResult {
	public static void main(String[] args) {
	EncapsulationTest1 myobj = new EncapsulationTest1();
	myobj.setEmpId(3);
	System.out.println(myobj.getEmpId());
	myobj.setName("prass");
	System.out.println(myobj.getName());
	myobj.setAge(23);
	System.out.println(myobj.getAge());
	myobj.setEmpDept("IT");
	System.out.println(myobj.getEmpDept());
	myobj.setEmpSalary(5500);
	System.out.println(myobj.getEmpSalary());
	
	}
}
