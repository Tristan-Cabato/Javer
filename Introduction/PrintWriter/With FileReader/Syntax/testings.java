import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class testings {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("C:\\Users\\tcabato\\Desktop\\asdkoiajsdijasdoiajd\\JOption\\nameFile.txt"));
        FileWriter output = new FileWriter("C:\\Users\\tcabato\\Desktop\\asdkoiajsdijasdoiajd\\JOption\\outputFile.txt");

        String brainrot = sc.nextLine();  
        int streak = sc.nextInt();
        double what = sc.nextDouble();
        sc.close();

        JOptionPane.showMessageDialog(null, "He is " + brainrot + ", " + streak + " days streak with " + what + " on earth is this number", "Message", JOptionPane.INFORMATION_MESSAGE);        
    }    
}
