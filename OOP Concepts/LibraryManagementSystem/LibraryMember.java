package LibraryManagementSystem;

public abstract class LibraryMember implements Reservable {
	private int memberID;
	private String name;
	
	public int getMemberID() {
		return memberID;
	}

	public String getName() {
		return name;
	}	
	
	public LibraryMember(int memberID, String name) {
		super();
		this.memberID = memberID;
		this.name = name;
	}

	public abstract void borrowItem(LibraryItem item);

}
