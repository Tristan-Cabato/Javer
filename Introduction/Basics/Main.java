// A store thing

import java.util.*;

public class Main {
    public static void clear() {
        System.out.println("\n".repeat(5) + "---------------Receipt---------------");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Store Name: ");
        String store_name = inp.nextLine();
        System.out.printf("First Item: ");
        String i1 = inp.nextLine();
        System.out.printf("Second Item: ");
        String i2 = inp.nextLine();
        System.out.printf("Third Item: ");
        String i3 = inp.nextLine();

        System.out.printf("Price of " + i1 + ": ");
        double p1 = inp.nextDouble();
        System.out.printf("Price of " + i2 + ": ");
        double p2 = inp.nextDouble();
        System.out.printf("Price of " + i3 + ": ");
        double p3 = inp.nextDouble();

        System.out.printf("Tax Rate: ");
        double tax = inp.nextDouble();
        inp.close();

        double sum = p1 + p2 + p3;
        double taxAmount = tax * sum;
        double total = sum + taxAmount;

        clear();
        System.out.printf(store_name + "\n"
            + i1 + "     " + p1 + "\n"
            + i2 + "     " + p2 + "\n"
            + i3 + "     " + p3 + "\n"
            + "     ---------\n"
            + "SUM     " + sum + "\n"
            + "TAX     " + taxAmount + "\n"
            + "     ---------\n"
            + "TOTAL   " + total);
    }
}
