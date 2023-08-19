package LibraryManagementSystem;

public class LibraryItem {
	private String title;
	private int itemID;
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public void displayInfo(int itemID, String title) {
		System.out.println("Item ID: "+itemID+" \nBook or DVD: "+title);
	}

}
