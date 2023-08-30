package SchoolManagementSystem;

import java.util.*;

public class SchoolManagementSystemMain {
	static Scanner sc = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();
    static List<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) {
        
        while (true){
            
            System.out.println("School Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display Student Details");
            System.out.println("4. Display Teacher Details");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    addStudent();
                    break;
                case 2 :
                    addTeacher();
                    break;
                case 3 :
                    displayStudentDetails();
                    break;
                case 4 :
                    displayTeacherDetails();
                    break;
                case 5 :
                	System.out.println("System closed");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice !!!");
            }
        }
    }

    private static void displayTeacherDetails() {
        for (Teacher teacher:teachers){
            System.out.println(teacher.toString());
        }

    }

    private static void displayStudentDetails() {
        for (Student student:students){
            System.out.println(student.toString());
        }
    }

    private static void addTeacher() {
        System.out.println("Enter Teacher ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Teacher Name");
        String name = sc.nextLine();
        System.out.println("Enter Teacher Salary");
        double salary = sc.nextDouble();
        teachers.add(new Teacher(id,name,salary));
    }

    private static void addStudent() {
        System.out.println("Enter Student ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name");
        String name = sc.nextLine();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        students.add(new Student(id,name,age));
    }

}
