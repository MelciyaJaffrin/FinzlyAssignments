package LibraryManagementSystem;

public class FacultyMember extends LibraryMember {
	private String title;
	public FacultyMember(int memberID, String name, String title) {
        super(memberID, name);
        this.title = title;
    }
    public void borrowItem(LibraryItem item) {
		
    	System.out.println(getName() + " (Faculty) borrowed: " +title);
		
	}
	
	public void reserveItem(LibraryItem item) {
		
		System.out.println(getName() + " (Faculty) reserved: " + title);
		
	}

}
