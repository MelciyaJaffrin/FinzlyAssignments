package EmployeeManagementSystem;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Employee> empRecord = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
				System.out.println("Employee Management System\n "
						+ "1. Add Employee\n "
						+ "2. View Details\n "
						+ "3. Search Employee\n "
						+ "4. Exit");
				System.out.println("Enter your choice:");
				int choice = sc.nextInt();
		
				switch(choice) {
				case 1:
					System.out.println("Enter Employee ID: ");
					int employeeID = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Employee Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Employee Salary: ");
					double salary = sc.nextDouble();
					
					Employee emp = new Employee(employeeID,name,salary);
					empRecord.add(emp);
					System.out.println("Employee details added successfully");
					break;
					
				case 2:
					for(Employee e: empRecord) {
						System.out.println(e);
					}
					System.out.println();
					break;
					
				case 3:
					System.out.println("Enter id to search: ");
					int id = sc.nextInt() ;
					for(Employee e: empRecord) {
						if(e.getEmployeeID() == id) {
							System.out.println("Details of employee with id "+id+" is found");
							System.out.println(e);
							System.out.println();
							
						}
						else {
							System.out.println("Details of employee with id "+id+" is not found...Try Again!");
						}
					}
					break;
					
				
				case 4:
					System.out.println("System closing...!!!");
						sc.close();
						System.exit(0);
					
					break;
				
				default:
					System.out.println("Invalid choice");
				}
		}
	}
		
}
