import java.io.*;
import javax.swing.JOptionPane;

public class Cabato_LabAct1 { 
    public static void main(String[] args) throws FileNotFoundException {
        // ---------------- Inputs ---------------------------
        String name = JOptionPane.showInputDialog("Enter your name (Two words): ");
            int blank = name.indexOf(' ');
            name = name.substring(0, blank) + '-' + name.substring(blank + 1);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String phoneNumber = JOptionPane.showInputDialog("Enter your phone number: ");
        String occupation = JOptionPane.showInputDialog("Enter your occupation (Two words): ");
            blank = occupation.indexOf(' ');
            occupation = occupation.substring(0, blank) + '-' + occupation.substring(blank + 1);
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Salary: "));
        String homeAddress = JOptionPane.showInputDialog("Enter your Home Address (One word): "); 
        String currAddress = JOptionPane.showInputDialog("Enter your Current Address (One word): "); 
        String emergencyName = JOptionPane.showInputDialog("Enter Name of Emergecy Contact: (Two words)");
            blank = emergencyName.indexOf(' ');
            emergencyName = emergencyName.substring(0, blank) + '-' + emergencyName.substring(blank + 1);
        String emerContact = JOptionPane.showInputDialog("Enter Emergecy Contact Number: ");
    
    PrintWriter writer = new PrintWriter("personalInfo.txt");

    writer.write(name + " ");
    writer.write(age + " ");
    writer.write(phoneNumber + " ");
    writer.write(occupation + " ");
    writer.write(salary + " ");
    writer.write(homeAddress + " ");
    writer.write(currAddress + " ");
    writer.write(emergencyName + " ");
    writer.write(emerContact);
    writer.close();


    // ---------------- Formatting ------------

    int hyphen = name.indexOf("-");
            name = name.substring(0,1).toUpperCase() + name.substring(1, hyphen).toLowerCase() + " " +
                   Character.toUpperCase(name.charAt(hyphen + 1)) + 
                   name.substring(hyphen + 2).toLowerCase();

    phoneNumber = phoneNumber.substring(0,4).concat(" ").concat(phoneNumber.substring(4,8)).concat(" ").concat(phoneNumber.substring(8));

            hyphen = occupation.indexOf("-");
            occupation = occupation.substring(0,1).toUpperCase() + occupation.substring(1, hyphen).toLowerCase() + " " +
            Character.toUpperCase(occupation.charAt(hyphen + 1)) + 
            occupation.substring(hyphen + 2).toLowerCase();


    homeAddress = homeAddress.substring(0,1).toUpperCase() + homeAddress.substring(1).toLowerCase();

            currAddress = currAddress.substring(0,1).toUpperCase() + currAddress.substring(1).toLowerCase();

            hyphen = emergencyName.indexOf("-");
            emergencyName = emergencyName.substring(0,1).toUpperCase() + emergencyName.substring(1, hyphen).toLowerCase() + " " +
                Character.toUpperCase(emergencyName.charAt(hyphen + 1)) +
                emergencyName.substring(hyphen + 2).toLowerCase();

    emerContact = emerContact.substring(0,4).concat(" ").concat(emerContact.substring(4,8)).concat(" ").concat(emerContact.substring(8));


    String result = """
        Name: %s
        Age: %d
        Phn No.: %s
        ------------------------------
        Occupation: %s
        Salary:		$ %.3f
        Tax 25%%: 	$ %.3f
        Aft Deduc:	$ %.3f
        ------------------------------
        Home: 		%s
        Current:	%s
        ------------------------------
        Emrgncy Cont: %s
        Emrgncy No.: %s
        """.formatted(name, age, phoneNumber, occupation, salary, salary * 0.25, salary - (salary * 0.25), homeAddress,currAddress,emergencyName,emerContact);

    JOptionPane.showMessageDialog(null, result);
    }
}
