package StaticAndInstanceMembers;


public class Student {
	int studentID;
	String name;
	static int totalStudents;
	
	
	public void enrollStudent(int studentID, String name) {
		System.out.println("Student "+name+" enrolled successfully!!!");
		totalStudents+=1;
		System.out.println("Total number of students: "+totalStudents);
		
	}
	public void dropStudent(int studentID,String name) {
		System.out.println("Student "+name+" dropped successfully!!!");
		totalStudents-=1;
		System.out.println("Total number of students: "+totalStudents);
	}

}
