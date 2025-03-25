import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Displays disp = new Displays();

        while (true) {
            String role = disp.typeOfRole();
                if (role.equalsIgnoreCase("Hunter")) {
                    disp.displayCompleteSummary(role);
                } else if (role.equalsIgnoreCase("Gatherer")) {
                    disp.displayCompleteSummary(role);
                } else if (role.equalsIgnoreCase("Farmer")) {
                    disp.displayCompleteSummary(role);
                } else if (role.equalsIgnoreCase("End")) {
                    JOptionPane.showMessageDialog(null, "Exiting program");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Input");
                }
        }
    }
}