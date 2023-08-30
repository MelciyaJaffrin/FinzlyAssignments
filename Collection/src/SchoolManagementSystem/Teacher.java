package SchoolManagementSystem;

public class Teacher {

	 private int teacherId;
	    private String teacherName;
	    private double salary;

	    public Teacher() {
	    }

	    public Teacher(int teacherId, String teacherName, double salary) {
	        this.teacherId = teacherId;
	        this.teacherName = teacherName;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Teacher{" +
	                "teacherId=" + teacherId +
	                ", studentName='" + teacherName + '\'' +
	                ", age=" + salary +
	                '}';
	    }

	    public int getTeacherId() {
	        return teacherId;
	    }

	    public String getTeacherName() {
	        return teacherName;
	    }

	    public double getSalary() {
	        return salary;
	    }
}
