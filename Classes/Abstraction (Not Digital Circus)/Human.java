
import javax.swing.JOptionPane;
public class Human extends Animal {
    public Human(String kingdom, String name, double lifespan) {
        super(kingdom, name, lifespan);
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
        JOptionPane.showMessageDialog(null, "Politics");
    }

    @Override
    void noise() {
        JOptionPane.showMessageDialog(null, "Yaps");
    }
}