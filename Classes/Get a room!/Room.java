
public abstract class Room {
    int roomNumber;
    String roomType;
    double pricePerNight;
    boolean isAvailable;

    public Room() {
        
    }
    public Room(int roomNumber, String roomType, double pricePerNight, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = isAvailable;
    }

    abstract String roomAvailability();
}
