import java.io.*;
import java.util.*;

public class LastName {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner names = new Scanner(new FileReader("names.txt"));
        PrintWriter output = new PrintWriter("output.txt");

        output.write("Group 1: ");
        while (names.hasNextLine()) {
            String name = names.nextLine();
            if (name.length() % 2 == 0 && name.length() % 3 == 0) {
                output.write(name + " ");
            }
        }
        output.println();

        names = new Scanner(new FileReader("names.txt"));
        output.write("Group 2: ");
        while (names.hasNextLine()) {
            String name = names.nextLine();
            if (!(name.length() % 2 == 0 && name.length() % 3 == 0) && name.length() > 7) {
                output.write(name + " ");
            }
        }
        output.println();

        names = new Scanner(new FileReader("names.txt"));
        output.write("Group 3: ");
        while (names.hasNextLine()) {
            String name = names.nextLine();
            if (!(name.length() % 2 == 0 && name.length() % 3 == 0 || name.length() > 7) && name.length() % 5 == 0) {
                output.write(name + " ");
            }
        }
        output.println();

        names = new Scanner(new FileReader("names.txt"));
        output.write("Group 4: ");
        while (names.hasNextLine()) {
            String name = names.nextLine();
            if (!(name.length() % 2 == 0 && name.length() % 3 == 0 || name.length() > 7 || name.length() % 5 == 0) && name.length() % 2 == 0) {
                output.write(name + " ");
            }
        }
        output.println();

        names = new Scanner(new FileReader("names.txt"));
        output.write("Group 5: ");
        while (names.hasNextLine()) {
            String name = names.nextLine();
            if (!(name.length() % 2 == 0 && name.length() % 3 == 0 || name.length() > 7 || name.length() % 5 == 0 || name.length() % 2 == 0)) {
                output.write(name + " ");
            }
        }

        names.close();
        output.close();
    }
}

/*
 Group 1: divisible by 2 and 3
 Group 2: greater than 7 
 Group 3: divisible by 5
 Group 4: divisible by 2 
 Group 5: odd 
 */
