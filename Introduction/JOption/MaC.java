import javax.swing.JOptionPane;

public class MaC{
    public static void main(String [] args) {
        String movieName = JOptionPane.showInputDialog("Enter the movie name:");
                 // Parsing is very important else it will be automated into a string
        double adultTicketPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of an adult ticket:"));
        double childTicketPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of a child ticket:"));
        double donationPercentage = Double.parseDouble(JOptionPane.showInputDialog("Enter the percentage of gross amount to donate:"));
        int adultTicketsSold = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of adult tickets sold:"));
        int childTicketsSold = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of child tickets sold:"));

        // Calculations
        double grossAmount = (adultTicketPrice * adultTicketsSold) + (childTicketPrice * childTicketsSold);
        double amountDonated = grossAmount * (donationPercentage / 100);
        double netSales = grossAmount - amountDonated;
        // Results
        String message = String.format(
            "Movie Name: %s\n" +
            "Number of Tickets Sold: %d\n" +
            "Gross Amount: $%.2f\n" +
            "Percentage of the Gross Amount Donated: %.2f%%\n" +
            "Amount Donated: $%.2f\n" +
            "Net Sale: $%.2f",
            movieName, 
            adultTicketsSold + childTicketsSold, 
            grossAmount, 
            donationPercentage, 
            amountDonated, 
            netSales
        );
        JOptionPane.showMessageDialog(null, message, "Theater Sales Data", JOptionPane.INFORMATION_MESSAGE);
    }
}

