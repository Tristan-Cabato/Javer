import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Booking extends Room {  
    String bookingID;
    Guest guest;
    int numberOfNights;

    public Booking() {
        super();
    }

    public Booking(int roomNumber, String roomType, double pricePerNight, boolean isAvailable, String bookingID,
            Guest guest, int numberOfNights) {
        super(roomNumber, roomType, pricePerNight, isAvailable);
        this.bookingID = bookingID;
        this.guest = guest;
        this.numberOfNights = numberOfNights;
    }

    double calculateTotalCost() {
        return 0.0;
    }

    public String roomAvailability() {
        String roomings = "";
        try {
            Scanner scan = new Scanner(new FileReader("rooms.txt"));
            while (scan.hasNextLine()) {
                roomings += scan.nextLine() + "\n";
            }
            scan.close();
        } catch (FileNotFoundException e) {
            return "rooms.txt not found.";
        }
        return roomings;
    }
}
