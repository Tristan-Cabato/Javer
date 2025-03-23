public abstract class Pet extends Animal {
    boolean hasOwner;
    // There is supposed to be the breed here but idc

    public Pet(boolean hasOwner, String kingdom, String name, double lifespan) {
        super(kingdom, name, lifespan);
        this.hasOwner = hasOwner;
    }

    public boolean isOwned() {
        return hasOwner;
    }

    abstract void owned();
}