import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Booking book = new Booking();
        Guest guest = new Guest();
        JOptionPane.showMessageDialog(null, "Welcome to Hotel something");
        String roomNumber = JOptionPane.showInputDialog("""
                Enter your preferred room:
                %s
                """.formatted(book.roomAvailability()));

        String bookID = book.bookingID = "BOOK2025" + roomNumber + "3";
        String guestID = guest.guestID = "GUEST2025" + "4" + roomNumber;

        String name = JOptionPane.showInputDialog("What is your name?");
        String contactNumber = JOptionPane.showInputDialog("What is your contact number?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        String email = JOptionPane.showInputDialog("What is your email address?");
        
        guest = new Guest(name, contactNumber, age, guestID, email);
        PrintWriter writer = new PrintWriter("receipts.txt");
        writer.write(guest.summary());
    }
}

// String name, String contactNumber, int age, String guestID, String email 