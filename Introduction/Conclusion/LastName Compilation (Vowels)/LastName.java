import java.io.*;
import java.util.*;

public class LastName {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner names = new Scanner(new FileReader("names.txt"));
        PrintWriter output = new PrintWriter("output.txt");

        output.write("Group 1: ");
        while (names.hasNextLine()) {
            String lastName = names.nextLine();
            char first = lastName.charAt(0);
            char last = lastName.charAt(lastName.length() - 1);

            boolean startsWithVowel = (first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U' || first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u');
            boolean endsWithVowel = (last == 'A' || last == 'E' || last == 'I' || last == 'O' || last == 'U' || last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u');

            if (startsWithVowel && endsWithVowel) {
                output.write(lastName + " ");
            }
        }

        names = new Scanner(new FileReader("names.txt")); 
        output.println();
        output.write("Group 2: ");
        while (names.hasNextLine()) {
            String lastName = names.nextLine();
            char first = lastName.charAt(0);
            char last = lastName.charAt(lastName.length() - 1);

            boolean startsWithVowel = (first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U' || first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u');
            boolean endsWithVowel = (last == 'A' || last == 'E' || last == 'I' || last == 'O' || last == 'U' || last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u');

            if (startsWithVowel && !endsWithVowel) {
                output.write(lastName + " ");
            }
        }

        names = new Scanner(new FileReader("names.txt")); 
        output.println();
        output.write("Group 3: ");
        while (names.hasNextLine()) {
            String lastName = names.nextLine();
            char first = lastName.charAt(0);
            char last = lastName.charAt(lastName.length() - 1);

            boolean startsWithVowel = (first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U' || first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u');
            boolean endsWithVowel = (last == 'A' || last == 'E' || last == 'I' || last == 'O' || last == 'U' || last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u');

            if (!startsWithVowel && endsWithVowel) {
                output.write(lastName + " ");
            }
        }

        names = new Scanner(new FileReader("names.txt")); 
        output.println();
        output.write("Group 4: ");
        while (names.hasNextLine()) {
            String lastName = names.nextLine();
            char first = lastName.charAt(0);
            char last = lastName.charAt(lastName.length() - 1);

            boolean startsWithVowel = (first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U' || first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u');
            boolean endsWithVowel = (last == 'A' || last == 'E' || last == 'I' || last == 'O' || last == 'U' || last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u');

            if (!startsWithVowel && !endsWithVowel) {
                output.write(lastName + " ");
            }
        }

        names.close();
        output.close();
    }
}

// I know, I can use a string instead of whatever the fuck that is on top. Didn't cross my mind lowk.
