public abstract class Tribemen {
    private String name, tribe;

    public Tribemen(String name, String tribe) {
        this.name = name;
        this.tribe = tribe;
    }

    String getName() {
        return name;
    }
    String getTribe() {
        return tribe;
    }

    abstract String introduction();
}
