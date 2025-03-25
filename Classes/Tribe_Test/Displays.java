import javax.swing.JOptionPane;

public class Displays {
    private static int roleCount = 0;
    private static String hunters = """
    ======= Hunter =======
    Name:   Tribe:  Weapon:  Skill:
    
    """;
    private static String gatherers = """
    ======= Gatherers =======
    Name:   Tribe:  Collects Medicinal Plants:  Preferred Season:
    
    """;
    private static String farmers = """
    ======= Farmers =======
    Name:   Tribe:  Field Size:  Crop Type:
    
    """;
    private static String results = """
            %s
            %s
            %s
            """.formatted(hunters, gatherers, farmers);

    String typeOfRole() {
        String choice = JOptionPane.showInputDialog("""
                Type in the role inside the quotation to select
                Current number of roles: [%d]
        
                [1] "Hunter"
                [2] "Gatherer"
                [3] "Farmer"
                [4] "End"
                """.formatted(roleCount));
        return choice;
    }

    Hunter createHunter() {
        String name = JOptionPane.showInputDialog("Input name: ");
        String tribe = JOptionPane.showInputDialog("Input tribe name: ");
        String weapon = JOptionPane.showInputDialog("Input weapon: ");
        int skill = Integer.parseInt(JOptionPane.showInputDialog("Input skill level: "));
        roleCount++;

        return new Hunter(name, tribe, weapon, skill);
    }

    Gatherer createGatherer() {
        boolean meds;

        String name = JOptionPane.showInputDialog("Input name: ");
        String tribe = JOptionPane.showInputDialog("Input tribe name: ");
        String medChoice = JOptionPane.showInputDialog("""
                Does the gatherer collect medicine?

                Type either "Yes" or "No"
                """);
                if (medChoice.equalsIgnoreCase("yes")) {
                    meds = true;
                } else if (medChoice.equalsIgnoreCase("no")) {
                    meds = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Input, defaulted to no");
                    meds = false;
                }
        String season = JOptionPane.showInputDialog("Input preferred season: ");
        roleCount++;

        return new Gatherer(name, tribe, meds, season);
    }

    Farmer createFarmer() {
        String name = JOptionPane.showInputDialog("Input name: ");
        String tribe = JOptionPane.showInputDialog("Input tribe name: ");
        double field = Double.parseDouble(JOptionPane.showInputDialog("Input field size: "));
        String crop = JOptionPane.showInputDialog("Input Crop Type: ");
        roleCount++;

        return new Farmer(name, tribe, field, crop);
    }

    void displayCompleteSummary(String x) {
        x = x.toLowerCase();

        switch (x) {
            case "hunter":
                Hunter hunter = createHunter();
                hunters += hunter.introduction();
                break;
            case "gatherer":
                Gatherer gatherer = createGatherer();
                gatherers += gatherer.introduction();
                break;
            case "farmer":
                Farmer farmer = createFarmer();
                farmers += farmer.introduction();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Impossible Output");
        }
        results = """
            %s
            %s
            %s
            """.formatted(hunters, gatherers, farmers);
        JOptionPane.showMessageDialog(null, results);
    }
}

/* String name, String tribe, String weapon, int skillLevel) { */
/* ublic Gatherer(String name, String tribe, boolean collectsMedicinalPlants, String preferredSeason) { */
/*  public Farmer(String name, String tribe, double fieldSize, String cropType) { */