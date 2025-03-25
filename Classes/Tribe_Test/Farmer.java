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
            Name:   Tribe:  Field Size:  Crop Type:
            %s      %s      %f       %s \n
            """.formatted(getName(), getTribe(), getFieldSize(), getCropType());
    }
}