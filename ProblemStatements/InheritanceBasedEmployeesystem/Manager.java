package InheritanceBasedEmployeesystem;

public class Manager extends Employee{
	
	private String department;

	public Manager(int id, String name, String department) {
		super(id,name);
		this.department = department;
	}
	
	public void displayInfo() {
		System.out.println("Employee id is: "+getId()+"\nEmployee name is: "+getName()+"\nDepartment he supervise:"+department);
		System.out.println();
	}
	

}
