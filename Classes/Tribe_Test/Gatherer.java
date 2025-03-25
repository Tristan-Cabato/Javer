public class Gatherer extends Tribemen {
    private boolean collectsMedicinalPlants;
    private String preferredSeason;

    public Gatherer(String name, String tribe, boolean collectsMedicinalPlants, String preferredSeason) {
        super(name, tribe);
        this.collectsMedicinalPlants = collectsMedicinalPlants;
        this.preferredSeason = preferredSeason;
    }

    boolean isCollectsMedicinalPlants() {
        return collectsMedicinalPlants;
    }

    String getPreferredSeason() {
        return preferredSeason;
    }

    String introduction() {
        return """
            %s      %s      %b       %s
            """.formatted(getName(), getTribe(), isCollectsMedicinalPlants(), getPreferredSeason());
    }
}