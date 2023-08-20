package InheritanceBasedEmployeesystem;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Manager(1,"Ed","Testing");
		e1.displayInfo();
		
		Employee e2 = new Developer(2,"JB","Java");
		e2.displayInfo();

	}

}
