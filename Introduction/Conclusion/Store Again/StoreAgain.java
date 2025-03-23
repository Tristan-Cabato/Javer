
import java.io.*;
import java.util.Scanner;

public class StoreAgain {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner entry = new Scanner(new FileReader("entry.txt"));
        
        String name1 = entry.next();
        String name2 = entry.next();
        String name3 = entry.next();

        String itm1 = entry.next();
        double prc1 = entry.nextDouble();

        String itm2 = entry.next();
        double prc2 = entry.nextDouble();

        String itm3 = entry.next();
        double prc3 = entry.nextDouble();

        entry.close();

        double total = prc1 + prc2 + prc3;
        double tax = 0;

        if (total > 200) {
            tax = 0.25;
        } else if (total > 100) {
            tax = 0.14;
        } else if (total > 50) {
            tax = 0.10;
        }
    
        String storeName = (name1.compareTo(name2) > 0)
        ? ((name1.compareTo(name3) > 0) ? name1 : name3)
        : ((name2.compareTo(name3) > 0) ? name2 : name3);
        storeName = storeName.substring(0, 1).toUpperCase() + storeName.substring(1);

        String output = """
                %s's store

                %s  %.2f
                %s  %.2f
                %s  %.2f
                ----------------------
                Subtotal:   %.2f
                Taxed:  %.2f
                ----------------------
                Total: %.2f
                """.formatted(storeName, itm1, prc1, itm2, prc2, itm3, prc3, total, total * tax, total + (total * tax));

        PrintWriter bruh = new PrintWriter("result.txt");
        bruh.write(output);
        bruh.close();
    }
}
