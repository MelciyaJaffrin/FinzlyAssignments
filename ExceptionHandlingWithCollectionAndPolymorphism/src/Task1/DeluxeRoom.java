package Task1;

public class DeluxeRoom extends Room {
    public DeluxeRoom(int roomId, double pricePerNight) {
        super(roomId, pricePerNight);
    }

    @Override
    public String getRoomType() {
        return "Deluxe";
    }
}
