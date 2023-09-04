package Task1;

public class SuiteRoom extends Room {
    public SuiteRoom(int roomId, double pricePerNight) {
        super(roomId, pricePerNight);
    }

    @Override
    public String getRoomType() {
        return "Suite";
    }
}
