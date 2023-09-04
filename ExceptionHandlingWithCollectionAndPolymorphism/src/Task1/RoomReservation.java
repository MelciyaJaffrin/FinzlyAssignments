package Task1;

public class RoomReservation extends Reservation{
	private Room room;

    public RoomReservation(int reservationId, Guest guest, Room room) {
        super(reservationId, guest);
        this.room = room;
    }

	@Override
	public double calculateTotalCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
