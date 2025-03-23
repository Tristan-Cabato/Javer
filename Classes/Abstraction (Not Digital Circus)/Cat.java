import javax.swing.*;
public class Cat extends Pet {
    public Cat(boolean hasOwner, String kingdom, String name, double lifespan) {
        super(hasOwner, kingdom, name, lifespan);
    }

    @Override
    void owned() {
        JOptionPane.showMessageDialog(null, isOwned() ? "Do not adopt me" : "Adopt me");
    }

    @Override
    String intro() {
        return """
                Name: %s
                Kingdom: %s
                Lifespan: %f
                """.formatted(getName(), getKingdom(), getLifespan());
    }

    @Override
    void move() {
        JOptionPane.showMessageDialog(null, "Treads");
    }

    @Override
    void noise() {
        JOptionPane.showMessageDialog(null, "Meows");
    }
}
