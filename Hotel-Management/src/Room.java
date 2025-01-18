public class Room {
    private final String roonmId;
    private final RoomType roomType;
    private final int price;

    public Room(String roonmId, RoomType roomType, int price) {
        this.roonmId = roonmId;
        this.roomType = roomType;
        this.price = price;
    }

    public String getRoonmId() {
        return roonmId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getPrice() {
        return price;
    }
}
