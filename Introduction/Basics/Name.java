// String formatting

import java.util.*;

public class Name {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Name: ");
      String name = sc.nextLine();

      System.out.print("Enter Age: ");
      String age = sc.nextLine();

      System.out.print("Enter Course: ");
      String course = sc.nextLine();

      System.out.print("Enter Section: ");
      String section = sc.nextLine();
      
      System.out.println("\n\n\n");
      System.out.printf("Name: %s\n Age: %s\n Course: %s\n Section: %s\n", name, age, course, section);
    }
}
