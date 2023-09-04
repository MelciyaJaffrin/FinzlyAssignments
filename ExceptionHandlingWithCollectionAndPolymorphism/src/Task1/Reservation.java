package Task1;

public abstract class Reservation {
	
	private int reservationId;
    private Guest guest;
    private static int nextReservationId = 1;
    // Add other reservation information as needed

    public Reservation(int reservationId, Guest guest) {
        this.reservationId = nextReservationId++;
        this.guest = guest;
    }

    // Getters and setters for reservation attributes

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId + ", Guest: " + guest;
    }

    public abstract double calculateTotalCost();

	public Guest getGuest() {
		// TODO Auto-generated method stub
		return guest;
	}
	

}


