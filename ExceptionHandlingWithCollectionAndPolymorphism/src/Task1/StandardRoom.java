package Task1;

public class StandardRoom extends Room {
    public StandardRoom(int roomId, double pricePerNight) {
        super(roomId, pricePerNight);
    }

    @Override
    public String getRoomType() {
        return "Standard";
    }
}
