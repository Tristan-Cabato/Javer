public class Farmer extends Tribemen {
    double fieldSize;
    String cropType;

    Farmer(String name, String tribe, double fieldSize, String cropType) {
        super(name, tribe);
        this.fieldSize = fieldSize;
        this.cropType = cropType;
    }
    double getFieldSize() {
        return fieldSize;
    }
    String getCropType() {
        return cropType;
    }

    String introduction() {
        return """
                Name: %s
                Tribe: %s
                Field Size: %f
                Crop Type: %s
                """.formatted(getName(), getTribe(), getFieldSize(), getCropType());
    }
}
