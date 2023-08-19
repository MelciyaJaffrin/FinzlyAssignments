package LibraryManagementSystem;

public class DVD extends LibraryItem{
	private String duration;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public void displayInfo(int itemID,String title, String duration) {
		System.out.println("DVD item ID: "+itemID+", DVD title is: "+title+", DVD duration is: "+duration);
	}


}
