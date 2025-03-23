import javax.swing.*;

public class callMe {
    public static void main(String[] args) {
        while (true) {
            String Choice = JOptionPane.showInputDialog("Type \"Calculate\" or \"Introduce\"");
            if (Choice.equalsIgnoreCase("Calculate")) {
                int calChoice = Integer.parseInt(JOptionPane.showInputDialog("""
                        [1] Add
                        [2] Subtract
                        [3] Multiply
                        [4] Divide
                        [5] Back
                        """));
                switch (calChoice) {
                    case 1:
                        double firstInput = Double.parseDouble(JOptionPane.showInputDialog("Input first number"));
                        double secondInput = Double.parseDouble(JOptionPane.showInputDialog("Input second number"));
                        JOptionPane.showMessageDialog(null, add(firstInput, secondInput));
                        break;
                    case 2:
                        firstInput = Double.parseDouble(JOptionPane.showInputDialog("Input first number"));
                        secondInput = Double.parseDouble(JOptionPane.showInputDialog("Input second number"));
                        JOptionPane.showMessageDialog(null, subtract(firstInput, secondInput));
                        break;
                    case 3:
                        firstInput = Double.parseDouble(JOptionPane.showInputDialog("Input first number"));
                        secondInput = Double.parseDouble(JOptionPane.showInputDialog("Input second number"));
                        JOptionPane.showMessageDialog(null, multiply(firstInput, secondInput));
                        break;
                    case 4:
                        firstInput = Double.parseDouble(JOptionPane.showInputDialog("Input first number"));
                        secondInput = Double.parseDouble(JOptionPane.showInputDialog("Input second number"));
                        JOptionPane.showMessageDialog(null, divide(firstInput, secondInput));
                        break;
                    case 5:
                        continue;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Input");
                        continue;
                }
            } else if (Choice.equalsIgnoreCase("Introduce")) {
                int introduceChoice = Integer.parseInt(JOptionPane.showInputDialog("""
                        [1] Name only
                        [2] Name and age
                        [3] Name, age and course
                        [4] Back
                        """));
                switch (introduceChoice) {
                    case 1:
                        String name = JOptionPane.showInputDialog("Input name");
                        Introduce(name);
                        break;
                    case 2:
                        name = JOptionPane.showInputDialog("Input name");
                        double age = Double.parseDouble(JOptionPane.showInputDialog("Input your age"));
                        Introduce2(name, age);
                        break;
                    case 3:
                        name = JOptionPane.showInputDialog("Input name");
                        age = Double.parseDouble(JOptionPane.showInputDialog("Input your age"));
                        String course = JOptionPane.showInputDialog("Input your course");
                        Introduce3(name, age, course);
                        break;
                    case 4:
                        continue;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Input");
                    }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Dialogue, exiting");
                break;
            }
        }
    }
public static double add(double x, double y) {
    return x + y;
}
public static double subtract(double x, double y) {
    return x - y;
}
public static double multiply(double x, double y) {
    return x * y;
}
public static double divide(double x, double y) {
    return x / y;
}
public static double add(double x, double y) {
    return x + y;
}
public static double subtract(double x, double y) {
    return x - y;
}
public static double multiply(double x, double y) {
    return x * y;
}
public static double divide(double x, double y) {
    return x / y;
}

public static void Introduce(String name) {
    JOptionPane.showMessageDialog(null, name);
}
public static void Introduce2(String name, double age) {
        String message = name + " is " + age + " years old.";
        JOptionPane.showMessageDialog(null, message);
}
public static void Introduce3(String name, double age, String course) {
    String message = name + " is " + age + " years old, belonging in the " + course + " Program.";
    JOptionPane.showMessageDialog(null, message);
}
}

// This actually failed, I still don't know how to make the input dialog accept either float or integer dynamically, no, parseNumber is not allowed, and yes, just reading it with a string is possible, I was just too lazy.