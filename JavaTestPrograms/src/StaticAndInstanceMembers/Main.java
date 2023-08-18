package StaticAndInstanceMembers;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		Student.totalStudents=sc.nextInt();
		System.out.println(Student.totalStudents);
		Student s = new Student();
		s.enrollStudent(123,"aaa");
		Student s1=new Student();
		s1.enrollStudent(234,"bbb");
		s.dropStudent(123,"aaa");
	}

}
