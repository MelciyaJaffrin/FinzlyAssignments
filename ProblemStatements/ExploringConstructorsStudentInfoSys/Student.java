package ExploringConstructorsStudentInfoSys;

public class Student {
	
	private String name;
	private int age;
	private int studentId;
	
	public Student(){
		this.name="Unknown";
		this.age=0;
		this.studentId=1;
		
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, int studentId) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	public void displayInfo() {
		System.out.println("Student name is: "+name+"\nStudent age is: "+age+"\nStudent id is: "+studentId);
		System.out.println();
	}


}
