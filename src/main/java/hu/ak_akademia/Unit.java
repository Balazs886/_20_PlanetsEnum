package hu.ak_akademia;

public enum Unit {
    RADIUS("km"), SOURFACE("km\u00b2"), MASS("kg"), VOLUME("km\u00b3"), DENSITY("kg/dm\u00b3"), DIFFICULTY_ACCELERATION("m/s\u00b2"), ESCAPE_VELOCITY("km/s");

    private final String unit;

    Unit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return unit;
    }
}
