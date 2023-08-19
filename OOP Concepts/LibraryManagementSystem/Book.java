package LibraryManagementSystem;

public class Book extends LibraryItem{
	private String author;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	void displayInfo(int itemID,String title, String author) {
		System.out.println("Book item ID: "+itemID+", Book Title is: "+title+", Book Author is: "+author);
	}

}
