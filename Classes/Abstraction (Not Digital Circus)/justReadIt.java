import javax.swing.*;

public class justReadIt {
    public static void main(String[] args) {
        Human human = new Human("Humanae", "Realest", 2);
            JOptionPane.showMessageDialog(null, human.intro());
            human.move();
            human.noise();
        Cat cat = new Cat(true, "Catae", "Federico Liwanag VII", 3);
            JOptionPane.showMessageDialog(null, cat.intro());
            cat.owned();
            cat.move();
            cat.noise();
        Dog dog = new Dog(false, "Dogae", "Gabril", 2);
            JOptionPane.showMessageDialog(null, dog.intro());
            dog.owned();
            dog.move();
            dog.noise();
        Bird bird = new Bird(true, "Birdae", "Skyler", 1);
            JOptionPane.showMessageDialog(null, bird.intro());
            bird.owned();
            bird.move();
            bird.noise();
    }
}