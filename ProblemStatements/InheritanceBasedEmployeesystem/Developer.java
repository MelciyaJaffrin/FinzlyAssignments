package InheritanceBasedEmployeesystem;

public class Developer extends Employee{
	
	private String programmingLanguage;
	
	public Developer(int id, String name, String programmingLanguage) {
		super(id, name);
		this.programmingLanguage = programmingLanguage;
	}



	public void displayInfo() {
		System.out.println("Employee id is: "+getId()+"\nEmployee name is: "+getName()+"\nProgramming Language he knows:"+programmingLanguage);
		System.out.println();
	}
	

}
