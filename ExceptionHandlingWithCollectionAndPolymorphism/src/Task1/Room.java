package Task1;

public abstract class Room {
    private int roomId;
    private double pricePerNight;
    private boolean isAvailable;

    public Room(int roomId, double pricePerNight) {
        this.roomId = roomId;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
    }

    // Getters and setters for room attributes

    public boolean reserveRoom() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void releaseRoom() {
        isAvailable = true;
    }

    public abstract String getRoomType();

    @Override
    public String toString() {
        return "Room ID: " + roomId + ", Type: " + getRoomType() + ", Price per Night: " + pricePerNight;
    }

	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return isAvailable;
	}
}
