import java.io.*;
import javax.swing.JOptionPane;

public class subRemove {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String sentence = JOptionPane.showInputDialog("Input a sentence: ");
        int start = Integer.parseInt(JOptionPane.showInputDialog(("First Index: ")));
        int last = Integer.parseInt(JOptionPane.showInputDialog(("last Index: ")));

        PrintWriter writer = new PrintWriter("output.txt");
            writer.write(sentence.substring(start, last));
        writer.close();
        }
}
