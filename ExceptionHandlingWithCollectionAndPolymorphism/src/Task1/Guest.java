package Task1;

public class Guest {
	private int guestId;
    private String name;
    // Add other guest information as needed

    public Guest(int guestId, String name) {
        this.guestId = guestId;
        this.name = name;
    }

    // Getters and setters for guest attributes

    @Override
    public String toString() {
        return "Guest ID: " + guestId + ", Name: " + name;
    }

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
