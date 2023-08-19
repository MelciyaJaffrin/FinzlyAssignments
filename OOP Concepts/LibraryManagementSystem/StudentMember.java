package LibraryManagementSystem;

public class StudentMember extends LibraryMember{
	private String title;
	public StudentMember(int memberID, String name, String title) {
        super(memberID, name);
        this.title= title;
           
    }
	
    public void borrowItem(LibraryItem item) {
		
    	System.out.println(getName() + " (Student) borrowed: " + title);
		
	}
	
	public void reserveItem(LibraryItem item) {
		
	}
	


}
