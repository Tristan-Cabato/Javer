public class Hunter extends Tribemen {
    private String weapon;
    private int skillLevel;

    public Hunter(String name, String tribe, String weapon, int skillLevel) {
        super(name, tribe);
        this.weapon = weapon;
        this.skillLevel = skillLevel;
    }

    String getWeapon() {
        return weapon;
    }

    int getSkillLevel() {
        return skillLevel;
    }


    String introduction() {
        return """
            Name:   Tribe:  Weapon:  Skill:
            %s      %s      %s       %d \n
            """.formatted(getName(), getTribe(), getWeapon(), getSkillLevel());
    }
}
