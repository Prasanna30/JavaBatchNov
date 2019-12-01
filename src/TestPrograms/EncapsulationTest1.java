package TestPrograms;

public class EncapsulationTest1 {
	private int EmpId;
	private String name;
	private int Age;
	private String EmpDept;
	private double EmpSalary;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int EmpId) {
		this.EmpId=EmpId;
	}
	public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		
		public int getAge() {
			return Age;
		}
		public void setAge(int Age) {
			this.Age = Age;
		}
   
		public String getEmpDept() {
			return EmpDept;
		}
		public void setEmpDept(String EmpDept) {
			this.EmpDept = EmpDept;
		}
		public double getEmpSalary() {
			return EmpSalary;
		}
		public void setEmpSalary(double EmpSalary) {
			this.EmpSalary = EmpSalary;
		}
}
