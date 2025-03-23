public abstract class Animal {
    private String kingdom, name;
    private double lifespan;

    public Animal(String kingdom, String name, double lifespan) {
        this.kingdom = kingdom;
        this.lifespan = lifespan;
    }
    
    public String getKingdom() {
        return kingdom;
    }

    public double getLifespan() {
        return lifespan;
    }

    public String getName() {
        return name;
    }

    abstract String intro();
    abstract void noise();
    abstract void move();
}