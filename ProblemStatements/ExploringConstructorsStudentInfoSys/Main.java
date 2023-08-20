package ExploringConstructorsStudentInfoSys;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		s.displayInfo();
		
		Student s1 = new Student("Jaff",22);
		s1.displayInfo();
		
		Student s2 = new Student("John",25,1);
		s2.displayInfo();
		
		Student s3 = new Student("Lily", 15,2);
		s3.displayInfo();

	}

}
